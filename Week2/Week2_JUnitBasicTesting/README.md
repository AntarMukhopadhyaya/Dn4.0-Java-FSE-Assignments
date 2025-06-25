# JUnitSetup

This is a simple implementation demonstrating how to set up and use **JUnit 4** in a Java Maven project.

## Features
- Shows how to integrate **JUnit 4.13.2** using `pom.xml` in a Maven project.
- Includes a class called `Calculator` with basic arithmetic methods.
- Includes a test class called `CalculatorTest` that verifies the behavior of those methods using `@Test`.
- Test cases include:
  - Addition
  - Subtraction
  - Multiplication
  - Division
  - Division by zero exception

## Usage
Compile and run `CalculatorTest.java` using either IntelliJ's test runner or via terminal with Maven:

```bash
mvn test