# Lesson 11: `@Controller` vs `@RestController`

## Lesson objective

By the end of this lesson, you should be able to:

- understand the difference between `@Controller` and `@RestController`
- know when to return data and when to return a view name
- avoid a very common beginner confusion in Spring Boot

## Why this lesson matters

Many beginners get confused when HTML pages do not show correctly.
A common reason is mixing `@Controller` and `@RestController` wrongly.

## What is `@RestController`?

`@RestController` is mainly used when your method should return data directly.

Examples of data:

- text
- JSON
- maps
- objects

## What is `@Controller`?

`@Controller` is mainly used when you want to return a view name, especially when working with templates.

## Simple classroom explanation

Say this in class:

Use `@RestController` when you want to send data.
Use `@Controller` when you want to return a page or view.

## Example with `@RestController`

```java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot";
    }
}
```

This returns the text directly in the response.

## Example with `@Controller`

```java
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home() {
        return "index";
    }
}
```

This usually means Spring should look for a view template called `index`.

## Beginner warning

If you use `@RestController` and return `"index"`, Spring may treat it as plain text instead of rendering a page.

## Easy rule to remember

- data response = `@RestController`
- page rendering = `@Controller`

## Real life analogy

Think of two workers:

- one sends information directly to a user
- one sends the user to a room or office

That is similar to the difference here.

## Common mistakes beginners make

### 1. Using `@RestController` when they want to show HTML templates
That often returns plain text instead of a rendered page.

### 2. Using `@Controller` but expecting JSON directly
That may not behave the way they expect.

### 3. Not understanding that the return meaning changes with the annotation
The same string can mean different things depending on the controller type.

## Quick classroom practice

Create:

- one controller that returns text with `@RestController`
- one controller that returns a page name with `@Controller`

## Assessment

### Short questions

1. What is `@RestController` mainly used for?
2. What is `@Controller` mainly used for?
3. Which one is better for JSON APIs?
4. Which one is better for returning view names?

### Practical task

Write one short example for each annotation.

## Assignment

### Task 1
Explain the difference between `@Controller` and `@RestController` in your own words.

### Task 2
Create one data returning endpoint and one page style controller example.

## Teacher note

When teaching beginners, spend time here.
This single topic removes a lot of confusion around HTML and API behavior.
