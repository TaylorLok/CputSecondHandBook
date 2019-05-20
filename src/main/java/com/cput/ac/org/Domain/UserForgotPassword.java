package com.cput.org.Controller.Domain;

public class UserForgotPassword
{
    private String secretQuestion;
    private String secretAnswer;


    private UserForgotPassword()
    {

    }

    public UserForgotPassword(Builder builder)
    {
        this.secretQuestion = builder.secretQuestion;

        this.secretAnswer = builder.SecretAnswer;
    }

    public String getSecretQuestion()
    {
        return secretQuestion;
    }

    public String getSecretAnswer()
    {
        return secretAnswer;
    }

    public static class Builder
    {
        private String secretQuestion;
        private String SecretAnswer;


        public UserForgotPassword.Builder secretQuestion(String secretQuestion)
        {
            this.secretQuestion = secretQuestion;
            return this;
        }

        public UserForgotPassword.Builder secretAnswer(String secretAnswer)
        {
           this.SecretAnswer = secretAnswer;
            return this;
        }

        public UserForgotPassword build()
        {
            return new UserForgotPassword(this);
        }
    }
}
