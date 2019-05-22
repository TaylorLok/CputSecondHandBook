package service;

import com.cput.ac.org.Domain.UserEmailVerification;
import com.cput.ac.org.Factory.UserEmailVerificationFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.cput.ac.org.repository.userEmailVerificationRepositoryImpl;

public class UserEmailVerificationServiceImplTest {

    private userEmailVerificationRepositoryImpl repository;
    private UserEmailVerification forgot;

    @Before
    public void setUp() throws Exception
    {
        repository = (userEmailVerificationRepositoryImpl) userEmailVerificationRepositoryImpl.getRepository();
        forgot = UserEmailVerificationFactory.getUserVerify("John","2142914578","john@gmail.com","008");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(forgot),repository.create(forgot));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(forgot),repository.update(forgot));
    }

    @Test
    public void delete()
    {
        repository.delete(forgot);
    }

    @Test
    public void read()
    {
        repository.read(forgot);
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }

}