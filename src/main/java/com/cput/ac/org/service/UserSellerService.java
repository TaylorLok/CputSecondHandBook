package com.cput.ac.org.service;

import com.cput.ac.org.domain.UserSeller;

import java.util.Set;

public interface UserSellerService extends IService<UserSeller,String>
{
    Set<UserSeller> getAll();
}
