package repository;

import Domain.UserBuyer;

import java.util.Set;

public interface UserBuyerRepository extends IRepository<UserBuyer,String>
{
    Set<UserBuyer> getAll();
}
