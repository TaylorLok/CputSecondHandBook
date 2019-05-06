package repository;

import Domain.UserAccount;

import java.util.HashSet;
import java.util.Set;

public class UserAccountRepositoryImpl implements UserAccountRepository
{

    private static UserAccountRepositoryImpl repository = null;
    private Set<UserAccount> userAcc;

    private UserAccountRepositoryImpl()
    {
        this.userAcc = new HashSet<>();
    }

    public static UserAccountRepositoryImpl getRepository()
    {
        if(repository==null)repository = new UserAccountRepositoryImpl();
        return repository;
    }



    @Override
    public UserAccount create(UserAccount sort)
    {
        this.userAcc.add(sort);
        return sort;
    }

    @Override
    public UserAccount update(UserAccount sort)
    {
        this.userAcc.add(sort);
        return sort;
    }

    @Override
    public void delete(UserAccount sort)
    {
       repository.userAcc.remove(sort);

    }

    @Override
    public UserAccount read(UserAccount sort)
    {
        if(repository.userAcc.contains(sort))
        {
            return sort;
        }
        return sort;
    }

    @Override
    public Set<UserAccount> getAll()
    {
        return userAcc;
    }
}
