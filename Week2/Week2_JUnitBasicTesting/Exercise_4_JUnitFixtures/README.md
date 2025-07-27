# JUnitFixtures

This exercise demonstrates using the **Arrange-Act-Assert (AAA)** pattern in unit tests and organizing them using **setup and teardown** methods in **JUnit 5**.

## Features
- Uses `@BeforeEach` for setup logic before each test.
- Uses `@AfterEach` for teardown/cleanup after each test.
- Applies the AAA (Arrange–Act–Assert) structure:
  - **Arrange**: Setup test data and objects
  - **Act**: Execute the method under test
  - **Assert**: Verify the results

## Tested Class
- `Calculator.java`

## Test Class
- `CalculatorFixtureTest.java`


## Usage
Compile and run `CalculatorFixtureTest.java` using either IntelliJ's test runner or via terminal with Maven:

```bash
mvn test