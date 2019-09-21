package com.cput.ac.org.domain;

public class UserRegistration
{
    private String name;
    private String surname;
    private String studentNumber;
    private String emailAddress;
    private String password;

    private UserRegistration()
    {

    }

    public UserRegistration (Builder builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
        this.studentNumber = builder.studentNumber;
        this.emailAddress = builder.emailAddress;
        this.password = builder.password;

    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getStudentNumber()
    {
        return studentNumber;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public String getPassword()
    {
        return password;
    }

    public static class Builder
    {
        private String name;
        private String surname;
        private String studentNumber;
        private String password;
        private String emailAddress;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder surname(String surname)
        {
            this.surname = surname;
            return this;
        }

        public Builder studentNumber(String studentNumber)
        {
            this.studentNumber = studentNumber;
            return this;
        }

        public Builder password(String password)
        {
            this.password = password;
            return this;
        }

        public Builder emailAddress(String emailAddress)
        {
            this.emailAddress = emailAddress;
            return this;
        }

        public UserRegistration build()
        {
            return new UserRegistration(this);
        }
    }
}
