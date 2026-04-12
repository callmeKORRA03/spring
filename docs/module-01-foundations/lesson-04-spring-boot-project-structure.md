# Lesson 04: Spring Boot Project Structure

## Lesson objective

By the end of this lesson, you should be able to:

- understand the main folders in a Spring Boot project
- know where Java files belong
- know where HTML and configuration files belong
- explain project structure clearly to students

## Why project structure matters

Many beginners do not fail because Spring Boot is too hard.
They fail because files are placed in the wrong location.

A correct project structure makes the application easier to understand and easier to run.

## Common Spring Boot folder structure

```text
project-name/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/example/demo/
        │       ├── DemoApplication.java
        │       ├── controller/
        │       ├── service/
        │       ├── repository/
        │       └── model/
        └── resources/
            ├── application.properties
            ├── static/
            └── templates/
```

## Simple explanation of each part

### `pom.xml`
This is the Maven configuration file.
It contains dependencies, build settings, and project details.

### `src/main/java`
This is where Java source code lives.

This usually contains:

- main application class
- controllers
- services
- repositories
- models or entities

### `src/main/resources`
This is where configuration files and non Java resources live.

### `application.properties`
This is where common Spring Boot settings can be written.

Example:

- server port
- app name
- database config later

### `static`
This is usually for static files such as:

- CSS
- JavaScript
- images
- simple HTML files served directly

### `templates`
This is commonly used for template based HTML pages when using view technologies such as Thymeleaf.

## Important beginner rule

Do not put HTML files inside Java packages.
Do not put Java classes inside resources.

## Classroom explanation

Say this in class:

Java code belongs in `src/main/java`.
Settings and page resources belong in `src/main/resources`.

## Suggested package structure

A clean beginner structure can look like this:

- `controller`
- `service`
- `repository`
- `model`

This helps students understand separation of concern early.

## Main application class

This file is often placed in the base package.

Example:

```java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```

## Why base package placement matters

If the main class is in the base package, Spring can scan child packages more easily.
That helps controllers and services get detected correctly.

## Common mistakes beginners make

### 1. Creating `templates` inside Java packages
That is wrong. Templates belong inside `resources`.

### 2. Creating Spring classes in random packages
That makes the project harder to understand.

### 3. Forgetting `resources` when using HTML or properties
The project may run, but some files may not be found.

### 4. Putting everything in one package only
This works for very tiny demos, but it becomes messy quickly.

## Quick classroom activity

Ask students to label which folder should contain each item:

- `HelloController.java`
- `application.properties`
- `index.html`
- `StudentService.java`

## Assessment

### Short questions

1. What is the job of `src/main/java`?
2. What is the job of `src/main/resources`?
3. Where should `application.properties` be placed?
4. Where should a controller class be placed?
5. Why should we avoid putting everything in one folder?

### Sorting task

Place these files into the correct location:

- `HomeController.java`
- `style.css`
- `application.properties`
- `BookService.java`
- `index.html`

## Assignment

### Task 1
Draw the Spring Boot project structure in your notebook and label the purpose of each folder.

### Task 2
Create a small sample structure for a school management project with these packages:

- controller
- service
- repository
- model

## Teacher note

This lesson saves time later.
If students understand file placement early, debugging becomes much easier.
