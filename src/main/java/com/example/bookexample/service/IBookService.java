package com.example.bookexample.service;

import com.example.bookexample.entity.Book;

import java.util.List;

public interface IBookService  {

    public Book getBookById(int id);
    public List<Book> getAllBooks();
    public void addBook(Book book);
    public void deleteBookById(int id);
}
