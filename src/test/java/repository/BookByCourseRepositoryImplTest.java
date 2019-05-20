package repository;

import Domain.BookByCourse;
import Factory.BookByCourseFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookByCourseRepositoryImplTest {

    private BookByCourseRepository repository;
    private BookByCourse course;

    @Before
    public void setUp() throws Exception
    {
        repository = BookByCourseRepositoryImpl.getRepository();
        course = BookByCourseFactory.getBookbyCouse("how to program","project3","analyste","counting","business");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(course),repository.create(course));

        System.out.println(toString());
    }

    @Test
    public void read()
    {
        Assert.assertEquals(repository.read(course),repository.read(course));
    }

    @Test
    public void delete()
    {
        repository.delete(course);
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(course),repository.update(course));
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}