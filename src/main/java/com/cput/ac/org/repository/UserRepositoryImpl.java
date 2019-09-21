package com.cput.ac.org.repository;

import com.cput.ac.org.domain.User;

import java.util.*;

public class UserRepositoryImpl implements UserRepository
{
    private static UserRepositoryImpl repository = null;
    private Map<String ,User> users;

    private UserRepositoryImpl()
    {
        this.users = new HashMap<>();

    }

    public static UserRepositoryImpl getRepository()
    {
        if(repository == null) repository = new UserRepositoryImpl();
        return repository;
    }

    public User create(User user)
    {
        this.users.put(user.getName(),user);
        this.users.put(user.getSurname(),user);
        this.users.put(user.getStudentNumber(),user);
        this.users.put(String.valueOf(user.getTelNumber()),user);
        this.users.put(user.getCreationDate(),user);
        this.users.put(user.getStatus(),user);
        return user;
    } //adding a new user

    public User update(User user)
    {

        this.users.replace(user.getName(),user);
        this.users.replace(user.getSurname(),user);
        this.users.replace(user.getName(),user);
        this.users.replace(user.getSurname(),user);
        this.users.replace(user.getStudentNumber(),user);
        this.users.replace(String.valueOf(user.getTelNumber()),user);
        this.users.replace(user.getCreationDate(),user);
        this.users.replace(user.getStatus(),user);
        return user;
    }// updating a user

    @Override
    public void delete(User user)
    {
        this.users.remove(user);
    }

    @Override
    public User read(User user)
    {
        this.users.get(user);
         return user ;
    }

    @Override
    public Set<User> getAll()
    {
        Collection<User> users = this.users.values();
        Set<User> set = new HashSet<>();
        set.addAll(users);
        return set;
    }
}
