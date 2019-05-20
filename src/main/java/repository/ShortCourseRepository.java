package repository;

import Domain.ShortCourse;

import java.util.Set;

public interface ShortCourseRepository extends IRepository<ShortCourse,String>
{
    Set<ShortCourse> getAll();
}
