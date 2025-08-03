import React from "react";

/**
 * Generic list renderer that enforces use of keys.
 * Props:
 *   - items: array of data
 *   - renderItem: function(item) => JSX for that item
 *   - getKey: function(item) => unique key
 */
export const ListWithKeys = ({ items, renderItem, getKey }) => {
  if (!Array.isArray(items) || items.length === 0) {
    return <p>No items to display.</p>; // conditional early return
  }

  return (
    <div className="list-container">
      {items.map((it) => (
        <div key={getKey(it)} className="list-item">
          {renderItem(it)}
        </div>
      ))}
    </div>
  );
};
