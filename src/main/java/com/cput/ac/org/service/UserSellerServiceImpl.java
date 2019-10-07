package com.cput.ac.org.service;

import com.cput.ac.org.domain.UserSeller;
import com.cput.ac.org.repository.UserSellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("UserSellerServiceImpl")
public class UserSellerServiceImpl implements UserSellerService
{
    private static UserSellerServiceImpl service = null;
    private Map<String,UserSeller > userSeller;

    private UserSellerServiceImpl()
    {
        this.userSeller = new HashMap<>();
        this.service = service;
    }

    public static UserSellerServiceImpl getRepository()
    {
        if(service == null) service = new UserSellerServiceImpl();
        return service;

    }

    @Autowired
    UserSellerRepository userSellerRepository;


    @Override
    public UserSeller create(UserSeller seller)
    {
        this.userSeller.put(seller.getName(),seller);
        this.userSeller.put(seller.getSurname(),seller);
        this.userSeller.put(seller.getStudentNumber(),seller);
        this.userSeller.put(seller.getTelNumber(),seller);
        this.userSeller.put(seller.getBookTitle(),seller);
        this.userSeller.put(seller.getBookDesc(),seller);
        this.userSeller.put(String.valueOf(seller.getPrice()),seller);
        this.userSeller.put(seller.getAdvertDate(),seller);
        this.userSeller.put(seller.getExpireDate(),seller);
        return seller;
    }

    @Override
    public UserSeller update(UserSeller seller)
    {
        this.userSeller.replace(seller.getName(),seller);
        this.userSeller.replace(seller.getSurname(),seller);
        this.userSeller.replace(seller.getStudentNumber(),seller);
        this.userSeller.replace(seller.getTelNumber(),seller);
        this.userSeller.replace(seller.getBookTitle(),seller);
        this.userSeller.replace(seller.getBookDesc(),seller);
        this.userSeller.replace(String.valueOf(seller.getPrice()),seller);
        this.userSeller.replace(seller.getAdvertDate(),seller);
        this.userSeller.replace(seller.getExpireDate(),seller);
        return seller;
    }

    @Override
    public void delete(UserSeller seller)
    {
      this.userSeller.remove(seller);
    }

    @Override
    public UserSeller read(UserSeller seller)
    {
        this.userSeller.get(seller);
        return seller;
    }

    @Override
    public Set<UserSeller> getAll()
    {
        Set<UserSeller> set = new HashSet<>();
        set.addAll(userSellerRepository.findAll());
        return set;
    }
}
