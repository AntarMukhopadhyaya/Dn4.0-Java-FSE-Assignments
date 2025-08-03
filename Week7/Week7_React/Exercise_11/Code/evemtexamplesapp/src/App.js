import React from "react";
import "./App.css";
import Counter from "./Counter";
import WelcomeButton from "./WelcomeButton";
import ClickReporter from "./ClickReporter";
import CurrencyConvertor from "./CurrencyConverter";

function App() {
  return (
    <div className="App">
      <header>
        <h1>Event Examples App</h1>
      </header>

      <section className="box">
        <h2>1. Counter with Multiple Handlers</h2>
        <Counter />
      </section>

      <section className="box">
        <h2>2. Say Welcome</h2>
        <WelcomeButton />
      </section>

      <section className="box">
        <h2>3. Synthetic Event Reporter</h2>
        <ClickReporter />
      </section>

      <section className="box">
        <h2>4. Currency Convertor (INR ↔ EUR)</h2>
        <CurrencyConvertor />
      </section>
    </div>
  );
}

export default App;
