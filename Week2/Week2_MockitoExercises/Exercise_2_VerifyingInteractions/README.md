# VerifyInteraction

This exercise demonstrates how to use **Mockito's `verify()` method** to confirm that specific interactions occurred in a unit test using **JUnit 5**.

## Features
- Uses `Mockito.mock()` to create a mock object.
- Verifies that a method was invoked with expected behavior.
- Validates internal interaction instead of output.
- Ensures `getData()` was called during the test.

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
