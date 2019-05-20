package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.UserEmailVerification;

import java.util.Set;

public interface UserEmailVerificationRepository extends IRepository<UserEmailVerification,String>
{
    Set<UserEmailVerification> getAll();
}
