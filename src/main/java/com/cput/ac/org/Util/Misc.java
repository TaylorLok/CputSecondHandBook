package com.cput.ac.org.Util;

import java.util.UUID;

public class Misc
{
    public static String generatePermission()
    {
        return UUID.randomUUID().toString();
    }
}
