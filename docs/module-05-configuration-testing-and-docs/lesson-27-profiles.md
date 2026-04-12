# Lesson 27: Profiles in Spring Boot

## Lesson objective

By the end of this lesson, you should be able to:

- understand what profiles are
- explain why different environments may need different settings
- use profile specific configuration files
- teach the idea of `dev`, `test`, and `prod` clearly

## What is a profile?

A profile is a way of grouping configuration for a specific environment.

Common environments include:

- development
- test
- production

## Why profiles matter

Different environments often need different settings.

Examples:

- local development may use H2
- production may use MySQL or PostgreSQL
- test may use a special test setup

## Simple classroom explanation

Say this in class:

Profiles help us change application settings depending on where and how the application is running.

## Example files

- `application.properties`
- `application-dev.properties`
- `application-test.properties`
- `application-prod.properties`

## Example profile setting

```properties
spring.profiles.active=dev
```

That tells Spring Boot to use the development profile.

## Example idea

### `application-dev.properties`
```properties
server.port=8084
spring.jpa.show-sql=true
```

### `application-prod.properties`
```properties
server.port=8080
spring.jpa.show-sql=false
```

## Why this is useful

Profiles help us avoid using the exact same settings everywhere.
That is very important in serious projects.

## Real life analogy

Think of school dress code.

The same student may wear different clothing depending on the activity:

- classroom
- sports day
- formal event

The person is the same, but the setup changes.
That is similar to profiles.

## Common mistakes beginners make

### 1. Using one configuration style for every environment
That can cause problems later.

### 2. Thinking profiles are only for large enterprise systems
Even medium projects benefit from them.

### 3. Not understanding what `dev` and `prod` are meant to represent
They are different environments, not different applications.

## Assessment

### Short questions

1. What is a profile?
2. Why are profiles useful?
3. Give two examples of profile names.
4. Why might development and production use different settings?

### Practical task

Write a simple `application-dev.properties` and `application-prod.properties` with different port values.

## Assignment

### Task 1
Create three profile names for a project and describe what each one is for.

### Task 2
Explain in your own words why one application may need different settings in different environments.

## Teacher note

At this stage, students do not need advanced deployment theory.
They just need to understand that real applications behave differently across environments.
