package service;

import Domain.User;

import java.util.*;

public class UserServiceImpl implements UserService
{
    private static UserServiceImpl service = null;
    private Map<String,User > userMap;

    private UserServiceImpl()
    {
        this.userMap = new HashMap<>();
    }

    public static UserServiceImpl getRepository()
    {
        if(service == null) service = new UserServiceImpl();
            return service;

    }

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
        Collection<User> users = this.userMap.values();
        Set<User> set = new HashSet<>();
        set.addAll(users);
        return set;
    }
}
