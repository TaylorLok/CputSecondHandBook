package repository;

import Domain.UserEmailVerification;

import java.util.Set;

public interface UserEmailVerificationRepository extends IRepository<UserEmailVerification,String>
{
    Set<UserEmailVerification> getAll();
}
