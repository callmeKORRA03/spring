# Lesson 02: HTTP and REST Basics

## Lesson objective

By the end of this lesson, you should be able to:

- explain what HTTP means
- explain what a request and response are
- understand common HTTP methods
- explain REST in a beginner friendly way

## What is HTTP?

HTTP means HyperText Transfer Protocol.

In simple terms, it is one of the main ways browsers and applications communicate over the web.

When a user opens a page or uses an app feature, a request is often sent through HTTP.
The server then sends a response.

## Simple explanation

Say this in class:

HTTP is the communication system that helps the frontend and backend talk to each other.

## What is a request?

A request is what a client sends to a server.

A client can be:

- a browser
- a mobile app
- Postman
- another backend service

A request may include:

- a URL
- a method like GET or POST
- headers
- query values
- a body

## What is a response?

A response is what the server sends back.

A response may include:

- data
- a message
- a status code
- JSON
- an error message

## Common HTTP methods

### GET
Used to request or read data.

Example:
Get all books.

### POST
Used to create new data.

Example:
Create a new student.

### PUT
Used to update existing data fully.

Example:
Update a product record.

### DELETE
Used to remove data.

Example:
Delete a user account.

## Real life analogy

Think of a library desk.

- GET means you ask to see a book
- POST means you submit a new record
- PUT means you replace old record details
- DELETE means you remove a record

## What is REST?

REST is a style of designing web APIs.

It encourages using clear URLs and proper HTTP methods.

## Simple explanation

Say this in class:

REST is a common way to design backend endpoints so that they are clean, predictable, and easy to use.

## Example REST style URLs

- `GET /students`
- `GET /students/1`
- `POST /students`
- `PUT /students/1`
- `DELETE /students/1`

## What is an endpoint?

An endpoint is the URL path that the backend listens to.

Example:

`/hello`

That is an endpoint.

## What is a status code?

A status code is a number that tells us what happened during the request.

### Common examples

- `200` means success
- `201` means created successfully
- `400` means bad request
- `404` means not found
- `500` means server error

## Why this matters in Spring Boot

Spring Boot controllers receive requests and return responses.
So before learning annotations, you should understand the communication pattern.

## Request flow idea

1. client sends request
2. backend receives request
3. backend processes logic
4. backend returns response

## Common mistakes beginners make

### 1. Mixing up GET and POST
They use GET when they should create data with POST.

### 2. Thinking every URL is RESTful automatically
A clean endpoint structure matters.

### 3. Ignoring status codes
Status codes help developers know what happened.

## Quick classroom example

If a browser goes to:

`http://localhost:8080/hello`

and the backend returns:

`Hello World`

then the browser made a request and the server returned a response.

## Assessment

### Short questions

1. What is HTTP?
2. What is the difference between a request and a response?
3. What is GET used for?
4. What is POST used for?
5. What does a 404 status code mean?

### Quick matching task

Match each method to its main job:

- GET
- POST
- PUT
- DELETE

with:

- remove data
- update data
- read data
- create data

## Assignment

### Task 1
Write a short explanation of these terms in your own words:

- HTTP
- request
- response
- endpoint
- REST

### Task 2
Create five example endpoints for a book management API using proper REST style.

## Teacher note

Spend time on this lesson.
Students who do not understand request and response flow usually struggle later with controllers and CRUD.
