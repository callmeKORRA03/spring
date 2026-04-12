# Lesson 24: Exception Handling and Friendly Error Responses

## Lesson objective

By the end of this lesson, you should be able to:

- understand what an exception is
- explain why friendly error handling matters
- understand the role of custom exceptions
- explain `@ExceptionHandler` and `@ControllerAdvice` simply

## What is an exception?

An exception is a problem or unexpected situation that happens while the application is running.

Examples:

- a record is not found
- a request is invalid
- an id does not exist
- something fails during processing

## Simple classroom explanation

Say this in class:

An exception is an error situation that happens while the application is working.

## Why friendly error handling matters

Without proper handling, the user or client may get:

- confusing messages
- ugly raw errors
- poor API responses

A good backend should return clear and useful error messages.

## Common exception idea

If a student with id `99` does not exist, the app should not just fail badly.
It should return a useful response such as:

- message
- status code
- maybe timestamp later

## Custom exception example

```java
public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String message) {
        super(message);
    }
}
```

## Exception handling example

```java
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleStudentNotFound(StudentNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("error", ex.getMessage()));
    }
}
```

## What is `@ControllerAdvice`?

`@ControllerAdvice` helps create central exception handling for controllers.

## What is `@ExceptionHandler`?

`@ExceptionHandler` marks the method that should handle a specific exception.

## Simple classroom explanation

Say this in class:

These tools help us catch problems and return cleaner error messages instead of messy crashes.

## Real life analogy

Think of a front desk in an office.
If there is a problem, the front desk should explain it clearly and professionally, not just shout that something went wrong.

That is what good exception handling does.

## Common mistakes beginners make

### 1. Ignoring missing data problems
They assume every id will always exist.

### 2. Returning unclear error responses
A client needs useful information.

### 3. Thinking exception handling is only for advanced projects
Even beginner apps benefit from cleaner errors.

## Assessment

### Short questions

1. What is an exception?
2. Why is friendly error handling important?
3. What does `@ControllerAdvice` do?
4. What does `@ExceptionHandler` do?
5. Why might a custom exception be useful?

### Practical task

Write a custom exception called `BookNotFoundException`.
Then explain what response you would like the API to return.

## Assignment

### Task 1
Create a custom exception for a missing `Course` record.

### Task 2
Write a short note explaining why clean error handling improves backend APIs.

## Teacher note

Keep the first examples small.
The main goal is for students to understand that backend errors should be handled in a controlled and readable way.
