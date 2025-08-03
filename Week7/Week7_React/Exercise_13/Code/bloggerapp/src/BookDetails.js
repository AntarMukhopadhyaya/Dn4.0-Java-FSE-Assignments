import React from "react";
import { ListWithKeys } from "./ListWithKeys";

const books = [
  { id: "b1", title: "Clean Code", author: "Robert C. Martin", rating: 4.7 },
  { id: "b2", title: "You Don’t Know JS", author: "Kyle Simpson", rating: 4.5 },
  {
    id: "b3",
    title: "JavaScript - The Bad Parts",
    author: "Douglas Crockford",
    rating: 4.2,
  },
];

export const BookDetails = () => {
  return (
    <div className="section">
      <h2>Book Details</h2>
      <p>Top recommended programming books:</p>
      <ListWithKeys
        items={books}
        renderItem={(book) => (
          <div className="card">
            <h4>{book.title}</h4>
            <p>Author: {book.author}</p>
            <p>Rating: {book.rating}</p>
          </div>
        )}
        getKey={(book) => book.id}
      />
    </div>
  );
};
