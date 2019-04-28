package repository;

import Domain.Admin;

import java.util.Set;

public interface AdminRepository extends IRepository <Admin,String>
{
    Set<Admin> getAll();
}
