package repository;

import com.cput.ac.org.domain.UserLogin;
import com.cput.ac.org.factory.UserLoginFactory;
import com.cput.ac.org.repository.UserLoginRepository;
import com.cput.ac.org.repository.UserLoginRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserLoginRepositoryImplTest
{
    private UserLoginRepository repository;
    private UserLogin userLogin;

    @Before
    public void setUp() throws Exception
    {
        repository = UserLoginRepositoryImpl.getRepository();
        userLogin = UserLoginFactory.createLogin("tay@gmail.com","12345");
    }

    @Test
    public void create()
    {
        assertEquals(repository.create(userLogin),repository.create(userLogin));
    }

    @Test
    public void update()
    {
        assertEquals(repository.update(userLogin),repository.update(userLogin));
    }

    @Test
    public void delete()
    {
        repository.delete(userLogin);
    }

    @Test
    public void read()
    {
        assertEquals(repository.read(userLogin),repository.read(userLogin));
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}