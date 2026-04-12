# Lesson 16: Constructor Injection

## Lesson objective

By the end of this lesson, you should be able to:

- understand constructor injection
- explain why constructor injection is a clean approach
- use constructor injection in a Spring Boot controller or service
- compare it with manual object creation

## What is constructor injection?

Constructor injection means giving a class its dependency through the constructor.

## Simple classroom explanation

Say this in class:

Constructor injection means the object receives what it needs when it is being created.

## Example

```java
@Service
public class MessageService {

    public String getMessage() {
        return "Hello from MessageService";
    }
}
```

```java
@RestController
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/message")
    public String message() {
        return messageService.getMessage();
    }
}
```

## What happens here?

- Spring creates the `MessageService`
- Spring sees that the controller needs `MessageService`
- Spring provides it through the constructor

## Why constructor injection is good

It helps us:

- make dependencies clear
- avoid hidden object creation
- support cleaner design
- keep required fields final

## Why it is better than manual creation inside the class

Manual creation example:

```java
private MessageService messageService = new MessageService();
```

That makes the class tightly responsible for creating its own dependency.

Constructor injection is cleaner because the dependency comes from outside.

## Real life analogy

Think of moving into an apartment.
The apartment is given the furniture it needs when you enter, instead of trying to build every chair and table by itself.

## Common mistakes beginners make

### 1. Creating the dependency manually even in Spring
That reduces the advantage of Spring management.

### 2. Not understanding why the dependency is marked `final`
It shows that the dependency should not change after construction.

### 3. Thinking constructor injection is harder than it really is
It is just a clean way of receiving needed objects.

## Assessment

### Short questions

1. What is constructor injection?
2. Why is constructor injection useful?
3. Who provides the dependency in a Spring Boot application?
4. Why is manual creation less clean in this case?

### Practical task

Create a `CourseService` and inject it into a controller using the constructor.

## Assignment

### Task 1
Write a small controller and service pair using constructor injection.

### Task 2
Explain the difference between:

- manual object creation
- constructor injection

## Teacher note

This lesson is a bridge between theory and good project structure.
Keep the examples small and readable.
