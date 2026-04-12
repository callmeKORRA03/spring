# Lesson 34: Deployment Basics for Spring Boot Applications

## Lesson objective

By the end of this lesson, you should be able to:

- understand what deployment means
- explain why deployment matters in real backend work
- identify simple deployment environments
- understand the difference between local running and deployed running

## What is deployment?

Deployment means making the application available in a place where other people or systems can use it.

## Simple classroom explanation

Say this in class:

Deployment is the process of moving the application from your development machine to a place where it can actually be used.

## Examples of deployment places

A Spring Boot app may be deployed to:

- a cloud server
- a virtual machine
- a container platform
- a company server

## Why deployment matters

An application is not fully useful if it only works on the developer's own computer.

Deployment helps turn local work into usable software.

## Local vs deployed

### Local running
The application runs on your own machine during development.

### Deployed running
The application runs in an environment that other people or systems can access.

## Important deployment thinking

Before deployment, developers often think about:

- configuration
- ports
- environment settings
- databases
- security
- logs

## Real life analogy

Think of building a shop.

Designing and preparing it in a private workshop is like local development.
Opening it in a public location for customers is like deployment.

## Common mistakes beginners make

### 1. Thinking deployment is only about uploading files
Deployment also involves environment setup and configuration.

### 2. Thinking if it runs locally it will automatically run everywhere
Different environments may behave differently.

### 3. Ignoring ports, profiles, or database settings during deployment
These details matter a lot.

## Assessment

### Short questions

1. What is deployment?
2. Why does deployment matter?
3. What is one difference between local running and deployed running?
4. Name two places where a Spring Boot application can be deployed.

### Practical task

List five things you would think about before deploying a Spring Boot project.

## Assignment

### Task 1
Write a short note explaining why deployment is more than just uploading an app.

### Task 2
Imagine you are deploying a student system. List the settings or concerns you would check first.

## Teacher note

This lesson should remain practical and confidence building.
Students do not need advanced cloud engineering yet. They just need to understand the purpose and basic reality of deployment.
