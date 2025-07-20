# Bank Microservices: Account and Loan

This hands-on exercise demonstrates how to build **two independent Spring Boot microservices**: one for handling **account** operations and another for **loan** operations. The services expose simple REST endpoints and run on separate ports.

## 🔧 Tech Stack

- **Spring Boot**
- **Spring Web**
- **Spring Boot DevTools**
- **Maven**

---

## ⚙️ Microservices Overview

| Service   | Port | Endpoint                | Description                      |
|-----------|------|-------------------------|----------------------------------|
| Account   | 8080 | `/accounts/{number}`    | Get account details              |
| Loan      | 8081 | `/loans/{number}`       | Get loan account details         |

Each service runs as an **independent Spring Boot application** with its own `pom.xml`, packaging, and controller logic. No database or service registry is used — the services are fully decoupled and return dummy data.

---

## 📁 Packages and Classes

### `com.cognizant.account.controller.AccountController`
- REST controller exposing `/accounts/{number}`
- Returns static/dummy account info
- Example response:
```json
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}
```
### `com.cognizant.loan.controller.LoanController`
- REST controller exposing /loans/{number}
- Returns static/dummy loan info
- Example response:

```json
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```

### ⚙️ Configuration
- application.properties for Account Service
- (Default port used: 8080)
- application.properties for Loan Service
- (Must use a different port)
- server.port=8081

## Usage

- Run the Applications
- Start each service using your IDE or by running:
# In account folder
- mvn spring-boot:run
# In loan folder (after modifying port)
- mvn spring-boot:run
