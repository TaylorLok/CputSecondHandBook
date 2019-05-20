package com.cput.org.Controller.Factory;

import com.cput.org.Controller.Domain.UserRegistration;

public class UserRegistrationFactory
{
    public static UserRegistration getUserRegistration(String name, String surname, String studentNumber, String password,String emailAddress)
    {
        return new UserRegistration.Builder()
                .name(name)
                .surname(surname)
                .studentNumber(studentNumber)
                .emailAddress(emailAddress)
                .password(password)
                .build();
    }
}