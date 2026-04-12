# Lesson 05: Your First Spring Boot App with NetBeans 2024 and Java 23

## Lesson objective

By the end of this lesson, you should be able to:

- create a simple Spring Boot project
- understand the files needed for the first app
- run the application in NetBeans 2024
- explain the role of the main application class

## Goal of this lesson

This lesson is about getting a real Spring Boot application to run.
That moment is very important because it gives beginners confidence.

## Tools used

- Java 23
- NetBeans 2024
- Maven
- Spring Boot

## Minimum files needed

For a very small Spring Boot app, you need:

- `pom.xml`
- main application class
- one controller later

## Example main application class

```java
package com.example.hellorestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloRestApiApplication.class, args);
    }
}
```

## Explanation of this code

### `@SpringBootApplication`
This tells Spring Boot to start a Spring application and apply common setup automatically.

### `main` method
This is the entry point of the application.

### `SpringApplication.run(...)`
This starts the application.
It also starts the embedded server for web applications.

## Simple classroom explanation

Say this in class:

This main class is the starting point of the whole Spring Boot application.
When we run it, Spring Boot starts the app and prepares everything needed.

## Basic `pom.xml` for first app

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

## What should happen when the app runs?

If everything is okay, the application should start without crashing.
Even if there are no endpoints yet, the app should run successfully.

## Common beginner workflow in NetBeans

1. create Maven project
2. edit `pom.xml`
3. add Spring Boot dependency and plugin
4. create main class
5. reload project if needed
6. run the application

## Common problems and simple fixes

### Problem 1: dependencies not recognized
Fix:
- reload Maven project
- check internet connection
- check spelling in `pom.xml`

### Problem 2: wrong Java version
Fix:
- confirm project Java version
- confirm IDE is really using Java 23

### Problem 3: app runs but nothing shows in browser
Fix:
- remember that no endpoint exists yet
- first create a controller and endpoint

### Problem 4: red imports in NetBeans
Fix:
- wait for Maven dependencies to finish loading
- clean and build project

## Real life analogy

The first running app is like switching on a new building for the first time.
The structure exists, electricity is active, but the rooms are not fully furnished yet.

## Assessment

### Short questions

1. What is the job of the main application class?
2. What does `SpringApplication.run(...)` do?
3. What does `@SpringBootApplication` help with?
4. Why can the app run even when there are no endpoints yet?

### Practical check

Ask students to point out which line in the main class starts the application.

## Assignment

### Task 1
Type the main class yourself without copying and explain each line.

### Task 2
Create a short note explaining the purpose of:

- `@SpringBootApplication`
- `main` method
- `SpringApplication.run(...)`

## Teacher note

Celebrate the first successful run.
That moment builds beginner confidence and reduces fear.
