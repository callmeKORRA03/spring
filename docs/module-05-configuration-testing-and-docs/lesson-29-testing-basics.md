# Lesson 29: Testing Basics in Spring Boot

## Lesson objective

By the end of this lesson, you should be able to:

- understand why testing matters
- explain the difference between basic unit thinking and application testing
- understand why clean code is easier to test
- write simple Spring Boot test ideas for beginner projects

## Why testing matters

Testing helps us check whether our code behaves as expected.

It helps reduce fear when changing code later.

## Simple classroom explanation

Say this in class:

Testing is how we check that the application is behaving correctly.

## Why developers test code

They test code to:

- catch mistakes early
- confirm expected behavior
- prevent small changes from breaking old features
- build confidence in the application

## Simple testing ideas

### Unit style thinking
Testing one small part, like a service method.

### Application or integration style thinking
Testing how larger parts work together.

## Example service method to test

```java
public String checkGrade(int score) {
    if (score >= 70) {
        return "Excellent";
    }
    if (score >= 50) {
        return "Pass";
    }
    return "Fail";
}
```

You can test whether the method returns the correct result for different score values.

## Beginner testing benefit

Even if students are not yet writing advanced test suites, they should still understand:

- test inputs
- expected outputs
- confidence through checking behavior

## Real life analogy

Think of testing like checking a calculator.

If you type `2 + 2`, you expect `4`.
That is the same thinking behind software tests.

## Common mistakes beginners make

### 1. Thinking testing is only for advanced developers
Testing is useful at every level.

### 2. Writing code that is too tangled to test easily
Cleaner structure makes testing easier.

### 3. Only testing happy paths
It is also important to think about bad input and edge cases.

## Assessment

### Short questions

1. Why does testing matter?
2. What is one benefit of testing?
3. Why is clean code easier to test?
4. Why should we think about bad input too?

### Practical task

Choose one service method in a sample project and list:

- test input
- expected output

for at least three cases.

## Assignment

### Task 1
Write three test cases for a grade checking method.

### Task 2
Explain in your own words why testing helps developers work with more confidence.

## Teacher note

For beginners, focus on testing mindset first.
It is okay to start with simple service logic examples before moving into heavier test frameworks.
