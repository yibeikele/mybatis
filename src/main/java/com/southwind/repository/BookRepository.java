package com.southwind.repository;


import com.southwind.entity.Book;

public interface BookRepository {
    public Book findById(int id);
 }
