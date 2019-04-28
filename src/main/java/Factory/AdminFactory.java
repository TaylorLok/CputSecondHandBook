package Factory;

import Domain.Admin;


public class AdminFactory
{
    public static Admin getAdmin(String permission)
    {
        return new Admin.Builder()
                        .permission(permission)
                        .build();
    }
}
