package com.cput.ac.org.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {})
public class IndexController
{
    @GetMapping("/")
    @ResponseBody
    public String getHome()
    {

        return "Hello World";
    }
}
