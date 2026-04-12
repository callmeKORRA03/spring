# Lesson 13: Inversion of Control and Dependency Injection

## Lesson objective

By the end of this lesson, you should be able to:

- explain Inversion of Control in simple English
- explain Dependency Injection in simple English
- understand why Spring uses these ideas
- describe how these concepts make code cleaner

## Why this lesson matters

This is one of the most important ideas in Spring.

Many beginners can use Spring annotations, but they do not really understand why Spring feels different from plain Java.

The reason is strongly connected to:

- Inversion of Control
- Dependency Injection

## What is Inversion of Control?

In plain Java, developers often create objects manually.

Example:

```java
Engine engine = new Engine();
Car car = new Car(engine);
```

In Spring, the framework can manage much of that creation process for you.

That change in control is called Inversion of Control.

## Simple classroom explanation

Say this in class:

Inversion of Control means that instead of you managing everything yourself, Spring manages important object creation and wiring for you.

## What is Dependency Injection?

Dependency Injection is the process of giving an object the things it needs instead of making that object create everything by itself.

## Simple classroom explanation

Say this in class:

Dependency Injection means the object gets what it needs from outside instead of building everything inside itself.

## Why this is useful

Dependency Injection helps us:

- reduce tight coupling
- write cleaner code
- make testing easier
- separate responsibilities better

## Real life analogy

Think of a restaurant.

You do not go into the kitchen and prepare every ingredient yourself.
The kitchen gives you what you need.

In a similar way, Spring provides objects to classes when needed.

## Plain Java example without DI thinking

```java
public class MessageController {

    private MessageService service = new MessageService();

    public String getMessage() {
        return service.getMessage();
    }
}
```

This works, but the controller is tightly connected to creating the service.

## Better idea with DI thinking

```java
public class MessageController {

    private MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    public String getMessage() {
        return service.getMessage();
    }
}
```

Now the controller receives the service from outside.
That is cleaner.

## How Spring fits in

Spring can create the `MessageService` object and inject it into the controller automatically.

That is one of the big reasons Spring is powerful.

## Common mistakes beginners make

### 1. Thinking DI means magic only
It is not magic. It is just a cleaner way of providing objects.

### 2. Thinking IoC and DI are exactly the same word
They are related, but not exactly identical.

A simple way to see it:

- IoC is the broad idea of Spring managing control differently
- DI is one common way Spring does that in practice

### 3. Creating everything manually even inside Spring projects
That removes some of Spring's main benefits.

## Quick classroom practice

Ask students this question:

Which is cleaner?

- a class that creates all its own helper objects
- a class that receives its helper objects from outside

Then discuss why.

## Assessment

### Short questions

1. What is Inversion of Control?
2. What is Dependency Injection?
3. Why is Dependency Injection useful?
4. What problem happens when a class creates too many things by itself?

### Discussion task

Explain IoC and DI using your own real life example.

## Assignment

### Task 1
Write a short note comparing:

- manual object creation
- dependency injection

### Task 2
Create a plain Java example of a class receiving another class through the constructor.

## Teacher note

Do not rush this lesson.
If students understand this lesson well, services and constructor injection become much easier later.
