# Lesson 18: Refactoring Business Logic Out of the Controller

## Lesson objective

By the end of this lesson, you should be able to:

- identify when a controller has too much logic
- move business logic into a service class
- explain why refactoring improves code quality
- teach cleaner app structure to beginners

## Why this lesson matters

Many beginners start by putting everything into the controller.
That is normal at first, but it should not stay that way for long.

Refactoring means improving code structure without changing the main result.

## Example of a crowded controller

```java
@RestController
public class ResultController {

    @GetMapping("/result")
    public String result(@RequestParam int score) {
        if (score >= 50) {
            return "Pass";
        }
        return "Fail";
    }
}
```

This works, but the business rule is living inside the controller.

## Better structure

### Service

```java
import org.springframework.stereotype.Service;

@Service
public class ResultService {

    public String checkResult(int score) {
        if (score >= 50) {
            return "Pass";
        }
        return "Fail";
    }
}
```

### Controller

```java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {

    private final ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping("/result")
    public String result(@RequestParam int score) {
        return resultService.checkResult(score);
    }
}
```

## Why this is better

- controller stays focused on request handling
- business rule gets a proper home
- code becomes easier to test
- code becomes easier to grow later

## Simple classroom explanation

Say this in class:

If the controller is doing too much thinking, we should move the main thinking into the service.

## Real life analogy

Think of a school receptionist.

The receptionist receives visitors.
But the receptionist should not do every official school process personally.
Some of that work belongs to the proper office staff.

That is like moving logic from controller to service.

## Signs a controller has too much logic

- many `if` conditions
- calculations inside request methods
- repeated rules in multiple methods
- long methods that are hard to read

## Common mistakes beginners make

### 1. Keeping all logic in the controller because it feels faster
It may feel faster at first, but it becomes messy later.

### 2. Moving code without understanding why
Students should know the reason for refactoring, not just copy structure.

### 3. Thinking refactoring changes the visible behavior
Good refactoring improves structure while keeping the main result working.

## Assessment

### Short questions

1. What is refactoring?
2. Why is it a problem when controllers contain too much business logic?
3. Where should business logic usually go?
4. Give one sign that a controller is becoming too crowded.

### Practical task

Take a simple controller method with a calculation or condition and move the main logic into a service.

## Assignment

### Task 1
Create a `GradeService` that returns:

- `Excellent` for 70 and above
- `Pass` for 50 to 69
- `Fail` for below 50

Then create a controller that uses the service.

### Task 2
Write a short explanation of why refactoring helps Spring Boot projects.

## Teacher note

This lesson is a very practical bridge into real project design.
Use it to train students to think beyond code that only works and toward code that is also clean.
