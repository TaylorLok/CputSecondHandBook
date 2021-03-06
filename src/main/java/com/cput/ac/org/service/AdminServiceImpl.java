package com.cput.ac.org.service;

import com.cput.ac.org.domain.Admin;
import com.cput.ac.org.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service(value = "AdminServiceImpl")
public class AdminServiceImpl implements AdminService
{
    private static AdminServiceImpl service = null;
    private Map<String,Admin > adminMap;

    private AdminServiceImpl()
    {
        this.adminMap = new HashMap<>();
        this.service = service;
    }

    public static AdminServiceImpl getRepository()
    {
        if(service == null) service = new AdminServiceImpl();
        return service;

    }

    @Autowired
    AdminRepository adminRepository;

    public Admin create(Admin admin)
    {
        this.adminMap.put(admin.getUser(),admin);
        this.adminMap.put(admin.getUser(),admin);
        this.adminMap.put(admin.getPermission(),admin);
        this.adminMap.put(admin.manageAdvert(),admin);
        this.adminMap.put(admin.manageBook(),admin);
        return admin;
    }


    public Admin update(Admin admin)
    {
        this.adminMap.replace(admin.getUser(),admin);
        this.adminMap.replace(admin.getUser(),admin);
        this.adminMap.replace(admin.getPermission(),admin);
        this.adminMap.replace(admin.manageAdvert(),admin);
        this.adminMap.replace(admin.manageBook(),admin);
        return admin;
    }

    @Override
    public void delete(Admin admin)
    {
        this.adminMap.remove(admin);
    }

    @Override
    public Admin read(Admin admin)
    {
        this.adminMap.get(admin);
        return admin;
    }

    public Set<Admin> getAll()
    {
        Set<Admin> set = new HashSet<>();
        set.addAll(adminRepository.findAll());
        return set;
    }
}
