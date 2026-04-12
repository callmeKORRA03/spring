package com.example.webcore.controller;

import com.example.webcore.model.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final List<Book> books = new ArrayList<>();

    public BookController() {
        books.add(new Book(1, "Java Basics", "Favour"));
        books.add(new Book(2, "Spring Boot Basics", "Aptech"));
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return books;
    }

    @GetMapping("/books/search")
    public String searchBook(@RequestParam(defaultValue = "Unknown") String title) {
        return "Searching for book: " + title;
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<?> getBookById(@PathVariable Integer id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return ResponseEntity.ok(book);
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("message", "Book not found"));
    }

    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        if (book.getId() == null) {
            book.setId(books.size() + 1);
        }

        books.add(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }
}
