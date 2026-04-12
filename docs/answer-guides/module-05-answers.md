# Module 05 Answer Guide

This file contains suggested answers for the assessments in Module 05.

## Lesson 26 suggested answers

1. Configuration is the set of settings that controls how the application behaves.
2. `application.properties` is useful because it keeps application settings organized outside the main business code.
3. Common examples include `spring.application.name`, `server.port`, and H2 or JPA settings.
4. It is better to avoid scattering settings through Java code because that makes the project harder to manage and change.

## Lesson 27 suggested answers

1. A profile is a way of grouping configuration for a specific environment.
2. Profiles are useful because different environments often need different settings.
3. Common examples include `dev`, `test`, and `prod`.
4. Development and production may need different settings because they often run in different conditions and use different resources.

## Lesson 28 suggested answers

1. Logging means recording useful information about what the application is doing.
2. Logs are useful because they help with debugging, tracking behavior, and understanding errors.
3. `INFO` is for important normal application information.
4. `ERROR` is for serious problems or failures.
5. Logs are better than only using `System.out.println()` because they are more structured and more suitable for real applications.

## Lesson 29 suggested answers

1. Testing matters because it helps us check whether the application behaves correctly.
2. One benefit of testing is catching mistakes early.
3. Clean code is easier to test because responsibilities are more separated and methods are easier to reason about.
4. We should think about bad input too because real users and clients may send incorrect or unexpected data.

## Lesson 30 suggested answers

1. API documentation is useful because it helps people understand how to use the API correctly.
2. OpenAPI is a standard for describing APIs clearly.
3. Swagger UI is a browser based interface for viewing and testing API documentation.
4. Backend developers, frontend developers, testers, and new team members all benefit from API documentation.

## Marking guide idea

### Written answers

- full correct answer = 2 marks
- partly correct answer = 1 mark
- wrong or empty answer = 0 marks

### Practical tasks

For configuration and docs tasks, check:

- correct file placement
- clear explanation of purpose
- meaningful log usage
- sensible profile settings
- understandable documentation examples
- test thinking is correct even if the code is basic

## Teacher note

At this stage, students are beginning to think more like real backend developers.
Encourage them to see that a strong backend project is not only about endpoints. It is also about clarity, testing, configuration, and maintainability.
