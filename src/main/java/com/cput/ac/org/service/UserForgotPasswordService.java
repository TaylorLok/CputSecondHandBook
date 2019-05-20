package com.cput.org.Controller.service;

import com.cput.org.Controller.Domain.UserForgotPassword;

import java.util.Set;

public interface UserForgotPasswordService extends IService<UserForgotPassword,String>
{
    Set<UserForgotPassword> getAll();
}
