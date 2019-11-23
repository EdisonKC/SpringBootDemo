package com.springboot.demo.sblearning.service;

import com.springboot.demo.sblearning.entity.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    void save(Book book);

    Book getBook(Integer bookId);

    boolean updateByBookId(Book book);

    boolean deleteByBookName(String bookName);
}
