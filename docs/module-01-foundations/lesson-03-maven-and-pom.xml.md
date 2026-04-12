# Lesson 03: Maven and `pom.xml`

## Lesson objective

By the end of this lesson, you should be able to:

- explain what Maven is
- explain what `pom.xml` does
- identify the main parts of a simple Spring Boot Maven project
- explain dependencies and plugins in simple English

## What is Maven?

Maven is a build tool used in many Java projects.

It helps developers:

- manage libraries
- build projects
- run projects
- package applications
- keep project structure organized

## Simple classroom explanation

Say this in class:

Maven is a project manager for Java applications.
It helps us bring in the libraries we need and build the project correctly.

## What is `pom.xml`?

`pom.xml` is the main Maven configuration file.

It tells Maven important things about your project, such as:

- project name
- project version
- Java version
- dependencies
- plugins

## Simple meaning of POM

POM means Project Object Model.

## Why `pom.xml` matters in Spring Boot

A normal Java project does not become a Spring Boot project by wish.
It becomes a Spring Boot project when the right Spring Boot dependencies and plugin setup are placed in `pom.xml`.

## Main sections of a simple Spring Boot `pom.xml`

### Project identity
These parts describe the project:

- `groupId`
- `artifactId`
- `version`

### Parent
This often points to the Spring Boot parent configuration.
It helps manage versions and project defaults.

### Properties
This may include the Java version.

### Dependencies
These are the libraries the project needs.

### Build and plugins
These help Maven build and run the application properly.

## Example `pom.xml`

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.5.0</version>
        <relativePath/>
    </parent>

    <groupId>com.example</groupId>
    <artifactId>hello-rest-api</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>hello-rest-api</name>
    <description>First Spring Boot learning project</description>

    <properties>
        <java.version>23</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>
```

## Explanation of the example

### `groupId`
Usually identifies the organization or package group.

### `artifactId`
The project name.

### `version`
The current version of the project.

### `dependencies`
Libraries the application needs.

### `spring-boot-starter-web`
This starter helps us build web applications and REST APIs.

### `spring-boot-maven-plugin`
This helps Maven package and run Spring Boot applications properly.

## Real life analogy

Think of `pom.xml` as a project instruction sheet.
It tells Maven:

- what project this is
- what tools to bring
- how to prepare it
- how to package it

## Common mistakes beginners make

### 1. Thinking `pom.xml` is optional
It is extremely important in Maven based Spring Boot projects.

### 2. Misspelling dependency names
A small spelling mistake can break the build.

### 3. Forgetting to reload the project after editing `pom.xml`
The IDE may not pull the new dependency immediately.

### 4. Using wrong Java version
The Java version in the project should match the environment you are using.

## What to tell students

Say this in class:

The Java files contain our logic.
But `pom.xml` tells Maven what libraries and build instructions the project needs.

## Assessment

### Short questions

1. What is Maven?
2. What does `pom.xml` do?
3. What is a dependency?
4. What is a plugin?
5. What does `spring-boot-starter-web` help us do?

### Small reasoning task

Why can a plain Maven Java project become a Spring Boot project after editing `pom.xml` correctly?

## Assignment

### Task 1
Write a short explanation of these terms:

- Maven
- `pom.xml`
- dependency
- plugin
- `groupId`
- `artifactId`

### Task 2
Look at a simple Spring Boot `pom.xml` and identify:

- the Java version
- the project name
- one dependency
- one plugin

## Teacher note

This lesson is very important for confidence.
When students understand `pom.xml`, they panic less when build errors happen.
