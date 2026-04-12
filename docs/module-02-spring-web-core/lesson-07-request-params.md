# Lesson 07: Request Parameters with `@RequestParam`

## Lesson objective

By the end of this lesson, you should be able to:

- understand what query parameters are
- use `@RequestParam` in Spring Boot
- build endpoints that accept small input values from the URL
- explain request parameters to students in simple English

## What is a request parameter?

A request parameter is a small piece of data sent in the URL.

Example:

`/greet?name=Favour`

In this example:

- `/greet` is the endpoint
- `name` is the parameter name
- `Favour` is the parameter value

## Simple classroom explanation

Say this in class:

A request parameter is extra information we attach to a URL so the backend can use it.

## Why request parameters are useful

They are useful for:

- filtering
- searching
- sorting
- small user input values
- simple calculations

## Example with Spring Boot

```java
package com.example.webcore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
}
```

## What happens here?

- the request goes to `/greet`
- Spring looks for a query parameter called `name`
- the method uses that value
- the response is built with the value

## Test URL

`http://localhost:8080/greet?name=Favour`

Expected output:

`Hello, Favour!`

## Using a default value

Sometimes a parameter may not be provided.
In that case, we can give it a default value.

```java
@GetMapping("/welcome")
public String welcome(@RequestParam(defaultValue = "Student") String name) {
    return "Welcome, " + name + "!";
}
```

If no name is sent, the response becomes:

`Welcome, Student!`

## Required vs optional idea

By default, a simple `@RequestParam` is expected.
If the value is missing, the request may fail.

Using a default value makes the endpoint more beginner friendly and safer for demos.

## Real life analogy

Think of a delivery form.
The endpoint is the main form, and the request parameter is extra information you fill in, like your name or city.

## Common mistakes beginners make

### 1. Forgetting the question mark in the URL
The URL should start the parameters with `?`

### 2. Using the wrong parameter name
If the code expects `name` but the URL uses `fullname`, it may not work as expected.

### 3. Thinking request parameters are part of the path
They are not the same as path variables.

## Quick classroom practice

Create these endpoints:

- `/greet?name=John`
- `/age?value=20`
- `/country?name=Nigeria`

## Assessment

### Short questions

1. What is a request parameter?
2. What does `@RequestParam` do?
3. Where do request parameters appear in a URL?
4. Why is a default value useful?

### Practical task

Create an endpoint `/school` that accepts a `name` parameter and returns:

`Welcome to [name]`

## Assignment

### Task 1
Create three endpoints that use `@RequestParam`.

### Task 2
Create one endpoint with a default value.

### Task 3
Explain the difference between endpoint path and request parameter.

## Teacher note

Do not mix request parameters with path variables in the first explanation.
Teach them separately so students do not confuse them.
