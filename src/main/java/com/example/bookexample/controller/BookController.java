package com.example.bookexample.controller;


import com.example.bookexample.entity.Book;
import com.example.bookexample.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping("/all")
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/add")
    public void saveBook(Book book) {
        bookService.addBook(book);
    }

    @DeleteMapping("/delete")
    public void deleteBookById(int id) {
        bookService.deleteBookById(id);
    }
    @GetMapping("/id?")
    public Book getBookById(int id) {
        return bookService.getBookById(id);
    }
}
