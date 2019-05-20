package repository;

import Domain.UserAccount;
import Factory.UserAccountFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class UserAccountRepositoryImplTest
{
    private UserAccountRepository repository;
    private UserAccount userAccount;

        private UserAccount SavedUserAccount()
{
    Set<UserAccount> savedUserAccount = this.repository.getAll();
    return savedUserAccount.iterator().next();
}

    @Before
    public void setUp() throws Exception
    {
        this.repository = UserAccountRepositoryImpl.getRepository();
        this.userAccount = UserAccountFactory.getUserAccount("06/05/2019","active");

    }



    @Test
    public void create()
    {
        UserAccount created = this.repository.create(this.userAccount);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.userAccount);
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
        Assert.assertEquals(repository.read(userAccount),repository.read(userAccount));
    }

    @Test
    public void getAll()
    {
        Set<UserAccount> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);

    }
}