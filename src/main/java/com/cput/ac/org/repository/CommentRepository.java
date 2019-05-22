package com.cput.ac.org.repository;

import com.cput.ac.org.Domain.Comment;

import java.util.Set;

public interface CommentRepository extends IRepository<Comment,String>
{
    Set<Comment> getAll();
}
