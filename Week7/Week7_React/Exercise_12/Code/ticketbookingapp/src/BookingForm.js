import React, { useState } from "react";

export const BookingForm = ({ flight }) => {
  // Prevent rendering entirely if flight prop is missing (defensive)

  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [confirmed, setConfirmed] = useState(false);
  if (!flight) {
    return null; // demonstrates preventing component render
  }

  const handleSubmit = (e) => {
    e.preventDefault();
    // mock booking action
    setConfirmed(true);
  };

  return (
    <div className="booking-form">
      <h4>Booking for:</h4>
      <p>
        {flight.from} → {flight.to} at {flight.time} for ₹
        {flight.price.toLocaleString()}
      </p>
      {!confirmed ? (
        <form onSubmit={handleSubmit}>
          <div>
            <label>
              Name:{" "}
              <input
                required
                type="text"
                value={name}
                onChange={(e) => setName(e.target.value)}
              />
            </label>
          </div>
          <div>
            <label>
              Email:{" "}
              <input
                required
                type="email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
              />
            </label>
          </div>
          <button type="submit">Confirm Booking</button>
        </form>
      ) : (
        <p className="success">
          Booking confirmed for {name}! A confirmation has been sent to {email}.
        </p>
      )}
    </div>
  );
};
