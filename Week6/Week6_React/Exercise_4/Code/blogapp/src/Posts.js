import { Component } from "react";
import { Post } from "./Post";


export class Posts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false,
            errorMessage: ""
        };
    }
    loadPosts = () => {
        fetch('https://jsonplaceholder.typicode.com/posts')

            .then(response => response.json())
            .then(data => {
                this.setState({ posts: data });
            }).catch(error => {
                console.error("Error fetching posts", error)
            });
    };
    componentDidMount() {
        this.loadPosts();
    }
    componentDidCatch(error, info) {
        this.setState({ hasError: true, errorMessage: error.toString() });
        alert("Ant error occured: " + error.toString());
    }
    render() {
        if (this.state.hasError) {
            return <h2>Something went wrong: {this.state.errorMessage}</h2>
        }
        return (
            <div>
                <h2>Posts: {this.state.posts.length}</h2>
                {this.state.posts.map(post => (
                    <Post key={post.id} title={post.title} body={post.body} />
                ))}
            </div>
        )
    }
}
