package repository;

import com.cput.ac.org.domain.UserSeller;
import com.cput.ac.org.factory.UserSellerFactory;
import com.cput.ac.org.repository.UserSellerRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

    @Test
    public void update()
    {
       Assert.assertEquals(repository.update(userSellers),repository.update(userSellers));
    }

    @Test
    public void delete()
    {
      repository.delete(userSellers);
        System.out.println(toString());

    }

    @Test
    public void read()
    {
       Assert.assertEquals(repository.read(userSellers),repository.read(userSellers));
    }

    @Test
    public void getAll()
    {
        Set<UserSeller> userSellers = this.repository.getAll();
        System.out.println(" get All the CRUD , all = " + userSellers);
    }
}