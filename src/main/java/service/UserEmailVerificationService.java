package service;

import Domain.UserEmailVerification;

import java.util.Set;

public interface UserEmailVerificationService extends IService<UserEmailVerification,String>
{
    Set<UserEmailVerification> getAll();
}
