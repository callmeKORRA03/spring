# Lesson 17: Layered Architecture in Spring Boot

## Lesson objective

By the end of this lesson, you should be able to:

- understand layered architecture
- explain the role of controller, service, and repository clearly
- understand why layered design improves code quality
- teach the data flow in a Spring Boot app simply

## What is layered architecture?

Layered architecture is a way of organizing an application into parts with clear responsibilities.

In beginner Spring Boot projects, the most common layers are:

- controller
- service
- repository

## Simple classroom explanation

Say this in class:

Layered architecture means we separate different kinds of work into different parts of the application.

## The main layers

### Controller layer
Handles web requests and responses.

### Service layer
Handles business logic and main application rules.

### Repository layer
Handles data access and storage operations.

## Easy flow to teach

Say this in class:

A request comes into the controller.
The controller calls the service.
The service may call the repository.
Then the result moves back up as a response.

## Visual text flow

```text
Client -> Controller -> Service -> Repository -> Data source
```

And then back again as the response.

## Why this structure is useful

It helps us:

- keep code organized
- reduce confusion
- make testing easier
- change one part without disturbing everything

## Simple example

### Controller
Receives `/students`

### Service
Decides how student logic should work

### Repository
Reads or saves student data

## Real life analogy

Think of a bank.

- the customer desk receives requests
- the officer applies business rules
- the records unit handles stored information

That is similar to controller, service, and repository.

## Common mistakes beginners make

### 1. Putting all logic into one class
This creates confusion quickly.

### 2. Thinking repository and service are the same thing
They are related, but their jobs are different.

### 3. Not understanding the direction of data flow
The request should move in a clear path through the layers.

## Assessment

### Short questions

1. What is layered architecture?
2. What does the controller layer do?
3. What does the service layer do?
4. What does the repository layer do?
5. Why is layered architecture useful?

### Practical task

Draw the flow of a request from client to repository and back.

## Assignment

### Task 1
Create a short note explaining:

- controller
- service
- repository

### Task 2
Use a real life analogy to explain layered architecture.

## Teacher note

Draw the structure on the board often.
Students remember the architecture better when they can see the movement of the request visually.
