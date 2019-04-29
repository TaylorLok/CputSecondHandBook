package repository;

import Domain.Admin;

import java.util.HashSet;
import java.util.Set;

public class AdminRepositoryImpl implements AdminRepository
{
  private static AdminRepositoryImpl repository = null;
  private Set<Admin> admins;// this is the data store

  private AdminRepositoryImpl()
  {
      this.admins = new HashSet<>();
  }

  protected static AdminRepositoryImpl getRepository()
  {
      if(repository==null) repository = new AdminRepositoryImpl();
      return repository;
  }

  public Admin create(Admin admin)
  {
      this.admins.add(admin);
      return admin;
  }

  public Admin read(String surname)
  {
      //here its require a for loop
      return null;
  }

  public void delete(String surname)
  {

  }

  public Admin update(Admin admin)
  {
      return admin;
  }

    @Override
    public void delete(Admin sort) {

    }

    @Override
    public Admin read(Admin sort) {
        return null;
    }

    public Set<Admin> getAll()
  {
      return admins;
  }
}
