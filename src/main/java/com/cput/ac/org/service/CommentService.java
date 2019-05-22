package com.cput.ac.org.service;

import com.cput.ac.org.Domain.Comment;

import java.util.Set;

public interface CommentService extends IService<Comment,String>
{
    Set<Comment> getAll();
}
