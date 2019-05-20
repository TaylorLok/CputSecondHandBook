package com.cput.org.Controller.Factory;

//import UserLogin;

import com.cput.org.Controller.Domain.UserLogin;

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
