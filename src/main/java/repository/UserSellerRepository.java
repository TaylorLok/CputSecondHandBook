package repository;

import Domain.UserSeller;

import java.util.Set;

public interface UserSellerRepository extends IRepository<UserSeller,String>
{
    Set<UserSeller> getAll();
}
