# Lesson 31: Spring Security Basics

## Lesson objective

By the end of this lesson, you should be able to:

- understand what Spring Security is
- explain why security matters in backend applications
- understand the idea of protected and public endpoints
- explain basic Spring Security concepts in simple English

## Why security matters

A backend application often handles important things such as:

- user accounts
- personal information
- admin actions
- payments
- private records

Because of that, not every endpoint should be open to everyone.

## What is Spring Security?

Spring Security is a Spring framework tool used to help protect applications.

It can help with things like:

- authentication
- authorization
- password handling
- request protection

## Simple classroom explanation

Say this in class:

Spring Security helps us decide who can enter the application and what they are allowed to do.

## Public vs protected endpoints

### Public endpoint
Can be accessed without login.

Example:

- welcome page
- public course list

### Protected endpoint
Needs authentication or permission before access.

Example:

- admin dashboard
- private user data
- delete actions

## Simple example idea

- `/public/hello` should be open
- `/private/hello` should require login

## Why this matters in real projects

Without security, sensitive data and actions may be exposed to the wrong people.

## Real life analogy

Think of a school building.

- the reception area may be public
- the exam office may be restricted

That is similar to public and protected endpoints.

## Common mistakes beginners make

### 1. Thinking security is only needed in large enterprise systems
Even small apps may have protected information.

### 2. Thinking every route should be public during development forever
That creates bad habits.

### 3. Mixing authentication and authorization
They are related, but not the same thing.

## Assessment

### Short questions

1. What is Spring Security?
2. Why does backend security matter?
3. What is the difference between a public endpoint and a protected endpoint?
4. Give one example of an endpoint that should probably be protected.

### Practical task

Write down three endpoints for a small school system and mark each one as:

- public
- protected

## Assignment

### Task 1
Write a short note explaining why not every backend endpoint should be open to everyone.

### Task 2
Create a list of five example endpoints and classify them as public or protected.

## Teacher note

Keep the first security lesson simple.
Students should first understand why security exists before diving into more technical setup.
