# Lesson 09: `@PostMapping` and `@RequestBody`

## Lesson objective

By the end of this lesson, you should be able to:

- understand what POST requests are used for
- understand what a request body is
- use `@PostMapping`
- use `@RequestBody` in Spring Boot
- explain JSON input in a simple way

## What is a POST request?

A POST request is mainly used to create new data.

Examples:

- create a new student
- create a new book
- create a new user

## What is a request body?

A request body is the data sent inside the request, not inside the URL.

When creating records in REST APIs, the request body often contains JSON data.

## Simple classroom explanation

Say this in class:

When we want to send a full object into the backend, we usually send it in the request body.

## Example JSON body

```json
{
  "title": "Spring Boot Basics",
  "author": "Favour"
}
```

## Example class

```java
package com.example.webcore.model;

public class Book {

    private String title;
    private String author;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
```

## Example controller method

```java
package com.example.webcore.controller;

import com.example.webcore.model.Book;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @PostMapping("/books")
    public String createBook(@RequestBody Book book) {
        return "Book created: " + book.getTitle() + " by " + book.getAuthor();
    }
}
```

## What happens here?

- the client sends a POST request to `/books`
- the JSON body is received
- Spring converts the JSON into a Java object
- the method uses the object and returns a response

## Why `@RequestBody` matters

Without `@RequestBody`, Spring will not know that the method should read the incoming JSON body into the Java object.

## Testing idea

This kind of endpoint is easier to test with tools like:

- Postman
- Insomnia
- Thunder Client

## Real life analogy

Think of registering a student at a school.
You do not only send a name in the URL.
You send a full form with several details.
That form is like the request body.

## Common mistakes beginners make

### 1. Forgetting `@RequestBody`
The JSON may not map correctly.

### 2. Forgetting getters and setters
Spring often needs them for simple object mapping.

### 3. Trying to send object data through query parameters only
For full object creation, the request body is usually the better choice.

### 4. Forgetting the no argument constructor
Simple beginner examples often work more smoothly with it present.

## Quick classroom practice

Create an endpoint that accepts a `Student` object with:

- `name`
- `course`

Then return a sentence using the values.

## Assessment

### Short questions

1. What is POST mainly used for?
2. What is a request body?
3. What does `@RequestBody` do?
4. Why is JSON commonly used in request bodies?

### Practical task

Create an endpoint `/students` using `@PostMapping` that accepts a simple `Student` object.

## Assignment

### Task 1
Create a `Movie` class with:

- `title`
- `director`

Then build a POST endpoint that accepts the object.

### Task 2
Write a short note explaining the difference between:

- data in the URL
- data in the request body

## Teacher note

This lesson usually makes backend development feel more real to students.
Use Postman or a similar tool during class so they can see full JSON input and output clearly.
