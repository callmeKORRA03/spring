# Module 02 Answer Guide

This file contains suggested answers for the assessments in Module 02.

## Lesson 07 suggested answers

1. A request parameter is a small value sent in the URL, usually after a question mark.
2. `@RequestParam` reads request parameter values from the URL.
3. Request parameters appear after `?` in the URL.
4. A default value helps the endpoint still work even if the parameter is not supplied.

## Lesson 08 suggested answers

1. A path variable is a value written directly inside the URL path.
2. `@PathVariable` reads values from the URL path.
3. Example: `/students/5`
4. A path variable is part of the path, while a request parameter is extra data after the question mark.

## Lesson 09 suggested answers

1. POST is mainly used to create new data.
2. A request body is data sent inside the request, not inside the URL.
3. `@RequestBody` maps the incoming request body to a Java object.
4. JSON is common because it is simple and widely used for structured data exchange.

## Lesson 10 suggested answers

1. `200 OK` means the request succeeded.
2. `201 Created` means a new resource was created successfully.
3. `404 Not Found` means the requested item was not found.
4. `ResponseEntity` helps control the response body and status code.

## Lesson 11 suggested answers

1. `@RestController` is mainly used for returning data directly.
2. `@Controller` is mainly used for returning view names.
3. `@RestController` is better for JSON APIs.
4. `@Controller` is better for view rendering.

## Lesson 12 suggested answers

1. `application.properties` is used for configuration settings.
2. It should be placed inside `src/main/resources`.
3. `server.port=8081` changes the application port to 8081.
4. Configuration is useful because it keeps settings organized and easier to change.

## Marking guide idea

### Written answers

- full correct answer = 2 marks
- partly correct answer = 1 mark
- wrong or empty answer = 0 marks

### Practical tasks

For endpoint tasks, check:

- correct annotation
- correct URL design
- correct method behavior
- correct use of request input
- app runs properly

## Teacher note

Accept simple wording if the technical meaning is correct.
At this level, focus more on clear understanding than fancy grammar.
