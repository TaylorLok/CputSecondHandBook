package com.cput.ac.org.service;

import com.cput.ac.org.domain.User;

import java.util.Set;

public interface UserService extends IService<User, String>
{
    void delete(User type);

    User read(User user);

    User create(User user);

    User update(User user);

    Set<User> getAll();
}
