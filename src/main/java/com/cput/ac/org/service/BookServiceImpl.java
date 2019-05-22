package com.cput.ac.org.service;

import com.cput.ac.org.Domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;
@Service("BookServiceImpl")
public class BookServiceImpl implements BookService
{
    @Autowired
    @Qualifier("BookServiceImpl")
    private static BookServiceImpl service = null;
    private Map<String,Book > book;

    private BookServiceImpl()
    {
        this.book = new HashMap<>();
    }

    public static BookServiceImpl getRepository()
    {
        if(service == null) service = new BookServiceImpl();
        return service;

    }


    public Book create(Book book)
    {
        this.book.put(book.getBookTitle(),book);
        this.book.put(book.getBookDescription(),book);
        this.book.put(book.getBookLanguage(),book);
        this.book.put(book.getPublisher(),book);
        this.book.put(String.valueOf(book.getBookPrice()),book);
        this.book.put(book.getPublicationDate(),book);

        return book;
    }

    public Book update(Book book)
    {
        this.book.replace(book.getBookTitle(),book);
        this.book.replace(book.getBookDescription(),book);
        this.book.replace(book.getBookLanguage(),book);
        this.book.replace(book.getPublisher(),book);
        this.book.replace(String.valueOf(book.getBookPrice()),book);
        this.book.replace(book.getPublicationDate(),book);

        return book;
    }

    @Override
    public void delete(Book book)
    {
        this.book.remove(book);
    }

    @Override
    public Book read(Book book)
    {
        this.book.get(book);

        return book;
    }


    public Set<Book> getAll()
    {
        Collection<Book> book = this.book.values();
        Set<Book> set = new HashSet<>();
        set.addAll(book);
        return set;
    }

}
