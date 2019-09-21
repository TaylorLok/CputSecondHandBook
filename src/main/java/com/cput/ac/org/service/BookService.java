package com.cput.ac.org.service;

import com.cput.ac.org.domain.Book;

import java.util.Set;

public interface BookService extends IService<Book,String>
{
    Set<Book> getAll();
}
