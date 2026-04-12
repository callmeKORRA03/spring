# Module 01 Answer Guide

This file contains suggested answers for the assessments in Module 01.

## Lesson 01 suggested answers

1. Backend development is the part of development that handles logic, data processing, server side work, and communication behind the scenes.
2. Spring is the larger Java framework, while Spring Boot is the easier setup focused tool built on top of Spring.
3. One reason developers like Spring Boot is that it reduces setup stress and helps them build faster.
4. In the restaurant analogy, the kitchen represents the backend.

## Lesson 02 suggested answers

1. HTTP is a communication system used for sending requests and responses over the web.
2. A request is sent by the client to the server, while a response is sent by the server back to the client.
3. GET is mainly used to read or fetch data.
4. POST is mainly used to create new data.
5. A 404 status code means the requested resource was not found.

### Matching task answers

- GET = read data
- POST = create data
- PUT = update data
- DELETE = remove data

## Lesson 03 suggested answers

1. Maven is a Java build tool that helps manage project dependencies and builds.
2. `pom.xml` is the main Maven configuration file.
3. A dependency is a library or package the project needs.
4. A plugin is a build tool extension Maven uses for tasks such as packaging or running the app.
5. `spring-boot-starter-web` helps us build web applications and REST APIs.

## Lesson 04 suggested answers

1. `src/main/java` stores Java source code.
2. `src/main/resources` stores configuration files and other non Java resources.
3. `application.properties` should be placed inside `src/main/resources`.
4. A controller class should be placed inside the Java source package area, usually in a `controller` package.
5. We avoid putting everything in one folder so the project stays clean, readable, and easier to maintain.

## Lesson 05 suggested answers

1. The main application class starts the Spring Boot application.
2. `SpringApplication.run(...)` boots the application and starts the Spring context.
3. `@SpringBootApplication` helps mark the main Spring Boot app and enables common startup configuration.
4. The app can run without endpoints because the application itself can start even before request handling methods are added.

## Lesson 06 suggested answers

1. A controller handles incoming requests and sends back responses.
2. `@RestController` is used for a controller that returns data directly.
3. `@GetMapping` is used to map a method to an HTTP GET request.
4. Visiting `/hello` should call the matching method and return the response text.
5. Yes, Spring Boot can return JSON automatically from simple Java objects such as maps.

## Marking guide idea

### Easy marking approach

- full correct answer = 2 marks
- partly correct answer = 1 mark
- wrong or empty answer = 0 marks

### Practical tasks

For endpoint tasks, check:

- correct annotation
- correct URL mapping
- method returns expected output
- app runs without obvious error

## Teacher note

You can accept small wording differences if the student clearly understands the meaning.
Do not punish simple grammar mistakes when the technical understanding is correct.
