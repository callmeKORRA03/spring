# Lesson 23: Validation Basics in Spring Boot

## Lesson objective

By the end of this lesson, you should be able to:

- understand why validation matters
- explain basic validation in simple English
- recognize common validation annotations
- explain why bad input should not be accepted blindly

## What is validation?

Validation means checking whether incoming data meets the rules we expect.

## Why validation matters

Without validation, users or clients may send bad data such as:

- empty names
- invalid email addresses
- missing important fields
- unrealistic values

## Simple classroom explanation

Say this in class:

Validation helps us protect the application from bad or incomplete input.

## Common validation rules

Examples include:

- a name should not be blank
- an email should look like a valid email
- a price should not be negative
- a required field should not be empty

## Common validation annotations

### `@NotBlank`
Used for text fields that should not be empty or just spaces.

### `@Email`
Used for fields that should contain an email format.

### `@NotNull`
Used when a value must not be null.

## Example DTO or entity style snippet

```java
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class StudentRequest {

    @NotBlank
    private String name;

    @Email
    private String email;

    @NotBlank
    private String course;

    public StudentRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
```

## Using `@Valid` in a controller

```java
@PostMapping("/students")
public Student createStudent(@Valid @RequestBody StudentRequest request) {
    // create student logic
}
```

## What `@Valid` means

`@Valid` tells Spring to check the object against its validation rules.

## Real life analogy

Think of a school admission form.
If important fields are missing or incorrect, the form should not be accepted.
That is what validation helps us do.

## Common mistakes beginners make

### 1. Thinking validation is optional in serious apps
Validation is very important for clean data.

### 2. Accepting any input without checks
That often leads to bad records in the database.

### 3. Forgetting that validation should happen before saving data
We should check the data first.

## Assessment

### Short questions

1. What is validation?
2. Why is validation important?
3. What does `@NotBlank` do?
4. What does `@Email` do?
5. What does `@Valid` do?

### Practical task

Write a request class with:

- `name`
- `email`
- `course`

Then apply suitable validation annotations.

## Assignment

### Task 1
Create a `BookRequest` class with validation rules.

### Task 2
Write a short explanation of what may happen if an app stores invalid input carelessly.

## Teacher note

Keep this lesson practical.
Students should understand validation as protection, not punishment.
