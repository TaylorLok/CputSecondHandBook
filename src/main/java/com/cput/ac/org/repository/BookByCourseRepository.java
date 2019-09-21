package com.cput.ac.org.repository;

import com.cput.ac.org.domain.BookByCourse;

import java.util.Set;

public interface BookByCourseRepository extends IRepository<BookByCourse,String>
{
   Set<BookByCourse> getAll();
}
