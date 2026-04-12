# Lesson 21: Repositories and `JpaRepository`

## Lesson objective

By the end of this lesson, you should be able to:

- understand what a repository does
- explain `JpaRepository` in simple English
- create a repository interface in Spring Boot
- explain why repositories are useful for CRUD work

## What is a repository?

A repository is the part of the application that helps us work with stored data.

It is often responsible for actions like:

- save
- find
- update
- delete

## Simple classroom explanation

Say this in class:

A repository is the layer that helps the application talk to the database in a structured way.

## Why repositories are useful

Without repositories, you may need to write more manual database code.

Spring Data JPA makes this much easier.

## What is `JpaRepository`?

`JpaRepository` is a Spring Data JPA interface that provides many ready made data methods.

Examples include:

- `save()`
- `findAll()`
- `findById()`
- `deleteById()`

## Example repository

```java
package com.example.studentcrud.repository;

import com.example.studentcrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
```

## What does this mean?

- `Student` is the entity type
- `Long` is the type of the primary key

## Why this is powerful

With just that one interface, Spring can provide many common CRUD methods automatically.

## Simple classroom explanation

Say this in class:

`JpaRepository` gives us many useful database methods without writing everything from scratch.

## Real life analogy

Think of a records office assistant.

You do not need to teach the assistant how to do basic filing every time.
Some basic operations are already known.

That is similar to what `JpaRepository` gives us.

## Common mistakes beginners make

### 1. Thinking the repository is the database itself
The repository is not the database. It is a structured way of working with the data.

### 2. Putting business logic inside the repository
Business logic usually belongs in the service layer.

### 3. Using the wrong id type
The second generic type must match the id type of the entity.

## Assessment

### Short questions

1. What does a repository do?
2. What is `JpaRepository`?
3. Name two methods `JpaRepository` can provide.
4. What do the two generic types in `JpaRepository<Student, Long>` mean?

### Practical task

Create a repository for a `Book` entity using `JpaRepository`.

## Assignment

### Task 1
Create a `CourseRepository` for a `Course` entity.

### Task 2
Write a short explanation of why `JpaRepository` saves developers time.

## Teacher note

This lesson often gives students confidence because they see that not every database feature must be built manually.
