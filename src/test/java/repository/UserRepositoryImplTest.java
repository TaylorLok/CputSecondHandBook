package repository;

import Domain.User;
import Factory.UserFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
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
        user = UserFactory.getUser("Taylor","Lokombe","214291324","0780140396");
    }



    @Test
    public void UserCreateTest() throws IOException {
        User user = UserFactory.getUser("John"," Doh","214291324", "0780140396");
        User result = repository.create(user);
         result.getStudentNumber();
        Assert.assertNotNull(user);

        System.out.println(toString());

    }


    @Test
    public void update()
    {
        String name ="Junior";
        System.out.println("user name is about to be updated = " + name);
        User updated = this.repository.update(user);
        System.out.println("In update, updated = " + updated);
        Assert.assertEquals(name, updated.getName());
        //getAll();


    }

    @Test
    public void read()
    {

        User student = repository.read(user);
        Assert.assertNotNull(student);

        System.out.println(toString());
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