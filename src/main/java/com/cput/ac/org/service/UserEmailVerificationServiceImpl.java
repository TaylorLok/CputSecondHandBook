package com.cput.ac.org.service;

import com.cput.ac.org.domain.UserEmailVerification;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("UserEmailVerificationServiceImpl")
public class UserEmailVerificationServiceImpl implements UserEmailVerificationService
{
    private static UserEmailVerificationServiceImpl service = null;
    private Map<String,UserEmailVerification > email;

    private UserEmailVerificationServiceImpl()
    {
        this.email = new HashMap<>();
        this.service = service;
    }

    public static UserEmailVerificationServiceImpl getRepository()
    {
        if(service == null) service = new UserEmailVerificationServiceImpl();
        return service;

    }


    @Override
    public UserEmailVerification create(UserEmailVerification emailver)
    {
        this.email.put(emailver.getUserName(),emailver);
        this.email.put(emailver.getStudentNumber(),emailver);
        this.email.put(emailver.getEmail(),emailver);
        this.email.put(emailver.getVerificationCode(),emailver);
        return emailver;
    }

    @Override
    public UserEmailVerification update(UserEmailVerification emailver)
    {
        this.email.replace(emailver.getUserName(),emailver);
        this.email.replace(emailver.getStudentNumber(),emailver);
        this.email.replace(emailver.getEmail(),emailver);
        this.email.replace(emailver.getVerificationCode(),emailver);
        return emailver;
    }

    @Override
    public void delete(UserEmailVerification emailver)
    {
        this.email.remove(emailver);
    }

    @Override
    public UserEmailVerification read(UserEmailVerification emailver)
    {
        this.email.get(emailver);
        return emailver;
    }

    @Override
    public Set<UserEmailVerification> getAll() {
        Collection<UserEmailVerification> userverify = this.email.values();
        Set<UserEmailVerification> set = new HashSet<>();
        set.addAll(userverify);
        return set;
    }
}
