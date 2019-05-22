package com.cput.ac.org.Factory;

import com.cput.ac.org.Domain.User;

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
