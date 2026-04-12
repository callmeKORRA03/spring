# Web Core Demo

This is the example project for Module 02.

## Purpose

This project demonstrates:

- `@RequestParam`
- `@PathVariable`
- `@PostMapping`
- `@RequestBody`
- `ResponseEntity`
- simple status code handling

## Endpoints included

- `GET /books`
- `GET /books/search?title=Java`
- `GET /books/{id}`
- `POST /books`

## Notes

This project uses an in memory list for simplicity.
It is intentionally small and beginner friendly.

## Suggested test flow

1. Run the application
2. Test `GET /books`
3. Test `GET /books/search?title=Spring`
4. Test `GET /books/1`
5. Test `GET /books/99`
6. Send a POST request to `/books`

## Example JSON for POST

```json
{
  "title": "API Design",
  "author": "Favour"
}
```

## Teaching note

This project is for learning request handling before adding services, repositories, and databases.
