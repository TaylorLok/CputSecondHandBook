package service;

import Domain.BookByAuthor;

import java.util.Set;

public interface BookByAuthorService extends IService<BookByAuthor,String>
{
    Set<BookByAuthor> getAll();
}
