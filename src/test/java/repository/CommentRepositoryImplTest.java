package repository;

import com.cput.ac.org.domain.Comment;
import com.cput.ac.org.factory.CommentFactory;
import com.cput.ac.org.repository.CommentRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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