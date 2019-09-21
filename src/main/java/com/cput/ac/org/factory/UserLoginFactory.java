package com.cput.ac.org.factory;

//import UserLogin;

import com.cput.ac.org.domain.UserLogin;

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
