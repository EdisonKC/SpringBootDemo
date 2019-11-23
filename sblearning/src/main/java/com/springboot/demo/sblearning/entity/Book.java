package com.springboot.demo.sblearning.entity;

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 3077272707036929763L;
    private Integer bookId;
    private String bookName;
    private String BookPress;

    public Book(Integer bookId, String bookName, String bookPress) {
        this.bookId = bookId;
        this.bookName = bookName;
        BookPress = bookPress;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPress() {
        return BookPress;
    }

    public void setBookPress(String bookPress) {
        BookPress = bookPress;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", BookPress='" + BookPress + '\'' +
                '}';
    }
}
