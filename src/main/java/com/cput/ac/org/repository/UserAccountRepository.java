package com.cput.ac.org.repository;

import com.cput.ac.org.domain.UserAccount;

import java.util.Set;

public interface UserAccountRepository extends IRepository<UserAccount,String>
{
    Set<UserAccount> getAll();
}
