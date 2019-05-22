package com.cput.ac.org.Factory;

import com.cput.ac.org.Domain.Admin;
import com.cput.ac.org.Util.Misc;


public class AdminFactory
{
    public static Admin getAdmin(String permission)
    {
        return new Admin.Builder().permission(Misc.generatePermission())
                        .permission(permission)
                        .build();
    }
}
