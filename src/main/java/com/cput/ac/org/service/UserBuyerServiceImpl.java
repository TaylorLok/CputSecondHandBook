package com.cput.ac.org.service;

import com.cput.ac.org.domain.UserBuyer;
import com.cput.ac.org.repository.UserBuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("UserBuyerServiceImpl")
public class UserBuyerServiceImpl implements UserBuyerService
{
    private static UserBuyerServiceImpl service = null;
    private Map<String,UserBuyer > buyerMap;

    private UserBuyerServiceImpl()
    {
        this.buyerMap = new HashMap<>();
        this.service = service;
    }

    public static UserBuyerServiceImpl getRepository()
    {
        if(service == null) service = new UserBuyerServiceImpl();
        return service;

    }

    @Autowired
    UserBuyerRepository userBuyerRepository;

    @Override
    public UserBuyer create(UserBuyer buyer)
    {
        this.buyerMap.put(buyer.getName(),buyer);
        this.buyerMap.put(buyer.getSurname(),buyer);
        return buyer;
    }

    @Override
    public UserBuyer update(UserBuyer buyer)
    {
        this.buyerMap.replace(buyer.getName(),buyer);
        this.buyerMap.replace(buyer.getSurname(),buyer);
        this.buyerMap.replace(buyer.toString(),buyer);
        return buyer;
    }

    @Override
    public void delete(UserBuyer buyer)
    {
       this.buyerMap.remove(buyer);

    }

    @Override
    public UserBuyer read(UserBuyer buyer)
    {
        this.buyerMap.get(buyer);
        return buyer;
    }

    @Override
    public Set<UserBuyer> getAll()
    {
        Set<UserBuyer> set = new HashSet<>();
        set.addAll(userBuyerRepository.findAll());
        return set;
    }

}
