package com.cput.org.Controller.service;

import com.cput.org.Controller.Domain.BookByCourse;

import java.util.Set;

public interface BookByCourseService extends IService<BookByCourse,String>
{
    Set<BookByCourse> getAll();
}
