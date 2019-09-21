package com.cput.ac.org.service;

import com.cput.ac.org.domain.UserAccount;

import java.util.Set;

public interface UserAccountService extends IService<UserAccount,String>
{
    Set<UserAccount> getAll();
}
