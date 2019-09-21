package service;

import com.cput.ac.org.domain.UserBuyer;
import com.cput.ac.org.factory.UserBuyerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.cput.ac.org.repository.UserBuyerRepositoryImpl;

public class UserBuyerServiceImplTest {

    private UserBuyerRepositoryImpl repository;
    private UserBuyer user;

    @Before
    public void setUp() throws Exception
    {
        repository = (UserBuyerRepositoryImpl) UserBuyerRepositoryImpl.getRepository();
        user = UserBuyerFactory.getBuyer("taylor","chairman");
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