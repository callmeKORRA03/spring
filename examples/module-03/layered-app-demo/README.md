# Layered App Demo

This is the example project for Module 03.

## Purpose

This project demonstrates:

- `@Service`
- constructor injection
- simple layered structure
- moving business logic out of the controller

## Project structure

- `controller/GradeController.java`
- `service/GradeService.java`

## Endpoints included

- `GET /welcome`
- `GET /grade?score=75`

## What this teaches

- the controller handles the request
- the service contains the main result logic
- Spring injects the service into the controller

## Suggested test flow

1. Run the application
2. Visit `/welcome`
3. Visit `/grade?score=75`
4. Visit `/grade?score=55`
5. Visit `/grade?score=20`

## Teaching note

This project is intentionally simple.
It is designed to help beginners understand structure before adding repositories and databases.
