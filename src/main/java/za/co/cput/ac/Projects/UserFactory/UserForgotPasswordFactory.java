package Factory;

import Domain.UserForgotPassword;

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
