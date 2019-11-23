package com.springboot.demo.sblearning.controller;

import com.springboot.demo.sblearning.entity.Book;
import com.springboot.demo.sblearning.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("book/1")
    public Book getBook () {
        Integer bookId = 1;
        Book book = bookService.getBook(bookId);
        return book;
    }
}
