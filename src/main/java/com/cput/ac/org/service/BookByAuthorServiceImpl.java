package com.cput.ac.org.service;

import com.cput.ac.org.Domain.BookByAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("BookByAuthorServiceImpl")
public class BookByAuthorServiceImpl implements BookByAuthorService
{
    @Autowired
    @Qualifier("BookByAuthorServiceImpl")
    private static BookByAuthorServiceImpl service = null;
    private Map<String, BookByAuthor> authorMap;

    private BookByAuthorServiceImpl()
    {
        this.authorMap = new HashMap<>();
    }

    public static BookByAuthorServiceImpl getRepository()
    {
        if(service == null) service = new BookByAuthorServiceImpl();
        return service;

    }


    @Override
    public BookByAuthor create(BookByAuthor bookAuthor)
    {
        this.authorMap.put(bookAuthor.getName(),bookAuthor);
        this.authorMap.put(bookAuthor.getBio(),bookAuthor);
        return bookAuthor;
    }

    @Override
    public BookByAuthor update(BookByAuthor bookAuthor )
    {
        this.authorMap.replace(bookAuthor.getName(),bookAuthor);
        this.authorMap.replace(bookAuthor.getBio(),bookAuthor);
        return bookAuthor;
    }

    @Override
    public void delete(BookByAuthor bookAuthor)
    {
        this.authorMap.remove(bookAuthor);
    }

    @Override
    public BookByAuthor read(BookByAuthor bookAuthor)
    {
        this.authorMap.get(bookAuthor);
        return bookAuthor;
    }

    @Override
    public Set<BookByAuthor> getAll() {
        Collection<BookByAuthor> byAuthors = this.authorMap.values();
        Set<BookByAuthor> set = new HashSet<>();
        set.addAll(byAuthors);
        return set;
    }
}
