package com.cput.ac.org.repository;

import com.cput.ac.org.Domain.Admin;

import java.util.Set;

public interface AdminRepository extends IRepository <Admin,String>
{
    Set<Admin> getAll();
}
