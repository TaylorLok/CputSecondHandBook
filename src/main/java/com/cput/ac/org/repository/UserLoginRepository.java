package com.cput.ac.org.repository;

import com.cput.ac.org.domain.UserLogin;

import java.util.Set;

public interface UserLoginRepository extends IRepository<UserLogin,String>
{
    Set<UserLogin> getAll();
}
