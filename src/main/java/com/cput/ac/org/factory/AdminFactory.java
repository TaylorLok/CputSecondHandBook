package com.cput.ac.org.factory;

import com.cput.ac.org.domain.Admin;
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
