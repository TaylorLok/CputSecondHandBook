package service;

import Domain.UserAccount;
import Factory.UserAccountFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.UserAccountRepositoryImpl;

public class UserAccountServiceImplTest {

    private UserAccountRepositoryImpl repository;
    private UserAccount userAccount;

    @Before
    public void setUp() throws Exception
    {
        repository = UserAccountRepositoryImpl.getRepository();
        userAccount = UserAccountFactory.getUserAccount("18/05/2019","Active");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(userAccount),repository.create(userAccount));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(userAccount),repository.update(userAccount));
    }

    @Test
    public void delete()
    {
        repository.delete(userAccount);
    }

    @Test
    public void read()
    {
        repository.read(userAccount);
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}