# OrmLearn

This exercise demonstrates how to use **Spring Data JPA** with **Hibernate** and **MySQL** in a Spring Boot application.

## Features

- Uses **Spring Boot** with the following dependencies:
  - `spring-boot-starter-data-jpa`
  - `mysql-connector-j`
  - `spring-boot-devtools`
- Connects to a **MySQL 8** database and interacts with a schema named `ormlearn`.
- Demonstrates:
  - Creating an entity class (`Country`)
  - Mapping it to a database table (`country`)
  - Creating a repository interface (`CountryRepository`) using `JpaRepository`
  - Writing a service class (`CountryService`) to encapsulate data access logic
  - Logging using `SLF4J` for monitoring data retrieval steps
- Tests functionality by fetching and logging all countries from the database.

## Packages and Classes

### `com.cognizant.orm_learn.model.Country`
- Entity class representing the `country` table.
- Uses annotations: `@Entity`, `@Table`, `@Id`, `@Column`.

### `com.cognizant.orm_learn.repository.CountryRepository`
- Extends `JpaRepository<Country, String>`.
- Annotated with `@Repository`.

### `com.cognizant.orm_learn.service.CountryService`
- Service class annotated with `@Service`.
- Autowires `CountryRepository`.
- Method `getAllCountries()` annotated with `@Transactional` and returns all records from the `country` table.

### `com.cognizant.orm_learn.OrmLearnApplication`
- Entry point of the application.
- Retrieves Spring context and `CountryService` bean.
- Executes `testGetAllCountries()` to log the country data.

## MySQL Setup

```sql
CREATE DATABASE ormlearn;

USE ormlearn;

CREATE TABLE country (
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(50)
);

INSERT INTO country VALUES ('IN', 'India');
INSERT INTO country VALUES ('JP', 'Japan');
INSERT INTO country VALUES ('UK', "United Kingdom");
```


## Configuration 

# Logging
logging.level.org.springframework=info
logging.level.com.cognizant=debug
logging.level.org.hibernate.SQL=trace
logging.level.org.hibernate.type.descriptor.sql=trace

logging.pattern.console=%d{dd-MM-yy} %d{HH:mm:ss.SSS} %-20.20thread %5p %-25.25logger{25} %25M %4L %m%n

# Database
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/ormlearn
spring.datasource.username=root
spring.datasource.password=root

# Hibernate
spring.jpa.hibernate.ddl-auto=validate
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect


## Usage
mvn clean package -Dhttp.proxyHost=proxy.cognizant.com -Dhttp.proxyPort=6050 -Dhttps.proxyHost=proxy.cognizant.com -Dhttps.proxyPort=6050 -Dhttp.proxyUser=123456
