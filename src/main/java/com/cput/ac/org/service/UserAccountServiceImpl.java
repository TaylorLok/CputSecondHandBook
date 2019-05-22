package com.cput.ac.org.service;

import com.cput.ac.org.Domain.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("UserAccountServiceImpl")
public class UserAccountServiceImpl implements UserAccountService
{
    @Autowired
    @Qualifier("UserAccountServiceImpl")
    private static UserAccountServiceImpl service = null;
    private Map<String,UserAccount > useraccount;

    private UserAccountServiceImpl()
    {
        this.useraccount = new HashMap<>();
    }

    public static UserAccountServiceImpl getRepository()
    {
        if(service == null) service = new UserAccountServiceImpl();
        return service;

    }

    @Override
    public UserAccount create(UserAccount account)
    {
        this.useraccount.put(account.getCreationDate(),account);
        this.useraccount.put(account.getStatus(),account);
        return account;
    }

    @Override
    public UserAccount update(UserAccount account)
    {
        this.useraccount.replace(account.getCreationDate(),account);
        this.useraccount.replace(account.getStatus(),account);
        return account;
    }

    @Override
    public void delete(UserAccount account)
    {
       this.useraccount.remove(account);
    }

    @Override
    public UserAccount read(UserAccount account)
    {
        this.useraccount.get(account);
        return account;
    }

    @Override
    public Set<UserAccount> getAll() {
        Collection<UserAccount> useraccounts = this.useraccount.values();
        Set<UserAccount> set = new HashSet<>();
        set.addAll(useraccounts);
        return set;
    }
}
