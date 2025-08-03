import React from "react";
import "./App.css";
import { ListofPlayers } from "./ListOfPlayers";
import IndianPlayers from "./IndianPlayers";
function App() {
  // Flag controls whether both components are shown
  const flag = true;

  return (
    <div className="App">
      <header>
        <h1>Cricket App</h1>
      </header>

      {flag ? (
        <>
          <ListofPlayers />
          <IndianPlayers />
        </>
      ) : (
        <p>The flag is false. Components are hidden.</p>
      )}
    </div>
  );
}

export default App;
