package com.cput.ac.org.repository;

import com.cput.ac.org.domain.UserEmailVerification;

import java.util.Set;

public interface UserEmailVerificationRepository extends IRepository<UserEmailVerification,String>
{
    Set<UserEmailVerification> getAll();
}
