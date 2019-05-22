package com.cput.ac.org.repository;

import com.cput.ac.org.Domain.UserRegistration;

import java.util.Set;

public interface UserRegistrationRepository extends IRepository<UserRegistration,String>
{
    Set<UserRegistration> getAll();
}
