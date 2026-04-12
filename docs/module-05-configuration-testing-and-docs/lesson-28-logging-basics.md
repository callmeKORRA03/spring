# Lesson 28: Logging Basics in Spring Boot

## Lesson objective

By the end of this lesson, you should be able to:

- understand what logging is
- explain why logs are useful in backend applications
- recognize common log levels
- add simple logging to a Spring Boot class

## What is logging?

Logging means recording useful information about what the application is doing.

Logs can help us understand:

- what happened
- when it happened
- where a problem occurred
- whether a request succeeded or failed

## Simple classroom explanation

Say this in class:

Logging is the habit of writing useful activity information while the app runs.

## Why logging matters

Logs help developers:

- debug problems
- trace application behavior
- understand failures
- monitor important actions

## Common log levels

### INFO
Used for normal important information.

### DEBUG
Used for more detailed development information.

### WARN
Used when something is unusual but not fully broken.

### ERROR
Used when something has gone wrong.

## Example in code

```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private static final Logger logger = LoggerFactory.getLogger(CourseService.class);

    public String getMessage() {
        logger.info("Getting welcome message from CourseService");
        return "Welcome to Spring Boot";
    }
}
```

## Why logs are better than random `System.out.println()`

Proper logging is more structured and more suitable for real applications.

## Real life analogy

Think of a security guard register book.

Each important event is written down so people can check what happened later.
That is what logs help us do in software.

## Common mistakes beginners make

### 1. Using logs for no useful reason
Logs should be meaningful, not noisy.

### 2. Thinking logging is only for big companies
Even beginner projects benefit from good logs.

### 3. Depending only on `System.out.println()` forever
That is not the best long term habit.

## Assessment

### Short questions

1. What is logging?
2. Why are logs useful?
3. What is the meaning of `INFO`?
4. What is the meaning of `ERROR`?
5. Why are logs better than only using `System.out.println()`?

### Practical task

Add one info log statement to a service method.

## Assignment

### Task 1
Write a short note on the meaning of these log levels:

- INFO
- DEBUG
- WARN
- ERROR

### Task 2
Add a log statement to a controller or service in one of your sample projects.

## Teacher note

Keep the first logging examples very small.
The goal is habit formation, not advanced monitoring.
