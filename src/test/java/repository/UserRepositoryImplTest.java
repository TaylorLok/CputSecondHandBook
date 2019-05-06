package repository;

import Domain.User;
import Factory.UserFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Set;

public class UserRepositoryImplTest
{
    private UserRepository repository;
    private User user, myUser;

    private User SavedUser()
    {
        Set<User> User = this.repository.getAll();
        return User.iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        repository = UserRepositoryImpl.getRepository();
        user = UserFactory.getUser("Taylor","Lokombe","214291324",07);
    }


    @Test
    public void create()
    {
        User created = this.repository.create(this.user);
        System.out.println("In create, a user is been created = " + created);
        getAll();
        Assert.assertSame(created, this.user);

    }


    @Test
    public void update()
    {
        String name ="Junior";
        System.out.println("In update, about_to_updated = " + user);
        User updated = this.repository.update(user);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(name, updated.getStatus());
        getAll();
        Assert.assertEquals(repository.update(user),repository.update(user));

    }

    @Test
    public void read()
    {


    }

    @Test(expected = NoSuchElementException.class)
    public void delete()
    {
        User savedUser = SavedUser();
        this.repository.delete(savedUser);
        getAll();
        //repository.delete(user);
    }


    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}