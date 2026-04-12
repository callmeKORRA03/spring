# Lesson 22: CRUD Operations in Spring Boot

## Lesson objective

By the end of this lesson, you should be able to:

- explain what CRUD means
- map CRUD ideas to HTTP methods
- understand how repositories support CRUD work
- build a mental model for real backend data operations

## What does CRUD mean?

CRUD stands for:

- Create
- Read
- Update
- Delete

These are four of the most common data operations in backend applications.

## Simple classroom explanation

Say this in class:

CRUD is the basic set of actions we usually perform on stored data.

## CRUD and HTTP methods

### Create
Usually connected to `POST`

### Read
Usually connected to `GET`

### Update
Usually connected to `PUT` or sometimes `PATCH`

### Delete
Usually connected to `DELETE`

## Example idea with students

- create a student
- read all students
- read one student by id
- update one student
- delete one student

## Repository methods often used for CRUD

- `save()` for create and sometimes update
- `findAll()` for reading all
- `findById()` for reading one by id
- `deleteById()` for deleting one by id

## Simple service example idea

```java
public Student createStudent(Student student) {
    return studentRepository.save(student);
}
```

```java
public List<Student> getAllStudents() {
    return studentRepository.findAll();
}
```

```java
public Optional<Student> getStudentById(Long id) {
    return studentRepository.findById(id);
}
```

## Why CRUD matters

Most business systems depend heavily on CRUD style operations.

Examples:

- user management
- product management
- school systems
- blog systems
- library systems

## Real life analogy

Think of student records in a school office.

- Create = add a new student record
- Read = view student records
- Update = change a student's details
- Delete = remove a record

## Common mistakes beginners make

### 1. Thinking `save()` is only for create
It can also be used for updating depending on the situation.

### 2. Forgetting to check if a record exists before updating or deleting
That can cause errors or bad behavior.

### 3. Not connecting CRUD to HTTP methods properly
Students should learn both the data meaning and the web meaning.

## Assessment

### Short questions

1. What does CRUD stand for?
2. Which HTTP method is commonly used for create?
3. Which repository method can read all records?
4. Which repository method can delete by id?

### Practical task

Write down a CRUD flow for a `Book` API.

## Assignment

### Task 1
Design CRUD endpoints for a `Course` resource.

### Task 2
Write a short note explaining how CRUD appears in real applications.

## Teacher note

This lesson is a bridge between theory and the actual API methods students will write.
Keep repeating the connection between CRUD and HTTP methods.
