package com.cput.ac.org.factory;

import com.cput.ac.org.domain.UserForgotPassword;

public class UserForgotPasswordFactory
{
    public static UserForgotPassword getUserPassword( String secretQuestion, String secretAnswer)
    {
        return new UserForgotPassword.Builder()
                .secretQuestion(secretQuestion)
                .secretAnswer(secretAnswer)
                .build();
    }
}
