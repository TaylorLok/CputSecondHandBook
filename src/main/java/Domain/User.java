package Domain;

public class User implements IUser
{

    private String name;
    private String surname;
    private String studentNumber;
    private int telNumber;

    public User(String name, String surname, String studentNumber, int telNumber)
    {
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
        this.telNumber = telNumber;
    }

    public User()
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

    public int getTelNumber()
    {
        return telNumber;
    }

    @Override
    public String getStatus() {
        return String.valueOf(this);
    }

    @Override
    public String getCreationDate() {
        return String.valueOf(this);
    }

    public static class Builder
    {
        private String name;
        private String surname;
        private String studentNumber;
        private int telNumber;

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

        public Builder telNumber(int telNumber)
        {
            this.telNumber = telNumber;
            return this;
        }

        public Builder copy(String name, String surname,String studentNumber,int telNumber)
        {
            this.name = name;
            this.surname = surname;
            this.studentNumber = studentNumber;
            this.telNumber =telNumber;

            return this;
        }

        public User build()
        {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", surname='" + surname +
                '\'' + ", studentNumber='" + studentNumber + '\'' + ", telNumber=" + telNumber + '}';
    }
}
