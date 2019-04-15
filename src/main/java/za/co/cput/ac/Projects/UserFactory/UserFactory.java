package za.co.cput.ac.Projects.UserFactory;

import za.co.cput.ac.Projects.Userdomain.User;

public class UserFactory
{
    public static User getUser(String name,String surname, int studentNumber)
    {
        return new User.Builder()
                .name(name)
                .surname(surname)
                .studentNumber(studentNumber)
                .build();
    }
}
