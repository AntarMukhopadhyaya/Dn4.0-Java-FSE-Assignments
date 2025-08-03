import "./App.css";
import { useState } from "react";
import UserView from "./UserView";
import { GuestView } from "./GuestView";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  // Element variable for header
  const greetingHeader = isLoggedIn ? (
    <h2>Welcome Back, User!</h2>
  ) : (
    <h2>Welcome, Guest!</h2>
  );

  return (
    <div className="App">
      <header>
        <h1>Ticket Booking App</h1>
        {greetingHeader} {/* element variable used here */}
        <div className="auth-buttons">
          {isLoggedIn ? (
            <button onClick={() => setIsLoggedIn(false)}>Logout</button>
          ) : (
            <button onClick={() => setIsLoggedIn(true)}>Login</button>
          )}
        </div>
      </header>

      <main>{isLoggedIn ? <UserView /> : <GuestView />}</main>
    </div>
  );
}

export default App;
