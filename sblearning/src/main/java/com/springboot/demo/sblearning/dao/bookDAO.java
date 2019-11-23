package com.springboot.demo.sblearning.dao;

import com.springboot.demo.sblearning.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface bookDAO {

    Book selectBookByBookId(@Param("bookId") Integer bookId);
}
