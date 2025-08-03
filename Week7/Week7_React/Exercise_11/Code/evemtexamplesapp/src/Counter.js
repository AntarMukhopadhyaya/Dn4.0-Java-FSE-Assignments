import React from "react";

class Counter extends React.Component {
  constructor(props) {
    super(props);
    // using this to access methods and state
    this.state = {
      count: 0,
      message: "",
    };

    // bind if not using arrow methods
    this.increment = this.increment.bind(this);
    this.decrement = this.decrement.bind(this);
    this.sayHello = this.sayHello.bind(this);
    this.handleIncrease = this.handleIncrease.bind(this);
  }

  increment() {
    this.setState((prev) => ({ count: prev.count + 1 }));
  }

  decrement() {
    this.setState((prev) => ({ count: prev.count - 1 }));
  }

  sayHello() {
    this.setState({ message: "Hello! This is a static message." });
  }

  // Increase button invokes multiple methods
  handleIncrease() {
    this.increment();
    this.sayHello();
  }

  render() {
    return (
      <div>
        <p>
          <strong>Counter:</strong> {this.state.count}
        </p>
        <div className="button-row">
          <button onClick={this.handleIncrease}>Increase</button>
          <button onClick={this.decrement}>Decrement</button>
        </div>
        {this.state.message && <p className="info">{this.state.message}</p>}
      </div>
    );
  }
}

export default Counter;
