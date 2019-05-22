package com.cput.ac.org.repository;

import com.cput.ac.org.Domain.ShortCourse;

import java.util.Set;

public interface ShortCourseRepository extends IRepository<ShortCourse,String>
{
    Set<ShortCourse> getAll();
}
