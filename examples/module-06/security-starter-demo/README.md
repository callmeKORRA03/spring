# Security Starter Demo

This is the example project for Module 06.

## Purpose

This project demonstrates:

- Spring Security basics
- public and protected endpoints
- in memory user authentication
- packaging and Docker readiness

## Main parts

- `controller/HelloController.java`
- `config/SecurityConfig.java`
- `application.properties`
- `Dockerfile`

## Endpoints included

- `GET /public/hello`
- `GET /private/hello`

## Test idea

- `/public/hello` should be accessible without login
- `/private/hello` should require authentication

## Demo credentials

- username: `student`
- password: `password123`

## Packaging

You can package the project with:

```bash
mvn clean package
```

## Running the JAR

```bash
java -jar target/security-starter-demo-0.0.1-SNAPSHOT.jar
```

## Docker build idea

```bash
docker build -t security-starter-demo .
```

## Docker run idea

```bash
docker run -p 8085:8085 security-starter-demo
```

## Teaching note

This project is intentionally simple.
It is designed to help learners understand the first steps of Spring Security without overwhelming complexity.
