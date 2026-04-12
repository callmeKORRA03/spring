# Lesson 06: Controllers and Your First Endpoints

## Lesson objective

By the end of this lesson, you should be able to:

- understand what a controller does
- explain `@RestController`
- explain `@GetMapping`
- create your first working endpoint
- return text and simple JSON from Spring Boot

## What is a controller?

A controller is a class that handles incoming web requests.

It listens for specific URLs and decides what response should be returned.

## Simple classroom explanation

Say this in class:

A controller is like the part of the application that receives a request and sends an answer back.

## What is `@RestController`?

`@RestController` tells Spring Boot that the class will handle web requests and return data directly.

This is commonly used in REST API development.

## What is `@GetMapping`?

`@GetMapping` maps a method to an HTTP GET request.

Example:

If a browser or client requests `/hello`, the matching method runs.

## First example

```java
package com.example.hellorestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}
```

## What happens here?

- `@RestController` marks the class as a controller that returns data
- `@GetMapping("/hello")` says this method should run when `/hello` is requested with GET
- `hello()` returns a string as the response body

## How to test it

Run the Spring Boot app and open:

`http://localhost:8080/hello`

You should see:

`Hello, Spring Boot!`

## Returning JSON

Spring Boot can also return JSON very easily.

### Example

```java
package com.example.hellorestapi.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")
    public Map<String, String> info() {
        return Map.of(
            "name", "Spring Boot",
            "type", "Backend Framework",
            "level", "Beginner Friendly"
        );
    }
}
```

## What happens here?

Spring Boot converts the returned map into JSON automatically.

## Expected JSON style output

```json
{
  "name": "Spring Boot",
  "type": "Backend Framework",
  "level": "Beginner Friendly"
}
```

## Why this lesson matters

This is the first real web behavior students can see.
It helps them connect theory to practice.

## Common mistakes beginners make

### 1. Forgetting `@RestController`
The method may exist, but Spring will not treat it as a REST controller correctly.

### 2. Using the wrong URL in the browser
They expect `/hello` to work but visit `/` instead.

### 3. Not running the app before testing
The endpoint only works when the application is running.

### 4. Wrong package structure
The controller should be inside the package scanned by the main application class.

## Small classroom practice

Ask students to create these endpoints:

- `/name`
- `/school`
- `/about`

Example:

```java
@GetMapping("/name")
public String name() {
    return "My name is Favour";
}
```

## Assessment

### Short questions

1. What does a controller do?
2. What is `@RestController` used for?
3. What is `@GetMapping` used for?
4. What should happen when we visit `/hello`?
5. Can Spring Boot return JSON automatically from a simple Java structure?

### Practical task

Create one endpoint that returns text and another that returns JSON.

## Assignment

### Task 1
Create three endpoints:

- `/name`
- `/course`
- `/goal`

Each should return a sentence.

### Task 2
Create one endpoint called `/profile` that returns simple JSON data.

### Task 3
Explain in your own words the difference between the main class and a controller class.

## Teacher note

This lesson should feel exciting.
It is where students begin to feel they are building real backend software.

Do live testing in the browser after every endpoint.
That keeps the class active and confident.
