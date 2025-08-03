import React, { useState } from "react";

const CurrencyConvertor = () => {
  const [inr, setInr] = useState("");
  const [eur, setEur] = useState("");
  const [result, setResult] = useState("");

  // Example fixed rate: 1 EUR = 90 INR
  const rate = 90;

  const handleSubmitInrToEur = (e) => {
    e.preventDefault(); // synthetic event
    const inrVal = parseFloat(inr);
    if (isNaN(inrVal)) {
      setResult("Please enter a valid INR amount.");
      return;
    }
    const converted = (inrVal / rate).toFixed(2);
    setResult(`₹${inrVal.toLocaleString()} = €${converted}`);
  };

  const handleSubmitEurToInr = (e) => {
    e.preventDefault();
    const eurVal = parseFloat(eur);
    if (isNaN(eurVal)) {
      setResult("Please enter a valid EUR amount.");
      return;
    }
    const converted = (eurVal * rate).toFixed(2);
    setResult(`€${eurVal} = ₹${parseFloat(converted).toLocaleString()}`);
  };

  return (
    <div>
      <form onSubmit={handleSubmitInrToEur}>
        <div>
          <label>
            INR:{" "}
            <input
              type="number"
              value={inr}
              onChange={(e) => setInr(e.target.value)}
              placeholder="Amount in INR"
            />
          </label>
          <button type="submit">Convert to EUR</button>
        </div>
      </form>

      <form onSubmit={handleSubmitEurToInr} style={{ marginTop: "10px" }}>
        <div>
          <label>
            EUR:{" "}
            <input
              type="number"
              value={eur}
              onChange={(e) => setEur(e.target.value)}
              placeholder="Amount in EUR"
            />
          </label>
          <button type="submit">Convert to INR</button>
        </div>
      </form>

      {result && <p className="conversion-result">{result}</p>}
    </div>
  );
};

export default CurrencyConvertor;
