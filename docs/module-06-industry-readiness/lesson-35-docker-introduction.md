# Lesson 35: Docker Introduction for Spring Boot Developers

## Lesson objective

By the end of this lesson, you should be able to:

- understand what Docker is in simple terms
- explain why containers are useful
- understand why Docker matters for Spring Boot deployment
- recognize the role of a Dockerfile

## What is Docker?

Docker is a tool used to package applications and their environment in a portable way.

It helps developers run software more consistently across different machines.

## Simple classroom explanation

Say this in class:

Docker helps us package the application with what it needs so it can run more reliably in different environments.

## Why Docker matters

A common backend problem is:

It works on my machine, but not somewhere else.

Docker helps reduce that kind of problem by packaging the application more consistently.

## What is a container?

A container is a packaged environment where the application can run.

## What is a Dockerfile?

A Dockerfile is a file that gives Docker instructions for building that packaged environment.

## Very simple idea

A Dockerfile can say things like:

- which Java image to use
- where to copy the app file
- how to start the app

## Real life analogy

Think of shipping a machine in a prepared box that includes what it needs to arrive and work properly.
That prepared box idea is similar to container thinking.

## Why Spring Boot and Docker work well together

Spring Boot apps can be packaged into JAR files.
That makes them easier to place inside a Docker image.

## Common mistakes beginners make

### 1. Thinking Docker replaces learning Spring Boot
Docker is a packaging and environment tool, not a replacement for backend development knowledge.

### 2. Thinking Docker is only for giant companies
Even small projects benefit from consistent environments.

### 3. Feeling they must master everything at once
At beginner level, it is enough to understand the main idea and basic workflow.

## Assessment

### Short questions

1. What is Docker?
2. Why are containers useful?
3. What is a Dockerfile?
4. Why is Docker useful for backend deployment?

### Practical task

Write down the purpose of a Dockerfile in one or two clear sentences.

## Assignment

### Task 1
Write a short note explaining why Docker helps with environment consistency.

### Task 2
List three things a Dockerfile may need to define for a Spring Boot app.

## Teacher note

Do not overwhelm students with deep container theory.
The goal is for them to understand the role Docker plays in deployment and consistency.
