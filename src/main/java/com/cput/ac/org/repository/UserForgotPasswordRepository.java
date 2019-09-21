package com.cput.ac.org.repository;

import com.cput.ac.org.domain.UserForgotPassword;

import java.util.Set;

public interface UserForgotPasswordRepository extends IRepository<UserForgotPassword,String>
{
  Set<UserForgotPassword> getAll();
}
