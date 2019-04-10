package za.co.cput.ac.Projects.Factory;

import za.co.cput.ac.Projects.domain.User;

public class UserFactory
{
    public static User getUser(String name,String surname, String studentNumber)
    {
        return new User.Builder()
                .name(name)
                .surname(surname)
                .studentNumber(studentNumber)
                .build();
    }
}
