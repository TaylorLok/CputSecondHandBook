package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.Book;

import java.util.Set;

public interface BookRepository extends IRepository<Book,String>
{
    Set<Book> getAll();
}
