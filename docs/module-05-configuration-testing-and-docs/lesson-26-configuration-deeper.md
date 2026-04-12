# Lesson 26: Configuration in Spring Boot Beyond the Basics

## Lesson objective

By the end of this lesson, you should be able to:

- understand why configuration matters in real projects
- use `application.properties` more confidently
- explain why configuration should stay outside normal business code
- recognize common application settings in Spring Boot

## Why configuration matters

As applications grow, they need many settings.

Examples include:

- application name
- server port
- database settings
- logging levels
- feature flags
- environment specific settings

If all these are mixed into Java code, the project becomes harder to manage.

## Simple classroom explanation

Say this in class:

Configuration is the set of settings that controls how the application behaves.

## Common settings in `application.properties`

### Application name
```properties
spring.application.name=api-quality-demo
```

### Server port
```properties
server.port=8084
```

### H2 console
```properties
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

### JPA behavior
```properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Why this is useful

These settings help us change behavior without editing the main business code.

## Real life analogy

Think of a generator control panel.

The machine is the application.
The control panel settings are like configuration.
You do not rebuild the machine each time you want a small change.

## Common mistakes beginners make

### 1. Putting every setting directly inside Java logic
That makes the app harder to maintain.

### 2. Forgetting that configuration is environment sensitive
A local machine and production server may need different values.

### 3. Thinking configuration is not important yet
Even small projects benefit from clean settings.

## Assessment

### Short questions

1. What is configuration in a Spring Boot app?
2. Why is `application.properties` useful?
3. Give two examples of common Spring Boot settings.
4. Why is it better to avoid scattering settings throughout Java code?

### Practical task

Write a simple `application.properties` file that sets:

- application name
- server port
- H2 console enabled

## Assignment

### Task 1
Create a short note explaining why configuration matters in backend projects.

### Task 2
Write an `application.properties` file for a small library API.

## Teacher note

Students should understand that configuration is part of professional project design, not just a side detail.
