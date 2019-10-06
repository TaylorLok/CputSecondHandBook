package repository;

import com.cput.ac.org.domain.Admin;
import com.cput.ac.org.factory.AdminFactory;
import com.cput.ac.org.repository.AdminRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdminRepositoryImplTest
{
    private AdminRepository repository;
    private Admin admin;

    @Before
    public void setUp() throws Exception
    {
        repository = AdminRepositoryImpl.getRepository();
        admin = AdminFactory.getAdmin("permission");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(admin),repository.create(admin));

        System.out.println(toString());
    }

    @Test
    public void read()
    {
      Assert.assertEquals(repository.read(admin),repository.read(admin));
    }

    @Test
    public void delete()
    {
        repository.delete(admin);
    }

    @Test
    public void update()
    {
       Assert.assertEquals(repository.update(admin),repository.update(admin));
    }

    @Test
    public void getAll()
    {
       Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}