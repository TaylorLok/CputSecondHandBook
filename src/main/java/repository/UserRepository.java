package repository;

import Domain.User;

import java.util.Set;

public interface UserRepository extends IRepository<User,String>
{
    Set<User> getAll();
}
