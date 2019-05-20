package service;

import Domain.UserBuyer;

import java.util.Set;

public interface UserBuyerService extends IService<UserBuyer,String>
{
    Set<UserBuyer> getAll();
}
