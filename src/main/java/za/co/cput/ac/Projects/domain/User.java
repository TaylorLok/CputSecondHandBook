package za.co.cput.ac.Projects.domain;

public class User
{
    private String name;
    private String surname;
    private String studentNumber;


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

    public String getStudentNumber()
    {
        return studentNumber;
    }

    public static class Builder
    {
        private String name;
        private String surname;
        private String studentNumber;


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

        public Builder studentNumber(String studentNumber)
        {
            this.name = studentNumber;
            return this;
        }

        public User build()
        {
            return new User(this);
        }
    }
}
