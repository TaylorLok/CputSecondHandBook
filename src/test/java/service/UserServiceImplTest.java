package service;

import com.cput.ac.org.Domain.User;
import com.cput.ac.org.Factory.UserFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.cput.ac.org.repository.UserRepositoryImpl;

public class UserServiceImplTest
{
    private UserRepositoryImpl repository;
    private User user;

    @Before
    public void setUp() throws Exception
    {
        repository = UserRepositoryImpl.getRepository();
        user = UserFactory.getUser("Taylor","Lokombe","214291324","0780140396");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(user),repository.create(user));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(user),repository.update(user));
    }

    @Test
    public void delete()
    {
        repository.delete(user);
    }

    @Test
    public void read()
    {
        repository.read(user);
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}