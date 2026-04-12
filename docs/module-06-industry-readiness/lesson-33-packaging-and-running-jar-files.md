# Lesson 33: Packaging and Running JAR Files

## Lesson objective

By the end of this lesson, you should be able to:

- understand what packaging means
- explain what a JAR file is
- package a Spring Boot application
- run a Spring Boot JAR file from the command line

## What does packaging mean?

Packaging means preparing the application into a form that can be run or shared more easily.

In Spring Boot, one common package format is a JAR file.

## What is a JAR file?

JAR means Java Archive.

A JAR file is a packaged Java application file.

For Spring Boot, it can contain the application and the embedded server setup needed to run it.

## Simple classroom explanation

Say this in class:

Packaging is like wrapping the application into a ready to run file.

## Common Maven command

```bash
mvn clean package
```

This usually builds the application and creates the package file.

## Running the JAR

```bash
java -jar target/app-name.jar
```

## Why this matters

Packaging matters because applications are not always run directly from the IDE.
In real work, developers often package and run applications in a more deployment ready way.

## Real life analogy

Think of a completed textbook.
While writing, the pages may be separate drafts.
Packaging is like binding them into one proper book that can be distributed.

## Common mistakes beginners make

### 1. Thinking the IDE is the only way to run a Spring Boot app
Real backend work often goes beyond the IDE.

### 2. Forgetting where the packaged file is created
The generated file often appears inside the `target` folder.

### 3. Not understanding why packaging matters for deployment
Deployment usually needs a packaged application form.

## Assessment

### Short questions

1. What does packaging mean?
2. What is a JAR file?
3. What command is often used to package a Maven Spring Boot application?
4. What command is often used to run the JAR file?

### Practical task

Write the command sequence you would use to package and run a Spring Boot app from the terminal.

## Assignment

### Task 1
Write a short note explaining why packaging is useful in real backend work.

### Task 2
Explain what the `target` folder is often used for in a Maven project.

## Teacher note

Students do not need deep build tool mastery yet.
The main goal is for them to understand that a Spring Boot app can be packaged and run outside the IDE.
