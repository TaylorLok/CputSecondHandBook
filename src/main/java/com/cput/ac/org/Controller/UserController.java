package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.User;
import com.cput.ac.org.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/User")
public class UserController
{
    @Autowired
    private UserServiceImpl service;

    @GetMapping("/create/")
    @ResponseBody
    public User create(User user)
    {
        return service.create(user);
    }

    @GetMapping("/update/")
    @ResponseBody
    public User update(User user)
    {
        return service.update(user);
    }

    @GetMapping("/read/")
    @ResponseBody
    public User read(User user)
    {
        return service.read(user);
    }


    @GetMapping("/delete/")
    @ResponseBody
    public Set<User> getAll()
    {
        return service.getAll();
    }
}
