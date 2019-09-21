package com.cput.ac.org.service;

import com.cput.ac.org.domain.UserForgotPassword;

import java.util.Set;

public interface UserForgotPasswordService extends IService<UserForgotPassword,String>
{
    Set<UserForgotPassword> getAll();
}
