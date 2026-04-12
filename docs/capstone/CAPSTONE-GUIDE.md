# Capstone Guide

This guide helps you turn the lessons in this repository into a complete final project.

## What the capstone should prove

Your capstone should show that you can:

- structure a Spring Boot project properly
- create controllers, services, and repositories
- work with CRUD
- validate input
- handle exceptions clearly
- use DTOs
- manage configuration properly
- document and explain your API

## Recommended capstone ideas

Good beginner friendly capstone ideas include:

- student management system
- course registration API
- library management API
- task manager API
- simple inventory management API

## Best capstone size

Keep it small enough to finish cleanly.

A strong small project is better than a huge broken one.

## Recommended project structure

A good beginner capstone should include:

- `controller`
- `service`
- `repository`
- `model`
- `dto`
- `exception`
- `config`

## Minimum required features

Your capstone should ideally include:

1. at least one entity
2. repository layer
3. service layer
4. controller layer
5. full CRUD endpoints
6. validation
7. custom exception handling
8. DTO usage
9. `application.properties`
10. README with setup instructions

## Good add on features

If you are comfortable, you can add:

- Swagger and OpenAPI
- simple Spring Security
- logs
- profile based config
- Dockerfile

## Suggested build order

1. define the project idea
2. design the entity or entities
3. create repository interfaces
4. build service logic
5. build controllers
6. add validation
7. add exception handling
8. add DTOs
9. test endpoints
10. write documentation

## Example capstone: Student Management API

### Entity
Student

### Fields
- id
- name
- email
- course

### Possible endpoints
- `POST /students`
- `GET /students`
- `GET /students/{id}`
- `PUT /students/{id}`
- `DELETE /students/{id}`

### Validation ideas
- name should not be blank
- email should be valid
- course should not be blank

### Exception idea
- student not found by id

## What to show in your README

Your capstone README should explain:

- what the project does
- project structure
- technologies used
- how to run it
- example endpoints
- example request JSON

## Main success rule

A capstone should not only work.
It should also be readable, structured, and explainable.
