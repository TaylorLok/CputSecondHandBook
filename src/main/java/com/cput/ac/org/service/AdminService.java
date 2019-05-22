package com.cput.ac.org.service;

import com.cput.ac.org.Domain.Admin;

import java.util.Set;

public interface AdminService extends IService<Admin,String>
{
    Set<Admin> getAll();
}
