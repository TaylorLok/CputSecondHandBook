package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.UserForgotPassword;

import java.util.Set;

public interface UserForgotPasswordRepository extends IRepository<UserForgotPassword,String>
{
  Set<UserForgotPassword> getAll();
}
