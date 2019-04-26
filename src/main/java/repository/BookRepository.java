package repository;

import Domain.Book;

import java.util.Set;

public interface BookRepository extends IRepository<Book,String>
{
    Set<Book> getAll();
}
