package service;

import com.cput.ac.org.Domain.UserLogin;
import com.cput.ac.org.Factory.UserLoginFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.cput.ac.org.repository.UserLoginRepositoryImpl;

public class UserLoginServiceImplTest
{
    private UserLoginRepositoryImpl repository;
    private UserLogin login;

    @Before
    public void setUp() throws Exception
    {
        repository = (UserLoginRepositoryImpl) UserLoginRepositoryImpl.getRepository();
        login = UserLoginFactory.createLogin("taylor@gmail.com","1234");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(login),repository.create(login));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(login),repository.update(login));
    }

    @Test
    public void delete()
    {
        repository.delete(login);
    }

    @Test
    public void read()
    {
        repository.read(login);
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}