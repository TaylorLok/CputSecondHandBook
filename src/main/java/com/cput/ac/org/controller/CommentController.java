package com.cput.ac.org.controller;


import com.cput.ac.org.domain.Comment;
import com.cput.ac.org.service.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/Comment")
public class CommentController
{
    private final CommentServiceImpl service;

    public CommentController(CommentServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/create/")
    @ResponseBody
    public Comment create(Comment cmnt)
    {
        return service.create(cmnt);
    }

    @GetMapping("/update/")
    @ResponseBody
    public Comment update(Comment cmnt)
    {
        return service.update(cmnt);
    }

    @GetMapping("/read/")
    @ResponseBody
    public Comment read(Comment cmnt)
    {
        return service.read(cmnt);
    }


    @GetMapping("/delete/")
    @ResponseBody
    public Set<Comment> getAll()
    {
        return service.getAll();
    }
}
