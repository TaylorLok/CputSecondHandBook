package service;

import Domain.Book;

import java.util.Set;

public interface BookService extends IService<Book,String>
{
    Set<Book> getAll();
}
