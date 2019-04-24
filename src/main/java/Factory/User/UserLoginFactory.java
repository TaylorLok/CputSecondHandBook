package Factory.User;

//import UserLogin;

import Domain.User.UserLogin;

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
