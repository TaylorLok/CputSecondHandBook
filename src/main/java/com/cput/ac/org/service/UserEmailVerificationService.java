package com.cput.ac.org.service;

import com.cput.ac.org.domain.UserEmailVerification;

import java.util.Set;

public interface UserEmailVerificationService extends IService<UserEmailVerification,String>
{
    Set<UserEmailVerification> getAll();
}
