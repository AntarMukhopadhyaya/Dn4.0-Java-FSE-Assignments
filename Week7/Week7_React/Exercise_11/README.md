# Event Examples App

A React application demonstrating event handling concepts including React events, event handlers, synthetic events, usage of `this`, and basic form event handling.

## Objectives Covered

- **Explain React events:** All interactions (clicks, form submissions) use React's event system (`onClick`, `onSubmit`), which are synthetic events that wrap native browser events.
- **Explain about event handlers:** Functions passed to JSX attributes (e.g., `onClick={handleClick}`) handle events.
- **Define Synthetic event:** React provides a cross-browser wrapper called a SyntheticEvent. It's used in handlers like `onClick` and `onSubmit`.
- **Identify React event naming convention:** React uses camelCase (e.g., `onClick`, `onSubmit`, not lowercase like HTML).

## Features / Components

1. **Counter (Increment/Decrement)**
   - `Increase` button invokes two methods: one to increment the counter and another to set a static greeting message (`sayHello`). Demonstrates using `this` in a class component and binding handlers.
   - `Decrease` button decrements the counter.
   - Shows how multiple functions can be composed in an event handler.

2. **Say Welcome**
   - Functional component that receives a string argument (`"welcome"`) when the button is clicked and displays it.

3. **Synthetic Event Reporter**
   - Button labeled "Press Me" uses a React synthetic event (`onClick`) to display "I was clicked".

4. **Currency Convertor**
   - Converts between Indian Rupees (INR) and Euros (EUR).
   - Two forms: INR → EUR and EUR → INR, each using `onSubmit` to handle the conversion.
   - Demonstrates handling form submission events and preventing default behavior.

## Tech Stack

- React (Create React App)
- ES6 JavaScript features
- Node.js & NPM


1. **Clone the repository**
   ```bash
   git clone https://github.com/AntarMukhopadhyaya/Dn4.0-Java-FSE-Assignments
   cd Week7/Week7_React/Exercise_11/Code/eventsexamplesapp
   ```
2. **Install dependencies**
    ```bash
    npm install
    ```
3. **Run the app**
    ```bash
    npm start
    ```
4. **Visit the Site**
    ```bash
    http://localhost:3000
