package com.cput.ac.org.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEmailVerification
{
    private String userName;
    @Id
    private String studentNumber;
    private String email;
    private String verificationCode;


    private UserEmailVerification()
    {

    }

    public UserEmailVerification(Builder builder)
    {
        this.userName = builder.userName;
        this.studentNumber = builder.studentNumber;
        this.email = builder.email;
        this.verificationCode = builder.verificationCode;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getStudentNumber()
    {
        return studentNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public String getVerificationCode()
    {
        return verificationCode;
    }


    public static class Builder
    {
        private String userName;
        private String email;
        private String studentNumber;
        private String verificationCode;

        public UserEmailVerification.Builder userName(String userName)
        {
            this.userName = userName;
            return this;
        }

        public UserEmailVerification.Builder email(String email)
        {
            this.email = email;
            return this;
        }

        public UserEmailVerification.Builder studentNumber(String studentNumber)
        {
            this.studentNumber = studentNumber;
            return this;
        }

        public UserEmailVerification.Builder verificationCode(String verificationCode)
        {
            this.verificationCode = verificationCode;
            return this;
        }

        public UserEmailVerification build()
        {
            return new UserEmailVerification(this);
        }
    }
}
