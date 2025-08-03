import React, { useState } from "react";
import { BookingForm } from "./BookingForm";
import { FlightList } from "./FlightList";

export const UserView = () => {
  const [selectedFlight, setSelectedFlight] = useState(null);

  return (
    <div className="box">
      <h3>Book Your Ticket</h3>
      <p>Select a flight and proceed to booking.</p>
      <FlightList onSelect={setSelectedFlight} />

      {/* Prevent rendering of BookingForm if no flight is selected */}
      {selectedFlight ? (
        <BookingForm flight={selectedFlight} />
      ) : (
        <p>Please select a flight to see booking options.</p>
      )}
    </div>
  );
};

export default UserView;
