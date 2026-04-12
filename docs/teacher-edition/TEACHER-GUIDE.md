# Teacher Guide

This guide is written for you as the instructor.

It is especially useful if you are learning Spring Boot and teaching it at the same time.

## Main teaching goal

Do not try to impress students with too many advanced ideas too early.

Your first goal is to make students understand:

- what backend means
- what Spring Boot does
- how requests move through an application
- how to build small working examples

## Good teaching order

Use this order most of the time:

1. explain the problem
2. explain the concept in simple words
3. show a small code example
4. run it live
5. let students try it
6. correct mistakes gently
7. give a small assessment
8. give a small assignment

## How to explain Spring Boot simply

Say this in class:

Spring Boot helps us build Java backend applications faster. It gives us sensible defaults, reduces manual setup, and lets us focus more on our application logic.

## How to explain backend simply

Say this in class:

The backend is the part of an application that handles logic, data, and communication with the database or other services. The user may not see it directly, but it is what makes many app features work.

## How to explain a controller

Say this in class:

A controller listens for web requests and decides what response should be sent back.

## How to explain a service

Say this in class:

A service contains the main business logic of the application. It is where we usually keep the real work of the program.

## How to explain a repository

Say this in class:

A repository is the part that helps us save, find, update, and delete data.

## How to explain dependency injection

Say this in class:

Instead of creating everything manually with `new`, Spring can provide the objects we need. This makes the code cleaner and easier to manage.

## Classroom warning signs

These are signs students are getting lost:

- they can type the annotations but cannot explain them
- they forget what a request URL means
- they mix controller logic with service logic
- they copy code without understanding where files belong
- they panic when the application does not run immediately

## What to do when students are confused

1. stop the coding for a moment
2. explain the idea again with one simple analogy
3. return to one small example
4. avoid introducing a new concept at that moment

## Real life analogies you can use

### Spring Boot
A furnished apartment. Many important things are already prepared for you.

### Dependency Injection
A restaurant kitchen. You do not cook every ingredient yourself before eating. The kitchen prepares what is needed and gives it to you.

### Controller
A receptionist. It receives requests and directs them correctly.

### Service
A worker doing the main job behind the scenes.

### Repository
A storage manager or records officer.

## Common mistakes beginners make

### 1. Mixing `@Controller` and `@RestController`
Students often do not know that one is mainly for views and the other is for returning data.

### 2. Writing everything in one class
They put business logic, request handling, and data work inside one file.

### 3. Not understanding `pom.xml`
They think dependencies are magic and do not realize Maven is pulling project libraries for them.

### 4. Folder confusion
They place HTML files inside Java packages or create Spring files in the wrong place.

### 5. Thinking annotations work by magic only
They memorize annotations but do not know what problem each one solves.

## How to teach code

When showing code:

- keep files short
- explain one annotation at a time
- run the app often
- show the browser or Postman result often
- keep method names readable

## Best beginner rhythm for a 2 hour class

- 20 minutes concept explanation
- 25 minutes guided setup or walkthrough
- 30 minutes live coding
- 20 minutes student practice
- 10 minutes correction and recap
- 15 minutes assessment or assignment briefing

## What success looks like

A successful lesson is not when students see many slides.

A successful lesson is when they can answer:

- what this code does
- why this annotation is here
- where this file belongs
- what happens when a request comes in

## Teaching promise for this handbook

Every lesson in this repository is being written to help you:

- learn clearly
- teach confidently
- avoid common beginner confusion
- build real backend skill gradually
