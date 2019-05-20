package service;

import Domain.UserForgotPassword;

import java.util.Set;

public interface UserForgotPasswordService extends IService<UserForgotPassword,String>
{
    Set<UserForgotPassword> getAll();
}
