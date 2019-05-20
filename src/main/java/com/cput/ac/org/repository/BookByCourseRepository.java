package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.BookByCourse;

import java.util.Set;

public interface BookByCourseRepository extends IRepository<BookByCourse,String>
{
   Set<BookByCourse> getAll();
}
