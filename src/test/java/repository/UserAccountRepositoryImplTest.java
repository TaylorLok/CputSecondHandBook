package repository;

import Domain.UserAccount;
import Factory.UserAccountFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;
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

    @Test(expected = NoSuchElementException.class)
    public void update()
    {
        String status = "Desactive";
        UserAccount.Builder builder = new UserAccount.Builder();
        builder.copy(SavedUserAccount());
        builder.getStatus(status);
        UserAccount userAccount = builder.build();
        System.out.println("In update, about_to_updated = " + userAccount);
        UserAccount updated = this.repository.update(userAccount);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(status, updated.getStatus());
        getAll();
    }

    @Test(expected = NoSuchElementException.class)
    public void delete()
    {
        UserAccount savedUserAccount = SavedUserAccount();
        this.repository.delete(savedUserAccount);
        getAll();
    }

    @Test (expected = NoSuchElementException.class)
    public void read()
    {
        UserAccount savedUserAccount = SavedUserAccount();
        System.out.println("In read, user account = "+ savedUserAccount);
        UserAccount read = this.repository.read(savedUserAccount);
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedUserAccount, read);
    }

    @Test
    public void getAll()
    {
        Set<UserAccount> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);

    }
}