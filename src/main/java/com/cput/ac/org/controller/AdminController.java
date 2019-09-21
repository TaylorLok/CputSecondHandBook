package com.cput.ac.org.controller;

import com.cput.ac.org.domain.Admin;
import com.cput.ac.org.factory.AdminFactory;
import com.cput.ac.org.service.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/Admin")
public class AdminController
{
    private final AdminServiceImpl service;

    public AdminController(@Qualifier(value = "AdminServiceImpl") AdminServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/Create/{adminPassword}")
    @ResponseBody
    public Admin create(Admin admin, @PathVariable String adminPassword)
    {
         admin = AdminFactory.getAdmin("permission");
        return service.create(admin);
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
