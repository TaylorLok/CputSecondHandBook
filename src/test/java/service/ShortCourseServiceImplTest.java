package service;

import Domain.ShortCourse;
import Factory.ShortCourseFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.ShortCourseRepositoryImpl;

public class ShortCourseServiceImplTest {

    private ShortCourseRepositoryImpl repository;
    private ShortCourse shortc;

    @Before
    public void setUp() throws Exception
    {
        repository = ShortCourseRepositoryImpl.getRepository();
        shortc = ShortCourseFactory.getShortCourseBooks("ccna","ccnp","ccei","cybersec");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(shortc),repository.create(shortc));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(shortc),repository.update(shortc));
    }

    @Test
    public void delete()
    {
        repository.delete(shortc);
    }

    @Test
    public void read()
    {
        repository.read(shortc);
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}