# Module 04 Answer Guide

This file contains suggested answers for the assessments in Module 04.

## Lesson 19 suggested answers

1. A database is an organized place where an application stores data.
2. JPA stands for Java Persistence API.
3. JPA is useful because it helps us work with database data using Java objects more easily.
4. A Java class can represent a database table, and a Java object can represent one record.

## Lesson 20 suggested answers

1. An entity is a Java class that represents stored database data.
2. `@Entity` tells JPA that the class should be treated as a database entity.
3. `@Id` marks the primary key field.
4. `@GeneratedValue` helps the id get generated automatically.
5. A primary key is important because it identifies each record uniquely.

## Lesson 21 suggested answers

1. A repository helps the application work with stored data.
2. `JpaRepository` is a Spring Data JPA interface that provides ready made database methods.
3. Examples include `save()`, `findAll()`, `findById()`, and `deleteById()`.
4. In `JpaRepository<Student, Long>`, `Student` is the entity type and `Long` is the id type.

## Lesson 22 suggested answers

1. CRUD stands for Create, Read, Update, and Delete.
2. `POST` is commonly used for create.
3. `findAll()` can read all records.
4. `deleteById()` can delete by id.

## Lesson 23 suggested answers

1. Validation means checking whether incoming data matches expected rules.
2. Validation is important because it helps stop bad or incomplete data from entering the system.
3. `@NotBlank` checks that text is not empty or just spaces.
4. `@Email` checks for an email style format.
5. `@Valid` tells Spring to validate the object.

## Lesson 24 suggested answers

1. An exception is a problem that happens while the application is running.
2. Friendly error handling is important because it gives clearer and more useful responses.
3. `@ControllerAdvice` helps create central exception handling.
4. `@ExceptionHandler` marks a method that handles a specific exception.
5. A custom exception is useful because it helps describe specific problems clearly.

## Lesson 25 suggested answers

1. DTO means Data Transfer Object.
2. DTOs are useful because they help control the data we send or receive.
3. An entity represents stored data, while a DTO represents a chosen data shape for transfer.
4. A backend may avoid returning an entity directly because it may contain extra or sensitive data.

## Marking guide idea

### Written answers

- full correct answer = 2 marks
- partly correct answer = 1 mark
- wrong or empty answer = 0 marks

### Practical tasks

For JPA and CRUD tasks, check:

- correct entity annotations
- correct repository definition
- correct service flow
- controller uses proper endpoints
- validation is present where expected
- error handling is understandable

## Teacher note

At this stage, it is important that students understand the relationship between:

- entity
- repository
- service
- controller
- DTO

That full data flow understanding matters more than memorizing terms only.
