import React, { useState } from "react";

const WelcomeButton = () => {
  const [display, setDisplay] = useState("");

  const sayWelcome = (msg) => {
    setDisplay(`Message received: ${msg}`);
  };

  return (
    <div>
      <button onClick={() => sayWelcome("welcome")}>Say Welcome</button>
      {display && <p>{display}</p>}
    </div>
  );
};

export default WelcomeButton;
