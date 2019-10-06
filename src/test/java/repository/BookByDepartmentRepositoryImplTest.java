package repository;

import com.cput.ac.org.domain.BookByDepartment;
import com.cput.ac.org.factory.BookByDepartmentFactory;
import com.cput.ac.org.repository.BookByDepartmentRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookByDepartmentRepositoryImplTest
{
    private BookByDepartmentRepository repository;
    private BookByDepartment department;

    @Before
    public void setUp() throws Exception
    {
        repository = BookByDepartmentRepositoryImpl.getRepository();
        department = BookByDepartmentFactory.getDepartmentBook("science","egineering","digital",
                "teaching","low of business","anatomy");
    }


    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(department),repository.create(department));
    }

    @Test
    public void read()
    {
        Assert.assertEquals(repository.read(department),repository.read(department));
    }

    @Test
    public void delete()
    {
        repository.delete(department);
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(department),repository.update(department));
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}