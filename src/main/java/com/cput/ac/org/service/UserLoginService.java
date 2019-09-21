package com.cput.ac.org.service;

import com.cput.ac.org.domain.UserLogin;

import java.util.Set;

public interface UserLoginService extends IService<UserLogin,String>
{
    Set<UserLogin> getAll();
}
