package repository;

import Domain.User;
import Factory.UserFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRepositoryImplTest
{
    private UserRepository repository;
    private User user;

    @Before
    public void setUp() throws Exception
    {
        repository = UserRepositoryImpl.getRepository();
        user = UserFactory.getUser("Taylor","Lokombe","214291324",07);
    }


    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(user),repository.create(user));
    }

    @Test
    public void read()
    {
        Assert.assertEquals(repository.read(user.getName(),repository.read(user.getName()));
    }

    @Test
    public void delete()
    {
        repository.delete(user);
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(user),repository.update(user));
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}