package com.cput.ac.org.service;

import com.cput.ac.org.domain.UserLogin;
import com.cput.ac.org.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("UserLoginServiceImpl")
public class UserLoginServiceImpl implements UserLoginService
{

     private static UserLoginServiceImpl service = null;
    private Map<String,UserLogin > userLogin;

    private UserLoginServiceImpl()
    {
        this.userLogin = new HashMap<>();
        this.service = service;
    }

    public static UserLoginServiceImpl getService()
    {
        if(service == null) service = new UserLoginServiceImpl();
        return service;

    }

    @Autowired
    UserLoginRepository userLoginRepository;

    @Override
    public UserLogin create(UserLogin login)
    {
        this.userLogin.put(login.getEmailAddress(),login);
        this.userLogin.put(login.getPassword(),login);
        return login;
    }

    @Override
    public UserLogin update(UserLogin login)
    {
        this.userLogin.replace(login.getEmailAddress(),login);
        this.userLogin.replace(login.getPassword(),login);
        return login;
    }

    @Override
    public void delete(UserLogin login)
    {
        this.userLogin.remove(login);

    }

    @Override
    public UserLogin read(UserLogin login)
    {
        this.userLogin.get(login);
        return login;
    }

    @Override
    public Set<UserLogin> getAll() {
        Set<UserLogin> set = new HashSet<>();
        set.addAll(userLoginRepository.findAll());
        return set;
    }
}
