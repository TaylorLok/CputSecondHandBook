package repository;

import Domain.Comment;

import java.util.Set;

public interface CommentRepository extends IRepository<Comment,String>
{
    Set<Comment> getAll();
}
