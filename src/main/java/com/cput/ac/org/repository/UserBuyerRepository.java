package com.cput.ac.org.repository;

import com.cput.ac.org.Domain.UserBuyer;

import java.util.Set;

public interface UserBuyerRepository extends IRepository<UserBuyer,String>
{
    Set<UserBuyer> getAll();
}
