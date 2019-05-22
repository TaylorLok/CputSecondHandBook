package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.UserSeller;
import com.cput.ac.org.service.UserSellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/UserSeller")
public class UserSellerController
{

    @Autowired
    private UserSellerServiceImpl service;

    @GetMapping("/create/")
    @ResponseBody
    public UserSeller create(UserSeller user)
    {
        return service.create(user);
    }

    @GetMapping("/update/")
    @ResponseBody
    public UserSeller update(UserSeller user)
    {
        return service.update(user);
    }

    @GetMapping("/read/")
    @ResponseBody
    public UserSeller read(UserSeller user)
    {
        return service.read(user);
    }


    @GetMapping("/delete/")
    @ResponseBody
    public Set<UserSeller> getAll()
    {
        return service.getAll();
    }



}
