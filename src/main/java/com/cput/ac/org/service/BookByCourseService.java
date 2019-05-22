package com.cput.ac.org.service;

import com.cput.ac.org.Domain.BookByCourse;

import java.util.Set;

public interface BookByCourseService extends IService<BookByCourse,String>
{
    Set<BookByCourse> getAll();
}
