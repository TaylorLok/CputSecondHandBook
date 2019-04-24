package Factory.User;

import Domain.User.User;

public class UserFactory
{
    public static User getUser(String name, String surname, String studentNumber, long telNumber)
    {
        return new User.Builder()
                .name(name)
                .surname(surname)
                .studentNumber(studentNumber)
                .telNumber(telNumber)
                .build();
    }
}
