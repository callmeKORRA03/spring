# Module 03 Answer Guide

This file contains suggested answers for the assessments in Module 03.

## Lesson 13 suggested answers

1. Inversion of Control means Spring manages important object creation and wiring instead of the developer handling everything manually.
2. Dependency Injection means an object receives what it needs from outside instead of creating everything by itself.
3. Dependency Injection is useful because it reduces tight coupling and makes code cleaner and easier to test.
4. When a class creates too many things by itself, it becomes more tightly coupled and harder to maintain.

## Lesson 14 suggested answers

1. A bean is a Java object managed by Spring.
2. The ApplicationContext manages beans and important application configuration.
3. No, not every Java object is automatically a Spring bean.
4. Examples include `@Service`, `@RestController`, and `@Component`.

## Lesson 15 suggested answers

1. The service layer is where business logic usually lives.
2. `@Service` marks a class as a service so Spring can manage it.
3. Business logic should not stay only in the controller because it makes the controller too crowded and harder to maintain.
4. Business rules, calculations, checks, and application logic belong in the service layer.

## Lesson 16 suggested answers

1. Constructor injection means giving a class its dependency through its constructor.
2. It is useful because it makes dependencies clear and supports cleaner design.
3. Spring provides the dependency in a Spring Boot application.
4. Manual creation is less clean because the class becomes responsible for creating its own dependency.

## Lesson 17 suggested answers

1. Layered architecture is a way of organizing an application into sections with different responsibilities.
2. The controller layer handles web requests and responses.
3. The service layer handles business logic.
4. The repository layer handles data access and storage work.
5. Layered architecture is useful because it keeps code organized and easier to maintain.

## Lesson 18 suggested answers

1. Refactoring means improving code structure without changing the main visible behavior.
2. Too much business logic in controllers makes them harder to read, test, and maintain.
3. Business logic should usually go into the service layer.
4. One sign is when the controller method has too many conditions or calculations.

## Marking guide idea

### Written answers

- full correct answer = 2 marks
- partly correct answer = 1 mark
- wrong or empty answer = 0 marks

### Practical tasks

For service and injection tasks, check:

- correct use of `@Service`
- correct constructor injection
- controller delegates to service
- code is clean and readable
- app runs correctly

## Teacher note

Focus on whether students truly understand the role of each layer.
At this stage, role confusion matters more than grammar mistakes.
