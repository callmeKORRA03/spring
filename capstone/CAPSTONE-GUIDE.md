# Capstone Guide

This guide helps you turn the lessons in this repository into one complete Spring Boot project.

## Purpose of the capstone

The capstone is where you prove that you can combine what you have learned.

It is not about building the biggest project.
It is about building a clean, structured, understandable project.

## Good beginner capstone ideas

Choose one:

- Student Management API
- Library Management API
- Course Registration API
- Book Store Inventory API
- Task Management API

## Minimum features your capstone should include

### Structure
- controller layer
- service layer
- repository layer
- model or entity layer
- DTOs

### Backend features
- create
- read all
- read one by id
- update
- delete

### Quality features
- validation
- exception handling
- clean responses
- configuration file
- basic documentation

## Suggested project flow

1. Choose your domain
2. List your main entities
3. Choose the important fields
4. Create your entities
5. Create repositories
6. Create services
7. Create controllers
8. Add validation
9. Add exception handling
10. Add DTOs
11. Test the endpoints
12. Write basic API documentation

## Example capstone idea: Student Management API

### Main entity
Student

### Fields
- id
- name
- email
- course

### Main endpoints
- `POST /students`
- `GET /students`
- `GET /students/{id}`
- `PUT /students/{id}`
- `DELETE /students/{id}`

### Validation examples
- name must not be blank
- email must be valid
- course must not be blank

### Exception example
- return a clear message if a student id is not found

## What not to do

- do not make the project too large too early
- do not add many unrelated entities just to look advanced
- do not ignore structure for speed
- do not skip testing your endpoints

## How to know your capstone is strong enough

Your capstone is strong enough if:

- it runs correctly
- the code is organized clearly
- the endpoints make sense
- validation works
- exceptions are handled cleanly
- the project is understandable by another developer

## Final advice

A smaller clean project is better than a large confusing one.

Build clearly.
Explain clearly.
Improve steadily.
