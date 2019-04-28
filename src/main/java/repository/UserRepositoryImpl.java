package repository;

import Domain.User;

import java.util.HashSet;
import java.util.Set;

public class UserRepositoryImpl implements UserRepository
{
    private static UserRepositoryImpl repository = null;
    private Set<User> users;

    private UserRepositoryImpl()
    {
        this.users = new HashSet<>();

    }

    public static UserRepositoryImpl getRepository()
    {
        if(repository == null) repository = new UserRepositoryImpl();
        return repository;
    }

    public User create(User user)
    {
        this.users.add(user);
        return user;
    } //adding a new user

    public User read(String name)
    {
        return null;
    }//reading user data

    public void delete(String name)
    {

    }

    public User update(User user)
    {
        return user;
    }// updating a user

    @Override
    public Set<User> getAll()
    {
        return this.users;
    }
}
