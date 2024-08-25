package com.example.bookexample;

import com.example.bookexample.entity.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BookexampleApplication {

    public static void main(String[] args) {

        SpringApplication.run(BookexampleApplication.class, args);

    }

}
