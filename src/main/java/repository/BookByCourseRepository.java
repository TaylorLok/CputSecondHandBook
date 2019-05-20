package repository;

import Domain.BookByCourse;

import java.util.Set;

public interface BookByCourseRepository extends IRepository<BookByCourse,String>
{
   Set<BookByCourse> getAll();
}
