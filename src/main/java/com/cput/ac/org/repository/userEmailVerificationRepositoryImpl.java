package com.cput.ac.org.repository;

import com.cput.ac.org.domain.UserEmailVerification;

import java.util.*;

public class userEmailVerificationRepositoryImpl implements UserEmailVerificationRepository
{
    private static userEmailVerificationRepositoryImpl repository = null;
    private Map<String,UserEmailVerification> emailVer;

    private userEmailVerificationRepositoryImpl()
    {
        this.emailVer = new HashMap<>();
    }

   public static UserEmailVerificationRepository getRepository()
   {
       if(repository==null) repository = new userEmailVerificationRepositoryImpl();
       return repository;
   }

    @Override
    public UserEmailVerification create(UserEmailVerification email)
    {
        this.emailVer.put(email.getUserName(),email);
        this.emailVer.put(email.getStudentNumber(),email);
        this.emailVer.put(email.getEmail(),email);
        this.emailVer.put(email.getVerificationCode(),email);
        return email;
    }

    @Override
    public UserEmailVerification update(UserEmailVerification email)
    {
        this.emailVer.replace(email.getUserName(),email);
        this.emailVer.replace(email.getStudentNumber(),email);
        this.emailVer.replace(email.getEmail(),email);
        this.emailVer.replace(email.getVerificationCode(),email);
        return email;
    }

    @Override
    public void delete(UserEmailVerification email)
    {
        this.emailVer.remove(email);
    }

    @Override
    public UserEmailVerification read(UserEmailVerification email)
    {
        this.emailVer.get(email);
        return email;
    }

    @Override
    public Set<UserEmailVerification> getAll()
    {
        Collection<UserEmailVerification> userEmailVerifications = this.emailVer.values();
        Set<UserEmailVerification> set = new HashSet<>();
        set.addAll(userEmailVerifications);
        return set;
    }

}
