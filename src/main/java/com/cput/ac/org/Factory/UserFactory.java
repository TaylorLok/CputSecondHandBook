package com.cput.org.Controller.Factory;

import com.cput.org.Controller.Domain.User;

public class UserFactory
{
    public static User getUser(String name, String surname, String studentNumber, String telNumber)
    {
        return new User.Builder()
                .name(name)
                .surname(surname)
                .studentNumber(studentNumber)
                .telNumber(telNumber)
                .build();
    }
}
