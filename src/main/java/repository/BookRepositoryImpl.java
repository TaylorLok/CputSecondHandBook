package repository;

import Domain.Book;

import java.util.HashSet;
import java.util.Set;

public class BookRepositoryImpl implements BookRepository
{
    private static BookRepositoryImpl repository =null;
    private Set<Book> books;

    private BookRepositoryImpl()
    {
        this.books = new HashSet<>();
    }

    public static BookRepositoryImpl getRepository()
    {
        if(repository == null) repository = new BookRepositoryImpl();

        return repository;
    }

    public Book create(Book e)
    {
        this.books.add(e);
        return e;
    }

    public Book read(String title)
    {
        return null;
    }

    public  void delete(String title)
    {

    }

    public Book update(Book e)
    {
        return e;
    }

    public Set<Book> getAll()
    {
        return this.books;
    }
}
