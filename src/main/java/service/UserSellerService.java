package service;

import Domain.UserSeller;

import java.util.Set;

public interface UserSellerService extends IService<UserSeller,String>
{
    Set<UserSeller> getAll();
}
