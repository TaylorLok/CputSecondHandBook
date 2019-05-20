package service;

import Domain.UserAccount;

import java.util.Set;

public interface UserAccountService extends IService<UserAccount,String>
{
    Set<UserAccount> getAll();
}
