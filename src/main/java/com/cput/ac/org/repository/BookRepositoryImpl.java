package com.cput.ac.org.repository;

import com.cput.ac.org.Domain.Book;

import java.util.*;

public class BookRepositoryImpl implements BookRepository
{
    private static BookRepositoryImpl repository =null;
    private Map<String,Book> books;

    private BookRepositoryImpl()
    {
        this.books = new HashMap<>();
    }

    public static BookRepositoryImpl getRepository()
    {
        if(repository == null) repository = new BookRepositoryImpl();

        return repository;
    }

    public Book create(Book book)
    {
        this.books.put(book.getBookTitle(),book);
        this.books.put(book.getBookDescription(),book);
        this.books.put(book.getBookLanguage(),book);
        this.books.put(book.getPublisher(),book);
        this.books.put(String.valueOf(book.getBookPrice()),book);
        this.books.put(book.getPublicationDate(),book);

        return book;
    }

    public Book update(Book book)
    {
        this.books.replace(book.getBookTitle(),book);
        this.books.replace(book.getBookDescription(),book);
        this.books.replace(book.getBookLanguage(),book);
        this.books.replace(book.getPublisher(),book);
        this.books.replace(String.valueOf(book.getBookPrice()),book);
        this.books.replace(book.getPublicationDate(),book);

        return book;
    }

    @Override
    public void delete(Book book)
    {
        this.books.remove(books);
    }

    @Override
    public Book read(Book sort)
    {
        this.books.get(books);

        return books.get(books);
    }


    public Set<Book> getAll()
    {
        Collection<Book> book = this.books.values();
        Set<Book> set = new HashSet<>();
        set.addAll(book);
        return set;
    }

}
