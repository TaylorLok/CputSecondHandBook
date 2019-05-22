package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.SellerRating;
import com.cput.ac.org.service.SellerRatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/CputSecondHandBook/controller/SellerRating")
public class SellerRatingController
{
    @Autowired
    private SellerRatingServiceImpl service;

    @GetMapping("/create/")
    @ResponseBody
    public SellerRating create(SellerRating sell)
    {
        return service.create(sell);
    }

    @GetMapping("/update/")
    @ResponseBody
    public SellerRating update(SellerRating sell)
    {
        return service.update(sell);
    }

    @GetMapping("/read/")
    @ResponseBody
    public SellerRating read(SellerRating sell)
    {
        return service.read(sell);
    }


    @GetMapping("/delete/")
    @ResponseBody
    public Set<SellerRating> getAll()
    {
        return service.getAll();
    }
}
