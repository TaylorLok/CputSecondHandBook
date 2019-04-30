package Domain;

import java.util.Objects;

public class Admin implements Manage
{
    private String permission;

    protected Admin()
    {

    }

    public Admin (Builder builder)
    {
        this.permission = builder.permission;
    }

    public String getPermission()
    {
        return permission;
    }

    @Override
    public String getUser()
    {
        return String.valueOf(this);
    }

    @Override
    public String manageBook()
    {
        return String.valueOf(this);
    }

    @Override
    public String manageAdvert()
    {
        return String.valueOf(this);
    }

    public static class Builder
    {
        private String permission;

        public Builder permission(String permission)
        {
            this.permission = permission;
            return this;
        }

        public Admin build()
        {
            return new Admin(this);
        }

    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Admin)) return false;
        Admin admin = (Admin) o;
        return Objects.equals(permission, admin.permission);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(permission);
    }

    @Override
    public String toString()
    {
        return "Admin{" + "permission='" + permission + '\'' + '}';
    }

}
