package Factory;

import Domain.Comment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CommentFactoryTest
{
    private Comment comment;


    @Before
    public void setUp() throws Exception
    {
      comment = CommentFactory.getComment("Fayulu","well done");

    }

    @Test
    public void getComment()
    {

        Assert.assertEquals("Fayulu",comment.getUserName(),"Fayulu");
        Assert.assertEquals("well done",comment.getComment(),"well done");

    }
}