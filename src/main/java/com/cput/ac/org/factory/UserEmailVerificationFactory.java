package com.cput.ac.org.factory;


import com.cput.ac.org.domain.UserEmailVerification;

public class UserEmailVerificationFactory
{
    public static UserEmailVerification getUserVerify(String userName, String studentNumber, String email, String verificationCode)
    {
        return new UserEmailVerification.Builder()
                .userName(userName)
                .studentNumber(studentNumber)
                .email(email)
                .verificationCode(verificationCode)
                .build();
    }
}
