package repository;

import Domain.BookByAuthor;

import java.util.Set;

public interface BookByAuthorRepository extends IRepository<BookByAuthor,String>
{
   Set<BookByAuthor> getAll();
}
