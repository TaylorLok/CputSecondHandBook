package repository;

import Domain.Comment;
import Factory.CommentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommentRepositoryImplTest
{
    private CommentRepository repository;
    private Comment comment;


    @Before
    public void setUp() throws Exception
    {
        repository = CommentRepositoryImpl.getRepository();
        comment = CommentFactory.getComment("katumbi","very nice");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(comment),repository.create(comment));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(comment),repository.update(comment));
    }

    @Test
    public void delete()
    {
        repository.delete(comment);
    }

    @Test
    public void read()
    {
        Assert.assertEquals(repository.read(comment),repository.read(comment));
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}