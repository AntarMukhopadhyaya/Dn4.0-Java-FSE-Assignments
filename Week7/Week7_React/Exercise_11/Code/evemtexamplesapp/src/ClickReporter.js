import React, { useState } from "react";

const ClickReporter = () => {
  const [text, setText] = useState("");

  const handleClick = (event) => {
    // Synthetic event: React wraps the native event
    setText("I was clicked");
    // you can inspect event if needed
    // console.log(event);
  };

  return (
    <div>
      <button onClick={handleClick}>Press Me</button>
      {text && <p>{text}</p>}
    </div>
  );
};

export default ClickReporter;
