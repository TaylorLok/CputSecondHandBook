package com.cput.ac.org.controller;

import com.cput.ac.org.domain.BookByAuthor;
import com.cput.ac.org.factory.BookByAuthorFactory;
import com.cput.ac.org.service.BookByAuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;


@RestController
@RequestMapping("/CputSecondHandBook/controller/BookByAuthor")
public class BookByAuthorController
{
    private final BookByAuthorServiceImpl service;

    public BookByAuthorController(BookByAuthorServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/create/")
    @ResponseBody
    public BookByAuthor create(BookByAuthor author)
    {
        author = BookByAuthorFactory.getAuthor("paolo","a brazilian writer");
        return service.create(author);
    }

    @GetMapping("/update/")
    @ResponseBody
    public BookByAuthor update(BookByAuthor author)
    {
        return service.update(author);
    }

    @GetMapping("/read/")
    @ResponseBody
    public BookByAuthor read(BookByAuthor author)
    {
        return service.read(author);
    }


    @GetMapping("/delete/")
    @ResponseBody
    public Set<BookByAuthor> getAll()
    {
        return service.getAll();
    }

}
