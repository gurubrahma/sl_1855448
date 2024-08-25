package com.example.bookexample.repository;

import com.example.bookexample.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {
}
