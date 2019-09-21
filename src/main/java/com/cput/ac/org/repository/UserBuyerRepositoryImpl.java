package com.cput.ac.org.repository;

import com.cput.ac.org.domain.UserBuyer;

import java.util.*;

public class UserBuyerRepositoryImpl implements UserBuyerRepository
{
    private static UserBuyerRepository repository;
    private Map<String,UserBuyer> userBuyer;

   private UserBuyerRepositoryImpl()
   {
       this.userBuyer = new HashMap<>();
   }

   public static UserBuyerRepository getRepository()
   {
       if(repository == null) repository = new UserBuyerRepositoryImpl();
       return repository;
   }


    @Override
    public UserBuyer create(UserBuyer buyer)
    {
        this.userBuyer.put(buyer.getName(),buyer);
        this.userBuyer.put(buyer.getSurname(),buyer);
        return buyer;
    }

    @Override
    public UserBuyer update(UserBuyer buyer)
    {
        this.userBuyer.replace(buyer.getName(),buyer);
        this.userBuyer.replace(buyer.getSurname(),buyer);
        return buyer;
    }

    @Override
    public void delete(UserBuyer buyer)
    {
        this.userBuyer.remove(buyer);

    }

    @Override
    public UserBuyer read(UserBuyer buyer)
    {
        this.userBuyer.get(buyer);
        return buyer;
    }

    @Override
    public Set<UserBuyer> getAll()
    {
        Collection<UserBuyer> userBuyers = this.userBuyer.values();
        Set<UserBuyer> set = new HashSet<>();
        set.addAll(userBuyers);
        return set;
    }
}
