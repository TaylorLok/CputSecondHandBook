package repository;

import Domain.UserForgotPassword;

import java.util.Set;

public interface UserForgotPasswordRepository extends IRepository<UserForgotPassword,String>
{
  Set<UserForgotPassword> getAll();
}
