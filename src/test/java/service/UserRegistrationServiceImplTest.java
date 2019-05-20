package service;

import Domain.UserRegistration;
import Factory.UserRegistrationFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.UserRegistrationRepositoryImpl;

public class UserRegistrationServiceImplTest
{
    private UserRegistrationRepositoryImpl repository;
    private UserRegistration registration;

    @Before
    public void setUp() throws Exception
    {
        repository = (UserRegistrationRepositoryImpl) UserRegistrationRepositoryImpl.getRepository();
        registration = UserRegistrationFactory.getUserRegistration("ekanga","Lokombe","214298751","12345","ekanga@gmail.com");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(registration),repository.create(registration));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(registration),repository.update(registration));
    }

    @Test
    public void delete()
    {
        repository.delete(registration);
    }

    @Test
    public void read()
    {
        repository.read(registration);
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}