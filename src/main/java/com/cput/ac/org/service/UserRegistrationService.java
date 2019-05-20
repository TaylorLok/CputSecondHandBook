package com.cput.org.Controller.service;

import com.cput.org.Controller.Domain.UserRegistration;

import java.util.Set;

public interface UserRegistrationService extends IService<UserRegistration,String>
{
    Set<UserRegistration> getAll();
}
