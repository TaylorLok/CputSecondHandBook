package com.cput.ac.org.repository;

import com.cput.ac.org.domain.UserSeller;

import java.util.Set;

public interface UserSellerRepository extends IRepository<UserSeller,String>
{
    Set<UserSeller> getAll();
}
