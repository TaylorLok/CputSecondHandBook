package com.cput.ac.org.Factory;

import com.cput.ac.org.Domain.Comment;

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
