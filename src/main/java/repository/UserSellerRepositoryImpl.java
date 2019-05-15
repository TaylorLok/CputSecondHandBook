package repository;

import Domain.UserSeller;

import java.util.*;

public class UserSellerRepositoryImpl implements UserSellerRepository
{
    private static UserSellerRepositoryImpl repository = null;
    private Map<String, UserSeller> userSellers;

    private UserSellerRepositoryImpl ()
    {
        this.userSellers = new HashMap<String, UserSeller>();
    }

    protected static UserSellerRepositoryImpl getRepository()
    {
        if(repository==null) repository = new UserSellerRepositoryImpl();
        return repository;
    }



    @Override
    public UserSeller create(UserSeller userSeller)
    {
        this.userSellers.put(userSeller.getName(),userSeller);
        this.userSellers.put(userSeller.getBookDesc(),userSeller);
        this.userSellers.put(userSeller.getBookTitle(),userSeller);
        this.userSellers.put(String.valueOf(userSeller.getPrice()),userSeller);
        this.userSellers.put(userSeller.getExpireDate(),userSeller);
        return userSeller;
    }

    @Override
    public UserSeller update(UserSeller userSeller)
    {
        this.userSellers.replace(userSeller.getAdvertDate(),userSeller);
        this.userSellers.replace(userSeller.getBookDesc(),userSeller);
        this.userSellers.replace(userSeller.getBookTitle(),userSeller);
        this.userSellers.replace(String.valueOf(userSeller.getPrice()),userSeller);
        this.userSellers.replace(userSeller.getExpireDate(),userSeller);
        return this.userSellers.get(userSeller);
    }

    @Override
    public void delete(UserSeller userSeller)
    {
        this.userSellers.remove(userSeller);
    }

    @Override
    public UserSeller read(UserSeller userSeller)
    {
        return this.userSellers.get(userSeller);
    }

    @Override
    public Set<UserSeller> getAll()
    {
        Collection<UserSeller> userSellers = this.userSellers.values();
        Set<UserSeller> set = new HashSet<>();
        set.addAll(userSellers);
        return set;
    }
}
