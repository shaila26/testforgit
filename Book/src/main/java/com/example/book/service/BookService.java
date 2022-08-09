package com.example.book.service;

import java.util.HashSet;

import com.example.book.model.Book;

public interface BookService {
    HashSet<Book> findAllBook();
    Book findBookByID(long id);
    void addBook(Book b);
    void deleteAllData();
}