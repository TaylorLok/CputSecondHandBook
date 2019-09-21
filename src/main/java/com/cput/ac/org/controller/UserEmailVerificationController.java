package com.cput.ac.org.controller;

import com.cput.ac.org.domain.UserEmailVerification;
import com.cput.ac.org.service.UserEmailVerificationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/UserEmailVerification")
public class UserEmailVerificationController
{
    private final UserEmailVerificationServiceImpl service;

    public UserEmailVerificationController(UserEmailVerificationServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/create/")
    @ResponseBody
    public UserEmailVerification create(UserEmailVerification user)
    {
        return service.create(user);
    }

    @GetMapping("/update/")
    @ResponseBody
    public UserEmailVerification update(UserEmailVerification user)
    {
        return service.update(user);
    }

    @GetMapping("/read/")
    @ResponseBody
    public UserEmailVerification read(UserEmailVerification user)
    {
        return service.read(user);
    }


    @GetMapping("/delete/")
    @ResponseBody
    public Set<UserEmailVerification> getAll()
    {
        return service.getAll();
    }

}
