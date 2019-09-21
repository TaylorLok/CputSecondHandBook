package com.cput.ac.org.repository;

import com.cput.ac.org.domain.Book;

import java.util.Set;

public interface BookRepository extends IRepository<Book,String>
{
    Set<Book> getAll();
}
