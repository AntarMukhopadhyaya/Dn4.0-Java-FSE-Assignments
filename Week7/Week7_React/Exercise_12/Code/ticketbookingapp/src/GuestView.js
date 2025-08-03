import React from "react";
import { FlightList } from "./FlightList";

export const GuestView = () => {
  return (
    <div className="box">
      <h3>Browse Flights (Guest)</h3>
      <p>You can view available flights. Please login to book.</p>
      <FlightList />
    </div>
  );
};
