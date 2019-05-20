package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.UserRegistration;

import java.util.Set;

public interface UserRegistrationRepository extends IRepository<UserRegistration,String>
{
    Set<UserRegistration> getAll();
}
