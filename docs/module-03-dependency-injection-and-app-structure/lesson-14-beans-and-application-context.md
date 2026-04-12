# Lesson 14: Beans and the ApplicationContext

## Lesson objective

By the end of this lesson, you should be able to:

- explain what a Spring bean is
- explain what the ApplicationContext does
- understand why beans are important in Spring Boot
- use simple language to teach these terms clearly

## What is a bean?

A bean is a Java object that is managed by Spring.

That means Spring can:

- create it
- store it
- manage it
- provide it where needed

## Simple classroom explanation

Say this in class:

A bean is simply an object that Spring is taking care of.

## What is the ApplicationContext?

The ApplicationContext is one of the main containers in Spring.
It helps manage beans and application configuration.

## Simple classroom explanation

Say this in class:

The ApplicationContext is like the main Spring container that holds and manages important objects for the application.

## Real life analogy

Think of a school office.

The office keeps important records and knows where things are.
In a similar way, the ApplicationContext manages important application objects.

## Example idea

When you mark a class with annotations such as:

- `@RestController`
- `@Service`
- `@Component`

Spring can register those classes as beans.

## Why beans matter

Beans matter because Spring can then:

- inject them into other classes
- reuse them properly
- help organize the application

## Example

```java
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting() {
        return "Hello from the service";
    }
}
```

In a Spring application, this service can become a bean.

## Common mistakes beginners make

### 1. Thinking every Java object is automatically a Spring bean
Only objects managed by Spring are beans.

### 2. Forgetting that annotations help Spring discover classes
Those annotations are not just decoration. They help Spring know what to manage.

### 3. Thinking ApplicationContext is something they must always manipulate directly
At beginner level, it is enough to understand its role clearly.

## Easy summary

- bean = object managed by Spring
- ApplicationContext = Spring container that manages those objects

## Assessment

### Short questions

1. What is a bean?
2. What does the ApplicationContext do?
3. Is every Java object automatically a Spring bean?
4. Give one annotation that can help create a bean.

### Small explanation task

Explain bean and ApplicationContext in your own simple words.

## Assignment

### Task 1
Write a short note on:

- bean
- ApplicationContext

### Task 2
List three Spring annotations that commonly create or mark managed classes.

## Teacher note

At this level, keep the explanation practical.
Students do not need a deep container theory lecture yet.
They just need to know what a bean is and why Spring manages it.
