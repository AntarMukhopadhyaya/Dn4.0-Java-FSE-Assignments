# MockingAndStubbing

This exercise demonstrates how to use **Mockito** to mock and stub methods of an external API in a unit test using **JUnit 5**.

## Features
- Uses `Mockito.mock()` to create a mock object for the external dependency.
- Uses `when().thenReturn()` to stub method calls with predefined values.
- Demonstrates **dependency injection** of mock into service class.
- Validates the result using JUnit 5 assertion methods.

## Mocked Class
- `ExternalApi.java`

## Tested Class
- `MyService.java`

## Test Class
- `MyServiceTest.java`

## Usage
Compile and run `MyServiceTest.java` using either IntelliJ's test runner or via terminal with Maven:

```bash
mvn test
