# Lesson 15: The Service Layer and `@Service`

## Lesson objective

By the end of this lesson, you should be able to:

- explain what the service layer is
- understand what `@Service` is used for
- know why business logic should not stay inside controllers
- teach the purpose of services clearly

## What is the service layer?

The service layer is the part of the application where business logic usually lives.

Business logic means the actual rules and work of the application.

## Examples of business logic

- checking if a student is eligible
- calculating totals
- preparing messages
- deciding what should happen before saving data

## Simple classroom explanation

Say this in class:

The service layer is where the real work of the application usually happens.

## What is `@Service`?

`@Service` is a Spring annotation used to mark a class as a service class.

That helps Spring manage it as a bean.

## Example

```java
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting() {
        return "Welcome to Spring Boot";
    }
}
```

## Why not put everything in the controller?

A controller should mainly handle requests and responses.
If too much logic is placed inside it, the code becomes harder to read and maintain.

## Bad idea example

```java
@RestController
public class GreetingController {

    @GetMapping("/greet")
    public String greet() {
        String message = "Welcome to Spring Boot";
        return message;
    }
}
```

This may work for a tiny example, but it becomes messy when logic grows.

## Better idea

```java
@Service
public class GreetingService {

    public String getGreeting() {
        return "Welcome to Spring Boot";
    }
}
```

```java
@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet() {
        return greetingService.getGreeting();
    }
}
```

## Why this is better

- the controller stays cleaner
- the business logic has its own home
- the code is easier to test later
- the app structure becomes more professional

## Real life analogy

Think of a restaurant front desk and the kitchen.

- the front desk receives the customer order
- the kitchen does the actual preparation

In the same way:

- controller receives the request
- service does the main work

## Common mistakes beginners make

### 1. Writing all logic in the controller
That works for tiny demos, but it becomes messy quickly.

### 2. Thinking a service is only for database work
A service is mainly for business logic, not only database access.

### 3. Not understanding the role difference between controller and service
Controllers handle web requests.
Services handle application logic.

## Assessment

### Short questions

1. What is the service layer?
2. What is `@Service` used for?
3. Why should business logic not stay only in the controller?
4. What kind of work belongs in the service layer?

### Practical task

Create a `WelcomeService` class with a method that returns a message.
Then call it from a controller.

## Assignment

### Task 1
Create a service class called `SchoolService`.
Add a method that returns a school welcome message.

### Task 2
Create a controller that uses the service and returns the message through an endpoint.

### Task 3
Write a short comparison of controller and service responsibilities.

## Teacher note

This lesson is where students begin to see professional structure.
Keep reminding them:

- controller = request handling
- service = business logic
