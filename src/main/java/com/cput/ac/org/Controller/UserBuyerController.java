package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.UserBuyer;
import com.cput.ac.org.service.UserBuyerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/UserBuyer")
public class UserBuyerController
{
    @Autowired
    private UserBuyerServiceImpl service;

    @GetMapping("/create/")
    @ResponseBody
    public UserBuyer create(UserBuyer useB)
    {
        return service.create(useB);
    }

    @GetMapping("/update/")
    @ResponseBody
    public UserBuyer update(UserBuyer useB)
    {
        return service.update(useB);
    }

    @GetMapping("/read/")
    @ResponseBody
    public UserBuyer read(UserBuyer useB)
    {
        return service.read(useB);
    }


    @GetMapping("/delete/")
    @ResponseBody
    public Set<UserBuyer> getAll()
    {
        return service.getAll();
    }
}
