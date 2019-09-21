package com.cput.ac.org.service;

import com.cput.ac.org.domain.Comment;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("CommentServiceImpl")
public class CommentServiceImpl implements CommentService
{
    private static CommentServiceImpl service = null;
    private Map<String,Comment > usercomment;

    private CommentServiceImpl()
    {
        this.usercomment = new HashMap<>();
        this.service = service;
    }

    public static CommentServiceImpl getRepository()
    {
        if(service == null) service = new CommentServiceImpl();
        return service;

    }

    @Override
    public Comment create(Comment comment)
    {
        this.usercomment.put(comment.getUserName(),comment);
        this.usercomment.put(comment.getComment(),comment);
        return comment;
    }

    @Override
    public Comment update(Comment comment)
    {
        this.usercomment.replace(comment.getUserName(),comment);
        this.usercomment.replace(comment.getComment(),comment);
        return comment;
    }

    @Override
    public void delete(Comment comment)
    {
        this.usercomment.remove(comment);
    }

    @Override
    public Comment read(Comment comment)
    {
        this.usercomment.get(comment);
        return comment;
    }

    @Override
    public Set<Comment> getAll()
    {
        Collection<Comment> comments = this.usercomment.values();
        Set<Comment> set = new HashSet<>();
        set.addAll(comments);
        return set;
    }
}
