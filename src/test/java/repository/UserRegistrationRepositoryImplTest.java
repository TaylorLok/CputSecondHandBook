package repository;

import com.cput.ac.org.Domain.UserRegistration;
import com.cput.ac.org.Factory.UserRegistrationFactory;
import com.cput.ac.org.repository.UserRegistrationRepository;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class UserRegistrationRepositoryImplTest
{
    private UserRegistrationRepository repository;
    private UserRegistration userReg;



    @Test(expected = NullPointerException.class)
    public void UserRegCreateTest() throws IOException
    {
        UserRegistration user = UserRegistrationFactory.getUserRegistration("kabaso", "Boniface", "214291324", "kabaso@gmail.com", "1234");
        UserRegistration result = repository.create(user);
        //repository = result.getName();
        Assert.assertNotNull(user);

    }

    @Test(expected = NullPointerException.class)
    public void update()
    {
        repository.update(userReg);
        Assert.assertEquals("Taylor",userReg.getName(),toString());
    }

    @Test(expected = NullPointerException.class)
    public void delete()
    {
        repository.delete(userReg);
    }

    @Test(expected = NullPointerException.class)
    public void read()
    {
        UserRegistration userRegistration = repository.read(userReg);
        Assert.assertNotNull(userRegistration);
    }

    @Test(expected = NullPointerException.class)
    public void getAll()
    {
        System.out.println(repository.getAll());
        assertEquals(repository.getAll(),repository.getAll());
    }
}