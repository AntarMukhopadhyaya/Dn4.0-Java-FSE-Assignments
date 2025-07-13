# SpringLearn – Spring Web Project Setup

This project demonstrates the creation of a basic **Spring Boot Web Application** using Maven. It is the foundational setup for building REST APIs or web-based microservices.

---

## Project Setup Overview

- **Group:** `com.cognizant`
- **Artifact ID:** `spring-learn`
- **Spring Boot Version:** 3.x (as per Spring Initializr default)
- **Dependencies Used:**
  - Spring Boot DevTools
  - Spring Web

---

## Steps Followed

1. 🛠️ Created project from [Spring Initializr](https://start.spring.io/)
   - Group: `com.cognizant`
   - Artifact: `spring-learn`
   - Dependencies: Spring Web, Spring Boot DevTools

2. 📦 Extracted ZIP and imported to Eclipse
   - File → Import → Maven → Existing Maven Project

3. 🧪 Built using Maven command:
   ```bash
   mvn clean package -Dhttp.proxyHost=proxy.cognizant.com -Dhttp.proxyPort=6050 -Dhttps.proxyHost=proxy.cognizant.com -Dhttps.proxyPort=6050 -Dhttp.proxyUser=123456
