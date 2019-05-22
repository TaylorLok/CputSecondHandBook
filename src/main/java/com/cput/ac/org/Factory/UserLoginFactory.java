package com.cput.ac.org.Factory;

//import UserLogin;

import com.cput.ac.org.Domain.UserLogin;

public class UserLoginFactory
{

        public static UserLogin createLogin(String emailAddress, String password)
        {
            return new UserLogin.Builder()
                    .emailAddress(emailAddress)
                    .password(password)
                    .build();
        }
}
