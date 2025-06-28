# LoggingExample

This exercise demonstrates how to use **SLF4J** with **Logback** to log error and warning messages in a Java application.

## Features
- Integrates `slf4j-api` and `logback-classic` using Maven.
- Logs error and warning messages using SLF4J’s `Logger` interface.
- Uses `LoggerFactory.getLogger()` for creating logger instance.
- Demonstrates:
 - `logger.trace("...")` – very detailed logs (typically off in production)
  - `logger.debug("...")` – debug-level info for developers
  - `logger.info("...")` – general information messages
  - `logger.warn("...")` – warning about potential issues
  - `logger.error("...")` – errors or exceptions

## Class
- `LoggingExample.java`

## Usage
Compile and run `LoggingExample.java` using IntelliJ or terminal:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="org.dn4.LoggingExample"