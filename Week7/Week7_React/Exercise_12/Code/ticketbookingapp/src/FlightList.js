import React from "react";

const flights = [
  { id: 1, from: "Mumbai", to: "Dubai", time: "08:00", price: 15000 },
  { id: 2, from: "Delhi", to: "London", time: "22:30", price: 65000 },
  { id: 3, from: "Bengaluru", to: "Singapore", time: "14:15", price: 30000 },
];

export const FlightList = ({ onSelect }) => {
  return (
    <div className="flight-list">
      {flights.map((f) => (
        <div key={f.id} className="flight-card">
          <p>
            <strong>{f.from}</strong> → <strong>{f.to}</strong>
          </p>
          <p>Departure: {f.time}</p>
          <p>Price: ₹{f.price.toLocaleString()}</p>
          {onSelect && (
            <button onClick={() => onSelect(f)}>Select Flight</button>
          )}
        </div>
      ))}
    </div>
  );
};
