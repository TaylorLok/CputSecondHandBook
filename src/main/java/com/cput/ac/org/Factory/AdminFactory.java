package com.cput.org.Controller.Factory;

import com.cput.org.Controller.Domain.Admin;
import Util.Misc;


public class AdminFactory
{
    public static Admin getAdmin(String permission)
    {
        return new Admin.Builder().permission(Misc.generatePermission())
                        .permission(permission)
                        .build();
    }
}
