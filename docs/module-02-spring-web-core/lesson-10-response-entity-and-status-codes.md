# Lesson 10: `ResponseEntity` and HTTP Status Codes

## Lesson objective

By the end of this lesson, you should be able to:

- understand why status codes matter
- explain common status codes in simple English
- use `ResponseEntity` in Spring Boot
- return cleaner and more professional API responses

## Why status codes matter

A backend response should not only send data.
It should also show whether the request succeeded or failed.

Status codes help us do that.

## Common status codes

### `200 OK`
The request succeeded.

### `201 Created`
A new resource was created successfully.

### `400 Bad Request`
The request was not valid.

### `404 Not Found`
The requested resource could not be found.

### `500 Internal Server Error`
Something went wrong on the server.

## What is `ResponseEntity`?

`ResponseEntity` is a Spring class that helps us control:

- the response body
- the status code
- sometimes headers

## Simple classroom explanation

Say this in class:

`ResponseEntity` gives us more control over what the backend sends back.

## Example

```java
package com.example.webcore.controller;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/status-demo")
    public ResponseEntity<Map<String, String>> demo() {
        Map<String, String> body = Map.of("message", "Request was successful");
        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}
```

## Shorter version

```java
@GetMapping("/status-demo")
public ResponseEntity<Map<String, String>> demo() {
    return ResponseEntity.ok(Map.of("message", "Request was successful"));
}
```

## Example with created status

```java
@PostMapping("/books")
public ResponseEntity<Map<String, String>> createBook() {
    return ResponseEntity.status(HttpStatus.CREATED)
            .body(Map.of("message", "Book created successfully"));
}
```

## Why this is better than plain strings only

A plain string can show a message, but `ResponseEntity` can show both the message and the correct HTTP meaning.
That is more professional in real APIs.

## Real life analogy

Imagine a school office giving you a response slip.
The message tells you what happened.
The status code is like the official result label on the slip.

## Common mistakes beginners make

### 1. Returning success messages with the wrong status idea
For example, creating data but mentally treating it like just a normal read response.

### 2. Thinking status codes are optional in real APIs
They are very important for good backend design.

### 3. Using `ResponseEntity` without understanding why
Students should know it gives more control.

## Quick classroom practice

Create these endpoints:

- one that returns `200 OK`
- one that returns `201 Created`
- one that returns `404 Not Found`

## Assessment

### Short questions

1. What is the meaning of `200 OK`?
2. What is the meaning of `201 Created`?
3. What is the meaning of `404 Not Found`?
4. What does `ResponseEntity` help us control?

### Practical task

Create an endpoint that returns a JSON message with a `200 OK` status.

## Assignment

### Task 1
Create a POST endpoint that returns a `201 Created` status.

### Task 2
Create an endpoint `/not-found-demo` that returns a message and `404 Not Found`.

### Task 3
Explain why `ResponseEntity` is better than always returning plain strings.

## Teacher note

This lesson prepares students for cleaner CRUD APIs later.
Introduce it slowly and use simple examples first.
