package service;

import Domain.User;

import java.util.Set;

public interface UserService extends IService<User, String>
{
    void delete(User user);

    User read(User user);

    User create(User user);

    User update(User user);

    Set<User> getAll();
}
