# Lesson 32: Authentication and Authorization

## Lesson objective

By the end of this lesson, you should be able to:

- understand authentication
- understand authorization
- explain the difference between them clearly
- use simple real life examples to teach both concepts

## What is authentication?

Authentication means checking who a user is.

It answers the question:

Who are you?

## What is authorization?

Authorization means checking what a user is allowed to do.

It answers the question:

What are you allowed to access or do?

## Simple classroom explanation

Say this in class:

Authentication checks identity.
Authorization checks permission.

## Easy example

A user logs in with username and password.
That is authentication.

After login, the system decides whether the user is:

- admin
- teacher
- student

and what each person can access.
That is authorization.

## Real life analogy

Think of an office building.

- showing your ID card proves who you are
- your access level decides which rooms you can enter

That is the difference between authentication and authorization.

## Why this matters in backend systems

A secure system should not only know that someone logged in.
It should also know what they are allowed to do.

## Common mistakes beginners make

### 1. Using the words as if they mean the same thing
They are related, but not identical.

### 2. Thinking login alone solves all access control problems
Knowing who someone is does not automatically define what they should access.

### 3. Ignoring role based access thinking
Many real systems need role based permissions.

## Assessment

### Short questions

1. What is authentication?
2. What is authorization?
3. What is the key difference between them?
4. Give one real life example showing both concepts.

### Practical task

Imagine a school portal with these roles:

- admin
- teacher
- student

Write one action each role should be allowed to perform.

## Assignment

### Task 1
Write a short note comparing authentication and authorization.

### Task 2
Design a small role table for a library system with:

- librarian
- member
- admin

and list what each role can do.

## Teacher note

This lesson is very important for beginner clarity.
If students understand this distinction well, later security concepts become much easier.
