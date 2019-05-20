package service;

import Domain.UserForgotPassword;
import repository.UserForgotPasswordRepository;

import java.util.*;

public class UserForgotPasswordServiceImpl implements UserForgotPasswordRepository
{
    private static UserForgotPasswordServiceImpl service = null;
    private Map<String,UserForgotPassword > userForgotPassword;

    private UserForgotPasswordServiceImpl()
    {
        this.userForgotPassword = new HashMap<>();
    }

    public static UserForgotPasswordServiceImpl getRepository()
    {
        if(service == null) service = new UserForgotPasswordServiceImpl();
        return service;

    }


    @Override
    public UserForgotPassword create(UserForgotPassword userForgotp)
    {
        this.userForgotPassword.put(userForgotp.getSecretQuestion(),userForgotp);
        this.userForgotPassword.put(userForgotp.getSecretAnswer(),userForgotp);
        return userForgotp;
    }

    @Override
    public UserForgotPassword update(UserForgotPassword userForgotp)
    {
        this.userForgotPassword.replace(userForgotp.getSecretQuestion(),userForgotp);
        this.userForgotPassword.replace(userForgotp.getSecretAnswer(),userForgotp);
        return userForgotp;
    }

    @Override
    public void delete(UserForgotPassword userForgotPassword)
    {
        this.userForgotPassword.remove(userForgotPassword);
    }

    @Override
    public UserForgotPassword read(UserForgotPassword userForgotPassword)
    {
        this.userForgotPassword.get(userForgotPassword);
        return userForgotPassword;
    }

    @Override
    public Set<UserForgotPassword> getAll()
    {
        Collection<UserForgotPassword> userForgotPasswords = this.userForgotPassword.values();
        Set<UserForgotPassword> set = new HashSet<>();
        set.addAll(userForgotPasswords);
        return set;
    }
}
