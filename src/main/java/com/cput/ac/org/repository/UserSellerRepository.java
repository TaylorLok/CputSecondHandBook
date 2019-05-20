package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.UserSeller;

import java.util.Set;

public interface UserSellerRepository extends IRepository<UserSeller,String>
{
    Set<UserSeller> getAll();
}
