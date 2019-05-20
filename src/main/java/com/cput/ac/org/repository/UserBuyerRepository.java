package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.UserBuyer;

import java.util.Set;

public interface UserBuyerRepository extends IRepository<UserBuyer,String>
{
    Set<UserBuyer> getAll();
}
