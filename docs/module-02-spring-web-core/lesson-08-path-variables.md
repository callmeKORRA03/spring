# Lesson 08: Path Variables with `@PathVariable`

## Lesson objective

By the end of this lesson, you should be able to:

- understand what a path variable is
- use `@PathVariable` in Spring Boot
- explain the difference between path variables and request parameters
- create endpoints that use values inside the URL path

## What is a path variable?

A path variable is a value that is part of the URL path itself.

Example:

`/students/5`

In this example:

- `/students` is the main path
- `5` is the path variable value

## Simple classroom explanation

Say this in class:

A path variable is a value written directly inside the URL path, usually to identify a specific item.

## Why path variables are useful

They are useful when you want to:

- get one item by id
- update one item by id
- delete one item by id
- represent a resource clearly

## Example with Spring Boot

```java
package com.example.webcore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/students/{id}")
    public String getStudent(@PathVariable int id) {
        return "Student ID is " + id;
    }
}
```

## What happens here?

- the request is sent to something like `/students/5`
- Spring reads the value inside the URL
- the value is stored in `id`
- the method uses the value and returns a response

## Test URL

`http://localhost:8080/students/5`

Expected output:

`Student ID is 5`

## Difference from `@RequestParam`

### Request parameter
Example:

`/students?id=5`

### Path variable
Example:

`/students/5`

## Easy way to explain the difference

Say this in class:

A request parameter is extra information added to the URL.
A path variable is part of the main URL path itself.

## Real life analogy

Think of a house address.

`/students/5` is like going to house number 5 on a street.
The number is part of the address.

## Common mistakes beginners make

### 1. Forgetting the curly braces in the mapping
The mapping should use `{id}` style.

### 2. Writing the wrong URL when testing
If the method expects `/students/{id}`, the test URL must include an actual value like `/students/3`.

### 3. Mixing path variables and request parameters too early
Teach them one at a time first.

## Quick classroom practice

Create these endpoints:

- `/books/{id}`
- `/users/{id}`
- `/courses/{code}`

## Assessment

### Short questions

1. What is a path variable?
2. What does `@PathVariable` do?
3. Give one example of a URL that uses a path variable.
4. What is one difference between `@PathVariable` and `@RequestParam`?

### Practical task

Create an endpoint `/products/{id}` that returns:

`Product ID is [id]`

## Assignment

### Task 1
Create three endpoints using `@PathVariable`.

### Task 2
Write a short explanation comparing:

- `@RequestParam`
- `@PathVariable`

### Task 3
Create one endpoint that accepts a course code as a path variable.

## Teacher note

Once students understand this lesson well, CRUD APIs become much easier to teach later.
