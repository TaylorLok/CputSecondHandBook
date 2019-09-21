package repository;

import com.cput.ac.org.domain.UserEmailVerification;
import com.cput.ac.org.factory.UserEmailVerificationFactory;
import com.cput.ac.org.repository.UserEmailVerificationRepository;
import com.cput.ac.org.repository.userEmailVerificationRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class userEmailVerificationRepositoryImplTest
{
    private UserEmailVerificationRepository repository;
    private UserEmailVerification emailVerification;

    @Before
    public void setUp() throws Exception
    {
       repository = userEmailVerificationRepositoryImpl.getRepository();
        emailVerification = UserEmailVerificationFactory.getUserVerify("lakay","214291324","lakay@gmail.com","45");
    }

    @Test
    public void create()
    {
        assertEquals(repository.create(emailVerification),repository.create(emailVerification));
    }

    @Test
    public void update()
    {
        assertEquals(repository.update(emailVerification),repository.update(emailVerification));
    }

    @Test
    public void delete()
    {
        repository.delete(emailVerification);
    }

    @Test
    public void read()
    {
        assertEquals(repository.read(emailVerification),repository.read(emailVerification));
    }

    @Test
    public void getAll()
    {
        assertEquals(repository.getAll(),repository.getAll());
    }

}