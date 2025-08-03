# Cricket App

A simple React application demonstrating ES6 features including `map`, arrow functions, destructuring, and array merging.

## Objectives Covered

- List the features of ES6 (used in code: `let`/`const`, arrow functions, destructuring, spread operator, classes can be added if extended)
- Use `map()` to render lists
- Apply arrow functions for filtering
- Implement destructuring to separate odd/even team players
- Merge arrays using ES6 spread syntax

## Features

1. **ListOfPlayers**
   - Maintains an array of 11 players with names and scores.
   - Displays all players using `.map()`.
   - Filters and displays players with scores below 70 using arrow functions.

2. **IndianPlayers**
   - Uses destructuring to extract individual players and groups them into odd and even teams.
   - Declares two arrays (`T20players` and `RanjiTrophyPlayers`), merges them using the ES6 spread operator, and displays the combined list.

3. **Flag Logic**
   - The main page conditionally renders both components when `flag` is set to `true`.

## Tech Stack

- React (Create React App)
- ES6 JavaScript features
- Node.js & NPM

## Installation & Running

## Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/AntarMukhopadhyaya/Dn4.0-Java-FSE-Assignments
   cd Week7/Week7_React/Exercise_9/Code/cricketapp
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
    ```
