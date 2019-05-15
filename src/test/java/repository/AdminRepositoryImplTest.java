package repository;

import Domain.Admin;
import Factory.AdminFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class AdminRepositoryImplTest
{
    private AdminRepository repository;
    private Admin admin;

    @Before
    public void setUp() throws Exception
    {
        repository = AdminRepositoryImpl.getRepository();
        admin = AdminFactory.getAdmin("permission");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(admin),repository.create(admin));

        System.out.println(toString());
    }

    @Test
    public void read()
    {
       //Assert.assertEquals(repository.read(admin.getPermission(),repository.read(admin));
    }

    @Test
    public void delete()
    {
        repository.delete(admin);
    }

    @Test
    public void update()
    {
        Assert.assertNotNull("permission",admin.getPermission());
        Assert.assertNotNull(admin.getPermission());
    }

    @Test
    public void getAll()
    {
        Set<Admin> admins = this.repository.getAll();
        Assert.assertNotNull("student",admins.size());
    }
}