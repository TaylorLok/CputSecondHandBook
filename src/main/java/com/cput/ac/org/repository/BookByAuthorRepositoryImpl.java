package com.cput.ac.org.repository;

import com.cput.ac.org.domain.BookByAuthor;

import java.util.*;

public class BookByAuthorRepositoryImpl implements BookByAuthorRepository
{
    private static BookByAuthorRepository repository;
    private Map<String, BookByAuthor> author;

    private BookByAuthorRepositoryImpl()
    {
        this.author = new HashMap<>();
    }

    public static BookByAuthorRepository getRepository()
    {
        if(repository == null) repository = new BookByAuthorRepositoryImpl();
        return repository;
    }


    @Override
    public BookByAuthor create(BookByAuthor bookAuthor)
    {
        this.author.put(bookAuthor.getName(),bookAuthor);
        this.author.put(bookAuthor.getBio(),bookAuthor);
        return bookAuthor;
    }

    @Override
    public BookByAuthor update(BookByAuthor bookAuthor )
    {
        this.author.replace(bookAuthor.getName(),bookAuthor);
        this.author.replace(bookAuthor.getBio(),bookAuthor);
        return bookAuthor;
    }

    @Override
    public void delete(BookByAuthor bookAuthor)
    {
        this.author.remove(bookAuthor);
    }

    @Override
    public BookByAuthor read(BookByAuthor bookAuthor)
    {
        this.author.get(bookAuthor);
        return bookAuthor;
    }

    @Override
    public Set<BookByAuthor> getAll() {
        Collection<BookByAuthor> byAuthors = this.author.values();
        Set<BookByAuthor> set = new HashSet<>();
        set.addAll(byAuthors);
        return set;
    }
}
