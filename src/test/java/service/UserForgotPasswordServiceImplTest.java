package service;

import Domain.UserForgotPassword;
import Factory.UserForgotPasswordFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.UserForgotPasswordRepositoryImpl;

import static org.junit.Assert.*;

public class UserForgotPasswordServiceImplTest
{
    private UserForgotPasswordRepositoryImpl repository;
    private UserForgotPassword forgot;

    @Before
    public void setUp() throws Exception
    {
        repository = UserForgotPasswordRepositoryImpl.getRepository();
        forgot = UserForgotPasswordFactory.getUserPassword("your name","Anathi");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(forgot),repository.create(forgot));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(forgot),repository.update(forgot));
    }

    @Test
    public void delete()
    {
        repository.delete(forgot);
    }

    @Test
    public void read()
    {
        repository.read(forgot);
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }

}