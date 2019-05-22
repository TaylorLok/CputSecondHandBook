package service;

import com.cput.ac.org.Domain.Comment;
import com.cput.ac.org.Factory.CommentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.cput.ac.org.repository.CommentRepositoryImpl;

public class CommentServiceImplTest
{

    private CommentRepositoryImpl repository;
    private Comment userCom;

    @Before
    public void setUp() throws Exception
    {
        repository = CommentRepositoryImpl.getRepository();
        userCom = CommentFactory.getComment("Jerome","keep up");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(userCom),repository.create(userCom));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(userCom),repository.update(userCom));
    }

    @Test
    public void delete()
    {
        repository.delete(userCom);
    }

    @Test
    public void read()
    {
        repository.read(userCom);
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}