# 🧪 Student Management Portal

This exercise demonstrates how react components works . The app contains Home, About and Contact Page.

---

## 🔧 Tools Used

- **Node.js**
- **NPM**
- **Visual Studio Code**
- **React**
- **create-react-app**

---

## ▶️ Usage Steps

### 1. Install Node.js and NPM
Download and install from: [https://nodejs.org/en/download/](https://nodejs.org/en/download/)

### 2. Install create-react-app globally
```bash
npm install -g create-react-app
```
### 3. Create a new React app named myfirstreact
```bash
npx create-react-app myfirstreact
```
### 4. Navigate into the project directory
```bash
cd myfirstreact
```
### 5. Open the project in Visual Studio Code
```bash
code .
```

### 6. Create a directory named components inside the src directory
### 7. Create Home.js, About.js and Contact.js with the following code
```jsx


import { Component } from "react";
export class Home extends Component {
    render() {
        return (
            <div>
                <h1> Welcome to Home Page of Student Management Portal</h1>
                <span><b>Created by Antar</b></span>
            </div>
        );

    }
}

import { Component } from "react"
export class About extends Component {
    render() {
        return (
            <div>
                <h1>This is the About Page </h1>
            </div>
        )

    }

}


import { Component } from "react"
export class Contact extends Component {
    render(){
        return(
            <div>
            <h1>This is the Contact Page </h1>
        </div>
        )
    }

}


 ```
### 8. Edit App.js file inside src/ folder
Replace its content with:

```jsx


import './App.css';
import {Home} from "./components/Home";
import {About} from "./components/About";
import {Contact} from "./components/Contact";


function App() {
  return (
    <div className="App">
      <Home />
      <About />
      <Contact />
    </div>
  );
}

export default App;

```
### 9. Run the application

```bash
npm start
```
### 10. View the app in browser
Open http://localhost:3000 in your browser.
