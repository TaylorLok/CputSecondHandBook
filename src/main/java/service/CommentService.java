package service;

import Domain.Comment;

import java.util.Set;

public interface CommentService extends IService<Comment,String>
{
    Set<Comment> getAll();
}
