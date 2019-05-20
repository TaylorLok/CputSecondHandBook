package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.Admin;

import java.util.Set;

public interface AdminRepository extends IRepository <Admin,String>
{
    Set<Admin> getAll();
}
