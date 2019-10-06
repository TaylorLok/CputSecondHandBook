package service;

import com.cput.ac.org.domain.BookByCourse;
import com.cput.ac.org.factory.BookByCourseFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookByCourseServiceImplTest {

    private BookByCourseRepositoryImpl repository;
    private BookByCourse courseB;

    @Before
    public void setUp() throws Exception
    {
        repository = (BookByCourseRepositoryImpl) BookByCourseRepositoryImpl.getRepository();
        courseB = BookByCourseFactory.getBookbyCouse("how to program","project3","analyste","counting","business");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(courseB),repository.create(courseB));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(courseB),repository.update(courseB));
    }

    @Test
    public void delete()
    {
        repository.delete(courseB);
    }

    @Test
    public void read()
    {
        repository.read(courseB);
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}