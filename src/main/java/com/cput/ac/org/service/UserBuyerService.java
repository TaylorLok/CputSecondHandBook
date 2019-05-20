package com.cput.org.Controller.service;

import com.cput.org.Controller.Domain.UserBuyer;

import java.util.Set;

public interface UserBuyerService extends IService<UserBuyer,String>
{
    Set<UserBuyer> getAll();
}
