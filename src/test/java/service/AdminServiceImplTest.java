package service;

import com.cput.ac.org.domain.Admin;
import com.cput.ac.org.factory.AdminFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.cput.ac.org.repository.AdminRepository;

public class AdminServiceImplTest {

    private AdminRepository repository;// calling the repository
    private Admin admin;//domain

    @Before
    public void setUp() throws Exception
    {
        repository = AdminRepositoryImpl.getRepository();//impli
        admin = AdminFactory.getAdmin("permission");//from factory
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
        Assert.assertEquals(repository.read(admin),repository.read(admin));
    }

    @Test
    public void delete()
    {
        repository.delete(admin);
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(admin),repository.update(admin));
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }

}