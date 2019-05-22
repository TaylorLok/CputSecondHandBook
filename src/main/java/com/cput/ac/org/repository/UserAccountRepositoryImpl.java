package com.cput.ac.org.repository;

import com.cput.ac.org.Domain.UserAccount;

import java.util.*;

public class UserAccountRepositoryImpl implements UserAccountRepository
{

    private static UserAccountRepositoryImpl repository = null;
    private Map<String, UserAccount> userAcc;

    private UserAccountRepositoryImpl()
    {
        this.userAcc = new HashMap<>();
    }

    public static UserAccountRepositoryImpl getRepository()
    {
        if(repository==null)repository = new UserAccountRepositoryImpl();
        return repository;
    }



    @Override
    public UserAccount create(UserAccount account)
    {
        this.userAcc.put(account.getCreationDate(),account);
        this.userAcc.put(account.getStatus(),account);
        return account;
    }

    @Override
    public UserAccount update(UserAccount account)
    {
        this.userAcc.replace(account.getCreationDate(),account);
        this.userAcc.replace(account.getStatus(),account);
        return account;
    }

    @Override
    public void delete(UserAccount account)
    {
        this.userAcc.remove(account);
    }

    @Override
    public UserAccount read(UserAccount account)
    {
        this.userAcc.get(account);
        return account;
    }

    @Override
    public Set<UserAccount> getAll()
    {
        Collection<UserAccount> accounts = this.userAcc.values();
        Set<UserAccount> set = new HashSet<>();
        set.addAll(accounts);
        return set;
    }
}
