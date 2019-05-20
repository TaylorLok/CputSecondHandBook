package service;

import Domain.Admin;

import java.util.Set;

public interface AdminService extends IService<Admin,String>
{
    Set<Admin> getAll();
}
