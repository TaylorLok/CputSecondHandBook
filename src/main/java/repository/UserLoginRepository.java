package repository;

import Domain.UserLogin;

import java.util.Set;

public interface UserLoginRepository extends IRepository<UserLogin,String>
{
    Set<UserLogin> getAll();
}
