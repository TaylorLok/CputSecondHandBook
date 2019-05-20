package repository;

import Domain.Comment;

import java.util.*;

public class CommentRepositoryImpl implements CommentRepository
{
    private static CommentRepositoryImpl repository = null;
    private Map<String,Comment> commentMap;

    private CommentRepositoryImpl()
    {
        this.commentMap = new HashMap<>();
    }

    public static CommentRepositoryImpl getRepository()
    {
        if(repository == null) repository = new CommentRepositoryImpl();
        return repository;
    }

    @Override
    public Comment create(Comment comment)
    {
        this.commentMap.put(comment.getUserName(),comment);
        this.commentMap.put(comment.getComment(),comment);
        return comment;
    }

    @Override
    public Comment update(Comment comment)
    {
        this.commentMap.replace(comment.getUserName(),comment);
        this.commentMap.replace(comment.getComment(),comment);
        return comment;
    }

    @Override
    public void delete(Comment comment)
    {
       this.commentMap.remove(comment);
    }

    @Override
    public Comment read(Comment comment)
    {
        this.commentMap.get(comment);
        return comment;
    }

    @Override
    public Set<Domain.Comment> getAll()
    {
        Collection<Comment> comments = this.commentMap.values();
        Set<Comment> set = new HashSet<>();
        set.addAll(comments);
        return set;
    }
}
