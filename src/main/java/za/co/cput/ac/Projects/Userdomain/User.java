package za.co.cput.ac.Projects.Userdomain;

public class User
{
    private String name;
    private String surname;
    private int studentNumber;


    private User(){}

    public User(Builder builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
        this.studentNumber = builder.studentNumber;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public static class Builder
    {
        private String name;
        private String surname;
        private int studentNumber;


        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder surname(String surname)
        {
            this.surname = surname;
            return this;
        }

        public Builder studentNumber(int studentNumber)
        {
            this.studentNumber = studentNumber;
            return this;
        }

        public User build()
        {
            return new User(this);
        }
    }
}
