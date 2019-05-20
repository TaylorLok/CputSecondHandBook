package service;

import Domain.UserLogin;

import java.util.Set;

public interface UserLoginService extends IService<UserLogin,String>
{
    Set<UserLogin> getAll();
}
