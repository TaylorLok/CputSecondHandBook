package repository;

import Domain.UserSeller;
import Factory.UserSellerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Set;

public class UserSellerRepositoryImplTest
{
    private UserSellerRepository repository;
    private UserSeller userSellers;



     private UserSeller getSavedUserSeller()
     {
         Set<UserSeller> SavedUserllers = this.repository.getAll();
         return  SavedUserllers.iterator().next();
     }

    @Before
    public void setUp() throws Exception
    {

      this.repository = UserSellerRepositoryImpl.getRepository();
      this.userSellers = UserSellerFactory.getUserSeller("taylor","Lokombe",
              "214291324","1745258745","history of love",
              "titanic",200,"15/05/2019","17");
    }


    @Test
    public void create()
    {
        UserSeller userSeller = this.repository.create(this.userSellers);
        System.out.println("creating a user seller = " + userSeller);
        Assert.assertSame(userSeller, this.userSellers);

        System.out.println(toString());
    }

    @Test(expected = NullPointerException.class)
    public void update()
    {
        String user = "New user Name";
        String userSeller;
        userSeller = new UserSeller.Builder().build().getName().replace("taylor","Lokamba");
        System.out.println("update a user seller = " + userSeller);
        UserSeller updated = this.repository.update(userSellers);
        System.out.println("In update, updated = " + updated);
        Assert.assertNotSame(user, updated.getName());


        System.out.println(toString());// i want to change just the name and update to another name
    }

    @Test(expected = NoSuchElementException.class)
    public void delete()
    {
        UserSeller savedUserSellers = getSavedUserSeller();
        this.repository.delete(savedUserSellers);

        System.out.println(toString());

    }

    @Test(expected = NoSuchElementException.class)
    public void read()
    {
        UserSeller savedUserSellers = getSavedUserSeller();
        System.out.println("read user name = "+ savedUserSellers.getName());
        UserSeller read = this.repository.read(getSavedUserSeller());
        System.out.println("In read, read = " + read);

        Assert.assertEquals(savedUserSellers, read);

        System.out.println(toString());
    }

    @Test
    public void getAll()
    {
        Set<UserSeller> userSellers = this.repository.getAll();
        System.out.println(" get All the CRUD , all = " + userSellers);
    }
}