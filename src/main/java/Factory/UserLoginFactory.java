package Factory;

//import UserLogin;

import Domain.UserLogin;

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
