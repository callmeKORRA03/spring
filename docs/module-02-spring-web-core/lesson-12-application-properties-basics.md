# Lesson 12: `application.properties` Basics

## Lesson objective

By the end of this lesson, you should be able to:

- understand what `application.properties` is used for
- write simple Spring Boot configuration values
- explain why configuration should not be hardcoded everywhere
- change simple application settings like port and name

## What is `application.properties`?

`application.properties` is a configuration file used by Spring Boot.

It helps us store application settings in one place.

## Simple classroom explanation

Say this in class:

`application.properties` is where we write settings that control how the application behaves.

## Why this file matters

It helps us:

- keep settings outside Java code
- change app behavior easily
- organize important values properly

## Common examples

### Application name
```properties
spring.application.name=web-core-demo
```

### Server port
```properties
server.port=8081
```

If you change the port, your app will run on a different port.

## Full beginner example

```properties
spring.application.name=web-core-demo
server.port=8081
```

## Where the file belongs

It should be placed inside:

`src/main/resources`

## Why not hardcode everything?

If we place all settings directly inside Java files, changing them later becomes harder.
Configuration files help keep those settings organized.

## Real life analogy

Think of a control panel.
Instead of opening the machine itself every time, you use the control panel to adjust settings.
That is what `application.properties` does for many app settings.

## Common mistakes beginners make

### 1. Putting the file in the wrong folder
It should be inside `src/main/resources`.

### 2. Forgetting to use the new port in the browser
If the app runs on `8081`, then `8080` will not work.

### 3. Expecting the file to contain code
It is for configuration, not Java logic.

## Quick classroom practice

Ask students to:

- change the application name
- change the server port
- run the app again
- test the new URL

## Assessment

### Short questions

1. What is `application.properties` used for?
2. Where should it be placed?
3. What does `server.port=8081` do?
4. Why is configuration useful?

### Practical task

Create an `application.properties` file that:

- sets the app name
- changes the port to `8082`

## Assignment

### Task 1
Create a simple Spring Boot project and add an `application.properties` file.

### Task 2
Change the app name and port.

### Task 3
Explain why configuration files are better than scattering settings inside many Java files.

## Teacher note

Keep this lesson simple.
This is only the beginning of configuration.
Later modules can cover more advanced properties and profiles.
