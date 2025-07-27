# FinancialForecasting

This exercise demonstrates a simple recursive algorithm that forecast future values based on a base value, growth reate and number of years.
## Concept
- Recursion is a programming technique where a function call itself to solve a subset of the problem.
- It is powerful for problems that can be broken down into `repetitive subtask` like fibonacci,forecasting based on previous year data.

## Features
- Implement a standardc recursion
- Also includes a tail-recursive version for optimization
- Includes an iterative version for comparison
- Calculate future value using the following formula:
    `futureValue(n) = futureValue(n-1) * ( 1 + growthRate)`
## Usage

Compile and run `TestForecast.java` to see the output of different approaches.

## Time Complexity Comparison

- Recursive
    - Time Complexity: O(n)
    - Space Complexity: O(n) as each function call uses stack space
- Tail Recursive
    - Time Complexity: O(n)
    - Space Complexity: <= O(n) as tail calls can be eliminated
- Iterative 
    -Time Complexity: O(n)
    -Space Complexity: O(1)

## Optimization
- Recursive methods can be optimized using iterative approach to prevent over use of stack space and also to prevent `stack overflow`.

