package com.cput.ac.org.service;

import com.cput.ac.org.Domain.ShortCourse;

import java.util.Set;

public interface ShortCourseService extends IService<ShortCourse,String>
{
    Set<ShortCourse> getAll();
}
