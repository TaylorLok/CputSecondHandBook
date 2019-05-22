package com.cput.ac.org.service;

import com.cput.ac.org.Domain.Book;

import java.util.Set;

public interface BookService extends IService<Book,String>
{
    Set<Book> getAll();
}
