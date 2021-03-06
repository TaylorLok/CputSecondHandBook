package com.cput.ac.org.service;

import com.cput.ac.org.domain.User;
import com.cput.ac.org.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService
{
    private static UserServiceImpl service = null;
    private Map<String,User > userMap;

    private UserServiceImpl()
    {
        this.userMap = new HashMap<>();
        this.service = service;
    }

    public static UserServiceImpl getRepository()
    {
        if(service == null) service = new UserServiceImpl();
            return service;

    }

    @Autowired
    UserRepository userRepository;

    @Override
    public User create(User user)
    {
        this.userMap.put(user.getName(),user);
        this.userMap.put(user.getSurname(),user);
        this.userMap.put(user.getStudentNumber(),user);
        this.userMap.put(user.getTelNumber(),user);
        this.userMap.put(user.getCreationDate(),user);
        this.userMap.put(user.getStatus(),user);
        return user;
    }

    @Override
    public User update(User user) {
        this.userMap.replace(user.getName(),user);
        this.userMap.replace(user.getSurname(),user);
        this.userMap.replace(user.getStudentNumber(),user);
        this.userMap.replace(user.getTelNumber(),user);
        this.userMap.replace(user.getCreationDate(),user);
        this.userMap.replace(user.getStatus(),user);
        return user;
    }

    @Override
    public void delete(User user)
    {
        this.userMap.remove(user);
    }

    @Override
    public User read(User user)
    {
        this.userMap.get(user);
        return user;
    }

    @Override
    public Set<User> getAll() {
        Set<User> set = new HashSet<>();
        set.addAll(userRepository.findAll());
        return set;
    }
}
