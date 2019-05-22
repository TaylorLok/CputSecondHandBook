package com.cput.ac.org.repository;

import com.cput.ac.org.Domain.UserForgotPassword;

import java.util.Set;

public interface UserForgotPasswordRepository extends IRepository<UserForgotPassword,String>
{
  Set<UserForgotPassword> getAll();
}
