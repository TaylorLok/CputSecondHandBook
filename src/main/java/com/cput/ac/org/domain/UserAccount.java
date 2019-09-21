package com.cput.ac.org.domain;

public class UserAccount
{
   private String creationDate;
   private String status;

   public UserAccount()
   {

   }


   public UserAccount(Builder builder)
   {
       this.creationDate = builder.creationDate;
       this.status = builder.status;
   }

    public String getCreationDate()
    {
        return creationDate;
    }


    public String getStatus()
    {
        return status;
    }


    public static class Builder
    {
        private String creationDate;
        private String status;

        public Builder getCreationDate(String creationDate)
        {
            this.creationDate = creationDate;
            return this;
        }

        public Builder getStatus(String status)
        {
            this.status = status;
            return this;
        }

        public Builder copy(UserAccount savedUserAccount)
        {
            this.status = status;
            this.creationDate = creationDate;
            return this;
        }

        public UserAccount build()
        {
            return new UserAccount(this);
        }


    }

    @Override
    public String toString()
    {
        return "UserAccount{" + "creationDate='" + creationDate + '\'' + ", status='" + status + '\'' + '}';
    }
}
