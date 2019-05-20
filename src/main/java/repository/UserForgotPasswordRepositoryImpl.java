package repository;

import Domain.UserForgotPassword;

import java.util.*;

public class UserForgotPasswordRepositoryImpl implements UserForgotPasswordRepository
{

    private static UserForgotPasswordRepository repository;
    private Map<String,UserForgotPassword> userFogotP;

    private UserForgotPasswordRepositoryImpl()
    {
        this.userFogotP = new HashMap<>();
    }

    public static UserForgotPasswordRepositoryImpl getRepository()
    {
        if(repository==null) repository = new UserForgotPasswordRepositoryImpl();
        return (UserForgotPasswordRepositoryImpl) repository;
    }



    @Override
    public UserForgotPassword create(UserForgotPassword userF)
    {
        this.userFogotP.put(userF.getSecretQuestion(),userF);
        this.userFogotP.put(userF.getSecretAnswer(),userF);
        return userF;
    }

    @Override
    public UserForgotPassword update(UserForgotPassword userF)
    {
        this.userFogotP.replace(userF.getSecretQuestion(),userF);
        this.userFogotP.replace(userF.getSecretAnswer(),userF);
        return userF;
    }

    @Override
    public void delete(UserForgotPassword userF)
    {
        this.userFogotP.remove(userF);

    }

    @Override
    public UserForgotPassword read(UserForgotPassword userF)
    {
        this.userFogotP.get(userF);
        return userF;
    }


    public Set<UserForgotPassword> getAll()
    {
        Collection<UserForgotPassword> userForgotPasswords = this.userFogotP.values();
        Set<UserForgotPassword>set = new HashSet<>();
        set.addAll(userForgotPasswords);
        return set;
    }
}
