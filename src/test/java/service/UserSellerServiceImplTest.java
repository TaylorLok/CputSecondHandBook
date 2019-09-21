package service;

import com.cput.ac.org.domain.UserSeller;
import com.cput.ac.org.factory.UserSellerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.cput.ac.org.repository.UserSellerRepositoryImpl;

public class UserSellerServiceImplTest
{
    private UserSellerRepositoryImpl repository;
    private UserSeller user;

    @Before
    public void setUp() throws Exception
    {
        repository = UserSellerRepositoryImpl.getRepository();
        user = UserSellerFactory.getUserSeller("siphe","mpetsheni","214291021","078014654","last years book",
                                                "IT for solution",200,"17/05/2019","20/05/2019");
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