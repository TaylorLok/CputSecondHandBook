package service;

import Domain.UserRegistration;

import java.util.Set;

public interface UserRegistrationService extends IService<UserRegistration,String>
{
    Set<UserRegistration> getAll();
}
