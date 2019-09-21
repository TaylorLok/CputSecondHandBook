package com.cput.ac.org.repository;

import com.cput.ac.org.domain.UserLogin;

import java.util.*;

public class UserLoginRepositoryImpl implements UserLoginRepository
{
    private static UserLoginRepositoryImpl repository= null;
    private Map<String, UserLogin> userLogin;

    private UserLoginRepositoryImpl()
    {
        this.userLogin = new HashMap<>();
    }

    public static UserLoginRepository getRepository()
    {
        if(repository == null) repository = new UserLoginRepositoryImpl();
        return repository;
    }




    @Override
    public UserLogin create(UserLogin login)
    {
        this.userLogin.put(login.getEmailAddress(),login);
        this.userLogin.put(login.getPassword(),login);
        System.out.println(toString());

        return login;
    }

    public UserLogin update(UserLogin login)
    {
        this.userLogin.replace(login.getEmailAddress(),login);
        this.userLogin.replace(login.getPassword(),login);
        System.out.println(toString());
        return login;
    }

    public void delete(UserLogin login)
    {
        this.userLogin.remove(login);
        System.out.println(toString());
    }


    public UserLogin read(UserLogin login)
    {
        this.userLogin.get(login);
        return login;
    }


    public Set<UserLogin> getAll()
    {
        Collection<UserLogin> logins = this.userLogin.values();
        Set<UserLogin> set = new HashSet<>();
        set.addAll(logins);
        return set;
    }
}
