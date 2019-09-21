package com.cput.ac.org.service;

import com.cput.ac.org.domain.UserBuyer;

import java.util.Set;

public interface UserBuyerService extends IService<UserBuyer,String>
{
    Set<UserBuyer> getAll();
}
