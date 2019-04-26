package Domain.domainUser;

public class User
{

    private String name;
    private String surname;
    private String studentNumber;
    private long telNumber;

    public User(String name, String surname, String studentNumber, long telNumber)
    {
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
        this.telNumber = telNumber;
    }

    protected User()
    {

    }

    public User(Builder builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
        this.studentNumber = builder.studentNumber;
        this.telNumber = builder.telNumber;
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

    public long getTelNumber()
    {
        return telNumber;
    }

    public static class Builder
    {
        private String name;
        private String surname;
        private String studentNumber;
        private long telNumber;

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
            this.studentNumber = studentNumber;
            return this;
        }

        public Builder telNumber(long telNumber)
        {
            this.telNumber = telNumber;
            return this;
        }

        public User build()
        {
            return new User(this);
        }
    }

    public void ViewBook()
    {
        System.out.println("Available domainBook is ");
    }


}
