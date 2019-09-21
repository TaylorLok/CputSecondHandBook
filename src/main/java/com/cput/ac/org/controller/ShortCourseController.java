package com.cput.ac.org.controller;

import com.cput.ac.org.domain.ShortCourse;
import com.cput.ac.org.service.ShortCourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/ShortCourse")
public class ShortCourseController
{
    private final ShortCourseServiceImpl service;

    public ShortCourseController(ShortCourseServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/create/")
    @ResponseBody
    public ShortCourse create(ShortCourse course)
    {
        return service.create(course);
    }

    @GetMapping("/update/")
    @ResponseBody
    public ShortCourse update(ShortCourse course)
    {
        return service.update(course);
    }

    @GetMapping("/read/")
    @ResponseBody
    public ShortCourse read(ShortCourse course)
    {
        return service.read(course);
    }


    @GetMapping("/delete/")
    @ResponseBody
    public Set<ShortCourse> getAll()
    {
        return service.getAll();
    }

}
