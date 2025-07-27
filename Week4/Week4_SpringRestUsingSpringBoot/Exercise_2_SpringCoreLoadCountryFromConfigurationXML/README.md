# SpringLearn – Load Country Bean from XML Configuration

This exercise demonstrates the use of **Spring Core (non-Boot)** to load and configure a Java bean using **XML-based configuration**. It introduces fundamental Spring concepts such as the ApplicationContext and bean lifecycle using an example of a `Country` bean.

---

##  Project Overview

- **Technology Stack:**
  - Java 17+ / 21 / 24
  - Spring Framework 5.x
  - Maven
  - SLF4J (Simple Binding)

- **Concepts Covered:**
  - XML-based Bean Configuration (`country.xml`)
  - `ApplicationContext` usage
  - Logging with SLF4J
  - Bean instantiation and dependency injection

---

## Steps Followed

1. **Created a Maven project** with basic Spring dependencies.
2. **Defined `Country` bean** in `country.xml`:
   ```xml
   <bean id="country" class="com.cognizant.spring_learn.Country">
       <property name="code" value="JP" />
       <property name="name" value="Japan" />
   </bean>
   ```
3. Implemented Country.java:
    - Fields: code, name
    - Constructor with LOGGER.debug("Inside Country constructor")
    - Getter/setter methods with debug logs
    - toString() method
4. Created **SpringLearnApplication.java**:
    - Loaded context using **ClassPathXmlApplicationContext**
    - Retrieved bean using **context.getBean("country", Country.class)**
    - Logged and printed the country details
5. Configured **SLF4J Logging**:
    - Used **slf4j-api** and **slf4j-simple** version 1.7.36
    - Created simplelogger.properties under src/main/resources:
    - org.slf4j.simpleLogger.defaultLogLevel=debug
6. Built and ran the application:
    - Used mvn clean install
    - Ran SpringLearnApplication.main() from IntelliJ or command line
8. Verified output:
    -Console displayed debug logs for constructor, setters, getters

## Usage 

- Built using Maven command:
   ```bash
   mvn clean package -Dhttp.proxyHost=proxy.cognizant.com -Dhttp.proxyPort=6050 -Dhttps.proxyHost=proxy.cognizant.com -Dhttps.proxyPort=6050 -Dhttp.proxyUser=123456
   ```
