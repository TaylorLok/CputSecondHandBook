package com.cput.ac.org.repository;

import com.cput.ac.org.domain.BookByAuthor;

import java.util.Set;

public interface BookByAuthorRepository extends IRepository<BookByAuthor,String>
{
   Set<BookByAuthor> getAll();
}
