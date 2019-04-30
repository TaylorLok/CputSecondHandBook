package repository;

import Domain.UserAccount;

import java.util.Set;

public interface UserAccountRepository extends IRepository<UserAccount,String>
{
    Set<UserAccount> getAll();
}
