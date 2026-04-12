# API Quality Demo

This is the example project for Module 05.

## Purpose

This project demonstrates:

- cleaner configuration
- profiles
- logging
- simple testing
- Swagger and OpenAPI documentation setup

## Main parts

- `model/Course.java`
- `repository/CourseRepository.java`
- `service/CourseService.java`
- `controller/CourseController.java`
- `application.properties`
- `application-dev.properties`
- `application-test.properties`
- `CourseServiceTest.java`

## Endpoints included

- `GET /courses`
- `POST /courses`

## Swagger UI

With the Springdoc dependency included, Swagger UI should be available when the application runs.
A common path is:

`/swagger-ui/index.html`

## Profile idea

- base settings in `application.properties`
- development specific settings in `application-dev.properties`
- test specific settings in `application-test.properties`

## Example JSON for POST

```json
{
  "title": "Spring API Documentation",
  "instructor": "Favour"
}
```

## Testing note

The example includes a simple test class to show beginner friendly testing of service behavior.

## Teaching note

This project is designed to introduce quality related practices without becoming too advanced too early.
