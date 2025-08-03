import React from "react";
import { ListWithKeys } from "./ListWithKeys";

const blogs = [
  {
    slug: "react-hooks",
    title: "Understanding React Hooks",
    author: "Alice",
    views: 12000,
  },
  {
    slug: "es6-features",
    title: "ES6 Features You Should Know",
    author: "Bob",
    views: 8000,
  },
  {
    slug: "performance",
    title: "Optimizing React Performance",
    author: "Carol",
    views: 5400,
  },
];

export const BlogDetails = () => {
  return (
    <div className="section">
      <h2>Blog Details</h2>
      <p>Recent technical blog posts:</p>
      <ListWithKeys
        items={blogs}
        renderItem={(blog) => (
          <div className="card">
            <h4>{blog.title}</h4>
            <p>By: {blog.author}</p>
            <p>Views: {blog.views.toLocaleString()}</p>
          </div>
        )}
        getKey={(blog) => blog.slug}
      />
    </div>
  );
};
