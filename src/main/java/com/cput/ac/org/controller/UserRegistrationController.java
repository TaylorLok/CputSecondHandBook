package com.cput.ac.org.controller;

import com.cput.ac.org.domain.UserRegistration;
import com.cput.ac.org.service.UserRegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/UserRegistration")
public class UserRegistrationController
{
    private final UserRegistrationServiceImpl service;

    public UserRegistrationController(UserRegistrationServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/create/")
    @ResponseBody
    public UserRegistration create(UserRegistration user)
    {
        return service.create(user);
    }

    @GetMapping("/update/")
    @ResponseBody
    public UserRegistration update(UserRegistration user)
    {
        return service.update(user);
    }

    @GetMapping("/read/")
    @ResponseBody
    public UserRegistration read(UserRegistration user)
    {
        return service.read(user);
    }


    @GetMapping("/delete/")
    @ResponseBody
    public Set<UserRegistration> getAll()
    {
        return service.getAll();
    }


}
