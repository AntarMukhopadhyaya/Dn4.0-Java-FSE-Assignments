# SingletonPatternExample

This is a simple implementation of the Single design pattern for a Logger class.
## Features
- Ensures only one instance of the class is created at any moment.
- Provides the access to the instance using `getInstance()` method.
- Includes a test class called TestLogger to verify the singleton behavior.
- Uses both eager and lazy approach for implementation of singleton behavior.
- Eager approach refers when the instance of the class is at class loading time.
- Lazy approach refers to creating the instance when first requested.

## Usage

Compile and run `TestLogger.java` to see both implementations in action and confirm that only a single instance is used in each approach.