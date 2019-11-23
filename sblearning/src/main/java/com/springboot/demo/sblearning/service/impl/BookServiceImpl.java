package com.springboot.demo.sblearning.service.impl;

import com.springboot.demo.sblearning.dao.bookDAO;
import com.springboot.demo.sblearning.entity.Book;
import com.springboot.demo.sblearning.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private bookDAO bookDAO;

    @Override
    public void save(Book book) {

    }

    @Override
    public Book getBook(Integer bookId) {
        return bookDAO.selectBookByBookId(bookId);
    }

    @Override
    public boolean updateByBookId(Book book) {
        return false;
    }

    @Override
    public boolean deleteByBookName(String bookName) {
        return false;
    }
}
