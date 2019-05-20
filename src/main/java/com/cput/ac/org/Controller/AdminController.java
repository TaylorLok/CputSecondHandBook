package com.cput.org.Controller;

import com.cput.org.Controller.Domain.Admin;
import com.cput.org.Controller.Factory.AdminFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.cput.org.Controller.service.AdminServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/Admin")
public class AdminController
{
    @Autowired
    private AdminServiceImpl service;

    @GetMapping("/Create/")
    @ResponseBody
    public Admin create(Admin admin)
    {
        Admin admin1 = AdminFactory.getAdmin("permission");
        return service.create(admin1);
    }

    @GetMapping("/Read/")
    @ResponseBody
    public Admin read(Admin admin)
    {
        return service.read(admin);
    }

    @GetMapping("/update/")
    @ResponseBody
    public Admin update(Admin admin)
    {
        return service.update(admin);
    }

    @GetMapping("/delete/")
    @ResponseBody
    public Set<Admin> getAll()
    {
        return service.getAll();
    }

}
