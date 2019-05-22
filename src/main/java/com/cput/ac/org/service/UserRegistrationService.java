package com.cput.ac.org.service;

import com.cput.ac.org.Domain.UserRegistration;

import java.util.Set;

public interface UserRegistrationService extends IService<UserRegistration,String>
{
    Set<UserRegistration> getAll();
}
