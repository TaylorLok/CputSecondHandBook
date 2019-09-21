package repository;

import com.cput.ac.org.domain.User;
import com.cput.ac.org.factory.UserFactory;
import com.cput.ac.org.repository.UserRepository;
import com.cput.ac.org.repository.UserRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

import static org.junit.Assert.assertEquals;

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

        assertEquals(repository.update(user),repository.update(user));

    }

    @Test
    public void read()
    {

        User student = repository.read(user);
        Assert.assertNotNull(student);

        System.out.println(toString());
    }

    @Test
    public void delete()
    {
       repository.delete(user);
    }


    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}