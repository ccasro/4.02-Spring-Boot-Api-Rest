# 4.02-Spring-Boot-Api-Rest

## 📄 Description

This repository contains a Spring Boot REST API developed as a learning project to practice the fundamentals of backend development with Java and Spring Boot.

The application manages the stock of a fruit store, allowing the user to perform a complete CRUD (Create, Read, Update, Delete) over fruits. Each fruit contains:

* Name
* Weight in kilos

The application uses an in-memory SQL database (H2), commonly used for development and testing environments due to its simplicity and fast setup.

The project follows a layered MVC architecture:

* Controller → handles HTTP requests and responses
* Service → contains business logic and validations
* Repository → handles data persistence with JPA
* DTOs → isolate API layer from domain entities

Global exception handling is implemented using @RestControllerAdvice.

## 💻 Technologies used

- Java 21+
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- JUnit 5
- Spring Boot Test (MockMvc)
- Mockito
- Jackson (JSON serialization)
- Lombok
- Docker
- IntelliJ IDEA
- Postman

## 📋 Requirements

- Java 21 or higher
- Maven (IntelliJ bundled Maven is sufficient)
- Docker
- IDE capable of running Spring Boot projects (IntelliJ IDEA, Eclipse, etc.)

## 🛠️ Installation

1. Clone the repository:

```bash
git clone https://github.com/ccasro/4.02-Spring-Boot-Api-Rest/
```

2. Open the project in your IDE (e.g., IntelliJ IDEA)
3. Ensure Maven dependencies are downloaded automatically

## ▶️ Execution

Run the application by executing the main Spring Boot class:

```text
FruitApiH2Application.java
```

The application will start on:

```arduino
http://localhost:8080
```

## 🌐 API Endpoints

### Fruits

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | /fruits | Create fruit |
| GET    | /fruits | List all fruits |
| GET    | /fruits/{id} | Get fruit by id |
| PUT    | /fruits/{id} | Update fruit |
| DELETE | /fruits/{id} | Delete fruit |

## 🧪 Testing

The project was developed using Test-Driven Development (TDD).

### Unit tests (Mockito)

Service layer is tested in isolation:

* Fruit creation logic
* Validation rules
* Update behavior
* Delete behavior
* Not found scenarios

### Integration tests (MockMvc)

Controller endpoints tested end-to-end:

* Create fruit
* List all fruits
* Get fruit by id
* Update fruit
* Delete fruit
* 404 Not Found on non-existent id
* 400 Bad Request on invalid data

Run all tests:

```bash
mvn test
```

## 🐳 Docker

The project includes a **multi-stage Dockerfile**:

1. Build stage: compiles the application and generates the .jar
2. Runtime stage: copies only the .jar into a lightweight image

This allows running the application in production-ready containers.


## 🤝 Contributions

* Use feature branches for development
* Follow Conventional Commits:
    * feat:
    * fix:
    * refactor:
    * test:
* Keep commits small and focused
* Do not commit secrets or compiled files
* Use Pull Requests for improvements

## 📌 Notes

This project focuses on:

* REST API design
* MVC architecture (Controller → Service → Repository)
* DTO usage to avoid exposing entities
* Validation using Bean Validation annotations
* Proper HTTP status codes
* Global exception handling
* TDD (Test-Driven Development)
* Dockerized backend services

This project represents a **solid foundation for backend development with Spring Boot**, serving as the base for more 
advanced projects using real databases such as MySQL and MongoDB.