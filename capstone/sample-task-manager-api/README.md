# Sample Capstone: Task Manager API

This is a complete beginner friendly capstone starter project.

## Purpose

This project shows how to bring together the main ideas from the handbook into one final sample API.

It includes:

- entity
- repository
- service
- controller
- DTOs
- validation
- exception handling
- CRUD endpoints
- H2 database setup

## Why this project was chosen

A task manager API is simple enough for beginners but still realistic enough to demonstrate backend structure clearly.

## Main entity

`Task`

### Fields
- id
- title
- description
- status

## Endpoints

- `POST /tasks`
- `GET /tasks`
- `GET /tasks/{id}`
- `PUT /tasks/{id}`
- `DELETE /tasks/{id}`

## Example JSON

```json
{
  "title": "Finish Spring Boot lessons",
  "description": "Complete the handbook structure and code examples",
  "status": "IN_PROGRESS"
}
```

## Teaching note

This sample capstone is designed as a model final project.
It is small enough to understand and strong enough to show clean backend design.
