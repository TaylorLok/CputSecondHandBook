package com.cput.ac.org.controller;

import com.cput.ac.org.domain.BookByCourse;
import com.cput.ac.org.factory.BookByCourseFactory;
import com.cput.ac.org.service.BookByCourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;


@RestController
@RequestMapping("/CputSecondHandBook/controller/BookByCourse")
public class BookByCourseController
{
    private final BookByCourseServiceImpl service;

    public BookByCourseController(BookByCourseServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/create/")
    @ResponseBody
    public BookByCourse create(BookByCourse bookC)
    {
        bookC = BookByCourseFactory.getBookbyCouse("IT","mng","cmrce","mkt","pjmt");
        return service.create(bookC);
    }

    @GetMapping("/update/")
    @ResponseBody
    public BookByCourse update(BookByCourse bookC)
    {
        return service.update(bookC);
    }

    @GetMapping("/read/")
    @ResponseBody
    public BookByCourse read(BookByCourse bookC)
    {
        return service.read(bookC);
    }


    @GetMapping("/delete/")
    @ResponseBody
    public Set<BookByCourse> getAll()
    {
        return service.getAll();
    }
}
