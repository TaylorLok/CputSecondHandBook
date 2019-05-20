package service;

import Domain.BookByCourse;

import java.util.Set;

public interface BookByCourseService extends IService<BookByCourse,String>
{
    Set<BookByCourse> getAll();
}
