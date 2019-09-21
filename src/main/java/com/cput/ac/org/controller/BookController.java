package com.cput.ac.org.controller;

import com.cput.ac.org.domain.Book;
import com.cput.ac.org.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/Book")
public class BookController
{

        private final BookServiceImpl service;

    public BookController(BookServiceImpl service) {
        this.service = service;
    }


    @GetMapping("/create/")
        @ResponseBody
        public Book create(Book book)
        {
            return service.create(book);
        }

        @GetMapping("/update/")
        @ResponseBody
        public Book update(Book book)
        {
            return service.update(book);
        }

        @GetMapping("/read/")
        @ResponseBody
        public Book read(Book book)
        {
            return service.read(book);
        }


        @GetMapping("/delete/")
        @ResponseBody
        public Set<Book> getAll()
        {
            return service.getAll();
        }

    }
