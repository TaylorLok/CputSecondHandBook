package com.cput.org.Controller.service;

import com.cput.org.Controller.Domain.UserBuyer;

import java.util.*;

public class UserBuyerServiceImpl implements UserBuyerService
{
    private static UserBuyerServiceImpl service = null;
    private Map<String,UserBuyer > buyerMap;

    private UserBuyerServiceImpl()
    {
        this.buyerMap = new HashMap<>();
    }

    public static UserBuyerServiceImpl getRepository()
    {
        if(service == null) service = new UserBuyerServiceImpl();
        return service;

    }


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
    public Set<UserBuyer> getAll() {
        Collection<UserBuyer> buyerCollection = this.buyerMap.values();
        Set<UserBuyer> set = new HashSet<>();
        set.addAll(buyerCollection);
        return set;
    }

}
