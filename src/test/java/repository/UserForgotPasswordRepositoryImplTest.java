package repository;

import com.cput.ac.org.domain.UserForgotPassword;
import com.cput.ac.org.factory.UserForgotPasswordFactory;
import com.cput.ac.org.repository.UserForgotPasswordRepository;
import com.cput.ac.org.repository.UserForgotPasswordRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserForgotPasswordRepositoryImplTest
{
    private UserForgotPasswordRepository repository;
    private UserForgotPassword userForgot;

    @Before
    public void setUp() throws Exception
    {
        repository = UserForgotPasswordRepositoryImpl.getRepository();
        userForgot = UserForgotPasswordFactory.getUserPassword("name of the mother","Ekanga");
    }

    @Test
    public void create()
    {
        assertEquals(repository.create(userForgot),repository.create(userForgot));
    }

    @Test
    public void update()
    {
        assertEquals(repository.update(userForgot),repository.update(userForgot));
    }

    @Test
    public void delete()
    {
        repository.delete(userForgot);
    }

    @Test
    public void read()
    {
        assertEquals(repository.read(userForgot),repository.read(userForgot));
    }

    @Test
    public void getAll()
    {
        assertEquals(repository.getAll(),repository.getAll());
    }
}