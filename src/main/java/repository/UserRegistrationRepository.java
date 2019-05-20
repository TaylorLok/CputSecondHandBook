package repository;

import Domain.UserRegistration;

import java.util.Set;

public interface UserRegistrationRepository extends IRepository<UserRegistration,String>
{
    Set<UserRegistration> getAll();
}
