package com.cput.ac.org.controller;

import com.cput.ac.org.domain.UserLogin;
import com.cput.ac.org.service.UserLoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/UserLogin")
public class UserLoginController
{
    private final UserLoginServiceImpl service;

    public UserLoginController(UserLoginServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/create/")
    @ResponseBody
    public UserLogin create(UserLogin user)
    {
        return service.create(user);
    }

    @GetMapping("/update/")
    @ResponseBody
    public UserLogin update(UserLogin user)
    {
        return service.update(user);
    }

    @GetMapping("/read/")
    @ResponseBody
    public UserLogin read(UserLogin user)
    {
        return service.read(user);
    }


    @GetMapping("/delete/")
    @ResponseBody
    public Set<UserLogin> getAll()
    {
        return service.getAll();
    }


}
