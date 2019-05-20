package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.User;

import java.util.Set;

public interface UserRepository extends IRepository<User,String>
{
    Set<User> getAll();
}
