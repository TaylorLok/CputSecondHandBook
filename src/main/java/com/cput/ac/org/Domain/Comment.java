package com.cput.org.Controller.Domain;

public class Comment
{
    private String userName;
    private String comment;

    protected Comment()
    {

    }

    public Comment(Builder builder)
    {
        this.userName = builder.userName;
        this.comment = builder.comment;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getComment()
    {
        return comment;
    }

    public static class Builder
    {
        private String userName;
        private String comment;

        public Builder()
        {

        }

        public Builder getUserName(String userName)
        {
            this.userName = userName;
            return this;
        }

        public Builder getComment(String comment)
        {
            this.comment = comment;
            return this;
        }

        public Comment build()
        {
            return new Comment(this);
        }
    }
}
