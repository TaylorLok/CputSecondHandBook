package com.cput.ac.org.repository;

import com.cput.ac.org.Domain.User;

import java.util.Set;

public interface UserRepository extends IRepository<User,String>
{
    Set<User> getAll();
}
