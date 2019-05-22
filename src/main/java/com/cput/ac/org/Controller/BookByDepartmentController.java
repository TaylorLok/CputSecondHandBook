package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.BookByDepartment;
import com.cput.ac.org.service.BookByDepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/BookByDepartment")
public class BookByDepartmentController
{
    @Autowired
    private BookByDepartmentServiceImpl service;


    @GetMapping("/create/")
    @ResponseBody
    public BookByDepartment create(BookByDepartment bookC)
    {
        return service.create(bookC);
    }

    @GetMapping("/update/")
    @ResponseBody
    public BookByDepartment update(BookByDepartment bookC)
    {
        return service.update(bookC);
    }

    @GetMapping("/read/")
    @ResponseBody
    public BookByDepartment read(BookByDepartment bookC)
    {
        return service.read(bookC);
    }


    @GetMapping("/delete/")
    @ResponseBody
    public Set<BookByDepartment> getAll()
    {
        return service.getAll();
    }

}
