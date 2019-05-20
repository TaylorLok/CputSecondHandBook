package Factory;

import Domain.Comment;

public class CommentFactory
{
    public static Comment getComment(String userName,String comment)
    {
        return new Comment.Builder()
                          .getUserName(userName)
                          .getComment(comment)
                           .build();
    }
}
