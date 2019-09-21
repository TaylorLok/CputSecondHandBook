package com.cput.ac.org.domain;

public class SellerRating implements ISellerRating
{
    private String userName;
    private String surName;
    private String rating;
    private String advertDate;
    private String comment;

    public SellerRating()
    {

    }

    public SellerRating(Builder builder)
    {
        this.userName = builder.userName;
        this.surName = builder.surName;
        this.rating = builder.rating;
        this.advertDate = builder.advertDate;
        this.comment = builder.comment;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getSurName()
    {
        return surName;
    }

    public String getRating()
    {
        return rating;
    }

    public String getAdvertDate()
    {
        return advertDate;
    }

    public String getComment()
    {
        return comment;
    }

    public static class Builder
    {
        private String userName;
        private String surName;
        private String rating;
        private String advertDate;
        private String comment;


        public Builder ()
        {

        }

        public Builder getUserName(String userName)
        {
            this.userName = userName;
            return this;
        }

        public Builder getSurName(String surName)
        {
            this.surName = surName;
            return this;
        }

        public Builder getRating(String rating)
        {
            this.rating = rating;
            return this;
        }

        public Builder getAdvertDate(String advertDate)
        {
            this.advertDate = advertDate;
            return this;
        }

        public Builder getComment(String comment)
        {
            this.comment = comment;
            return this;
        }

        public SellerRating build()
        {
            return new SellerRating(this);
        }
    }

    @Override
    public String toString() {
        return "SellerRating{" + "userName='" + userName +
                '\'' + ", surName='" + surName + '\'' + ", rating='" + rating + '\''
                + ", advertDate='" + advertDate + '\'' + ", comment=" + comment + '}';
    }
}
