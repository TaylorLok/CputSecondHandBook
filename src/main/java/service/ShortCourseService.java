package service;

import Domain.ShortCourse;

import java.util.Set;

public interface ShortCourseService extends IService<ShortCourse,String>
{
    Set<ShortCourse> getAll();
}
