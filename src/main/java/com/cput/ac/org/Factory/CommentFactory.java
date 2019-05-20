package com.cput.org.Controller.Factory;

import com.cput.org.Controller.Domain.Comment;

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
