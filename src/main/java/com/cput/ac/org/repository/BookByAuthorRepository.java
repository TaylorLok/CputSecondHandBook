package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.BookByAuthor;

import java.util.Set;

public interface BookByAuthorRepository extends IRepository<BookByAuthor,String>
{
   Set<BookByAuthor> getAll();
}
