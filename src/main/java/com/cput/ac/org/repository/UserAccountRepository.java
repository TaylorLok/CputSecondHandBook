package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.UserAccount;

import java.util.Set;

public interface UserAccountRepository extends IRepository<UserAccount,String>
{
    Set<UserAccount> getAll();
}
