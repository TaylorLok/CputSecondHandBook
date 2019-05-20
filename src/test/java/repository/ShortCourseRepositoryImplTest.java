package repository;

import Domain.ShortCourse;
import Factory.ShortCourseFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShortCourseRepositoryImplTest
{
    private ShortCourseRepository repository;
    private ShortCourse course;

    @Before
    public void setUp() throws Exception
    {
        repository = ShortCourseRepositoryImpl.getRepository();
        course = ShortCourseFactory.getShortCourseBooks("ccna1","ccna2","ccnp","cyber");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(course),repository.create(course));
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