package com.cput.ac.org.repository;

import com.cput.ac.org.Domain.BookByAuthor;

import java.util.Set;

public interface BookByAuthorRepository extends IRepository<BookByAuthor,String>
{
   Set<BookByAuthor> getAll();
}
