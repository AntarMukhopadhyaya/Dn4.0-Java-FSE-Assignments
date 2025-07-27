import { Component } from "react";


export class Post extends Component {
    render(){
        const {title,body} = this.props;
        return(
            <div>
                <h3>{title}</h3>
                <p>{body}</p>
            </div>
        );
    }
}
