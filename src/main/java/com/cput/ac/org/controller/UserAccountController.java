package com.cput.ac.org.controller;

import com.cput.ac.org.domain.UserAccount;
import com.cput.ac.org.service.UserAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/UserAccount")
public class UserAccountController
{
    private final UserAccountServiceImpl service;

    public UserAccountController(UserAccountServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/create/")
    @ResponseBody
    public UserAccount create(UserAccount use)
    {
        return service.create(use);
    }

    @GetMapping("/update/")
    @ResponseBody
    public UserAccount update(UserAccount use)
    {
        return service.update(use);
    }

    @GetMapping("/read/")
    @ResponseBody
    public UserAccount read(UserAccount use)
    {
        return service.read(use);
    }


    @GetMapping("/delete/")
    @ResponseBody
    public Set<UserAccount> getAll()
    {
        return service.getAll();
    }

}
