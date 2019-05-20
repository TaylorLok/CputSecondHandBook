package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.Admin;

import java.util.*;

public class AdminRepositoryImpl implements AdminRepository
{
  private static AdminRepositoryImpl repository = null;
  private Map<String,Admin> admins;// this is the data store

  private AdminRepositoryImpl()
  {
      this.admins = new HashMap<>();
  }

  public static AdminRepositoryImpl getRepository()
  {
      if(repository==null) repository = new AdminRepositoryImpl();
      return repository;
  }

  public Admin create(Admin admin)
  {
      this.admins.put(admin.getUser(),admin);
      this.admins.put(admin.getUser(),admin);
      this.admins.put(admin.getPermission(),admin);
      this.admins.put(admin.manageAdvert(),admin);
      this.admins.put(admin.manageBook(),admin);
      return admin;
  }


  public Admin update(Admin admin)
  {
      this.admins.replace(admin.getUser(),admin);
      this.admins.replace(admin.getUser(),admin);
      this.admins.replace(admin.getPermission(),admin);
      this.admins.replace(admin.manageAdvert(),admin);
      this.admins.replace(admin.manageBook(),admin);
      return admin;
  }

    @Override
    public void delete(Admin admin)
    {
       this.admins.remove(admin);
    }

    @Override
    public Admin read(Admin admin)
    {
        this.admins.get(admin);
        return admin;
    }

    public Set<Admin> getAll()
  {
      Collection<Admin> admins = this.admins.values();
      Set<Admin> set = new HashSet<>();
      set.addAll(admins);
      return set;
  }
}
