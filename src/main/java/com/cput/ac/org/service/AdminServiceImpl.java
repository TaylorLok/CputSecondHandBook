package com.cput.ac.org.service;

import com.cput.ac.org.Domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("AdminServiceImpl")
public class AdminServiceImpl implements AdminService
{
    @Autowired
    @Qualifier("AdminServiceImpl")
    private static AdminServiceImpl service = null;
    private Map<String,Admin > adminMap;

    private AdminServiceImpl()
    {
        this.adminMap = new HashMap<>();
    }

    public static AdminServiceImpl getRepository()
    {
        if(service == null) service = new AdminServiceImpl();
        return service;

    }


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
        Collection<Admin> admins = this.adminMap.values();
        Set<Admin> set = new HashSet<>();
        set.addAll(admins);
        return set;
    }
}
