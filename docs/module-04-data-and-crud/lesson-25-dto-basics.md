# Lesson 25: DTO Basics in Spring Boot

## Lesson objective

By the end of this lesson, you should be able to:

- understand what a DTO is
- explain why DTOs are useful
- know the difference between an entity and a DTO
- understand why APIs may not always return entities directly

## What is a DTO?

DTO means Data Transfer Object.

A DTO is a simple object used to move data between parts of the application or between the backend and the client.

## Simple classroom explanation

Say this in class:

A DTO is a special object we use for sending or receiving only the data we want.

## Why DTOs are useful

DTOs help us:

- control what data is exposed
- keep API input and output clean
- avoid sending unnecessary fields
- separate stored data structure from API design

## Entity vs DTO

### Entity
Represents stored data in the database.

### DTO
Represents the data shape we want to send or receive.

## Example idea

### Entity
A `Student` entity may contain:

- id
- name
- email
- course
- internal notes

### DTO
A `StudentResponse` DTO may contain only:

- id
- name
- course

## Example DTO

```java
public class StudentResponse {

    private Long id;
    private String name;
    private String course;

    public StudentResponse() {
    }

    public StudentResponse(Long id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
```

## Simple mapping idea

```java
public StudentResponse toResponse(Student student) {
    return new StudentResponse(
        student.getId(),
        student.getName(),
        student.getCourse()
    );
}
```

## Why not always return the entity directly?

Sometimes the entity contains:

- too much data
- sensitive data
- fields not needed by the client
- structure that should stay internal

## Real life analogy

Think of a school file.

The school may have a full internal file about a student, but the student report slip sent outside contains only the needed parts.
That report slip is like a DTO.

## Common mistakes beginners make

### 1. Thinking DTOs replace entities entirely
Entities and DTOs serve different roles.

### 2. Sending every field to the client by default
That may expose unnecessary information.

### 3. Thinking DTOs are only for advanced projects
Even beginner projects can benefit from simple DTOs.

## Assessment

### Short questions

1. What does DTO mean?
2. Why are DTOs useful?
3. What is one difference between an entity and a DTO?
4. Why might a backend avoid returning an entity directly?

### Practical task

Create a `BookResponse` DTO with only:

- id
- title
- author

## Assignment

### Task 1
Write a simple `CourseResponse` DTO.

### Task 2
Explain the difference between entity and DTO in your own words.

## Teacher note

Keep DTO examples simple at first.
The main goal is for students to understand control of data shape.
