# Student CRUD Demo

This is the example project for Module 04.

## Purpose

This project demonstrates:

- JPA entity mapping
- `JpaRepository`
- CRUD operations
- validation
- DTOs
- custom exception handling
- H2 in memory database usage

## Main parts

- `model/Student.java`
- `repository/StudentRepository.java`
- `dto/StudentRequest.java`
- `dto/StudentResponse.java`
- `service/StudentService.java`
- `controller/StudentController.java`
- `exception/StudentNotFoundException.java`
- `exception/GlobalExceptionHandler.java`

## Endpoints included

- `POST /students`
- `GET /students`
- `GET /students/{id}`
- `PUT /students/{id}`
- `DELETE /students/{id}`

## Example JSON for create and update

```json
{
  "name": "Favour Chibuike",
  "email": "favour@example.com",
  "course": "Spring Boot"
}
```

## H2 console

The H2 console is enabled at:

`/h2-console`

## Suggested test flow

1. Run the application
2. Create a student with `POST /students`
3. Read all students with `GET /students`
4. Read one student with `GET /students/1`
5. Update a student with `PUT /students/1`
6. Delete a student with `DELETE /students/1`

## Teaching note

This project is designed to show a complete beginner friendly data flow:

- request DTO
- service logic
- repository access
- entity persistence
- response DTO
- exception handling
