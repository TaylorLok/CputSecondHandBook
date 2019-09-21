package com.cput.ac.org.controller;

import com.cput.ac.org.domain.UserForgotPassword;
import com.cput.ac.org.service.UserForgotPasswordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/UserForgotpassword")

public class UserForgotPasswordController
{
    private final UserForgotPasswordServiceImpl service;

    public UserForgotPasswordController(UserForgotPasswordServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/create/")
    @ResponseBody
    public UserForgotPassword create(UserForgotPassword user)
    {
        return service.create(user);
    }

    @GetMapping("/update/")
    @ResponseBody
    public UserForgotPassword update(UserForgotPassword user)
    {
        return service.update(user);
    }

    @GetMapping("/read/")
    @ResponseBody
    public UserForgotPassword read(UserForgotPassword user)
    {
        return service.read(user);
    }


    @GetMapping("/delete/")
    @ResponseBody
    public Set<UserForgotPassword> getAll()
    {
        return service.getAll();
    }

}
