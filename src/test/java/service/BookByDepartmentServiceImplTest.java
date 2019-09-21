package service;

import com.cput.ac.org.domain.BookByDepartment;
import com.cput.ac.org.factory.BookByDepartmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.cput.ac.org.repository.BookByDepartmentRepositoryImpl;

public class BookByDepartmentServiceImplTest {

    private BookByDepartmentRepositoryImpl repository;
    private BookByDepartment department;

    @Before
    public void setUp() throws Exception
    {
        repository = (BookByDepartmentRepositoryImpl) BookByDepartmentRepositoryImpl.getRepository();
        department = BookByDepartmentFactory.getDepartmentBook("science","egineering","digital",
                "teaching","low of business","anatomy");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(department),repository.create(department));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(department),repository.update(department));
    }

    @Test
    public void delete()
    {
        repository.delete(department);
    }

    @Test
    public void read()
    {
        repository.read(department);
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}