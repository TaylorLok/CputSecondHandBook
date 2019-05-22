package com.cput.ac.org.Domain;

public class UserBuyer
{
    private String surname;
    private String name;

    private UserBuyer()
    {

    }

    public UserBuyer(Builder builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public static class Builder
    {
        private String name;
        private String surname;

        public Builder getName(String name)
        {
            this.name = name;
            return this;
        }

        public Builder getSurname(String surname)
        {
            this.surname = surname;
            return this;
        }

        public UserBuyer build()
        {
            return new UserBuyer(this);
        }
    }


    @Override
    public String toString() {
        return "UserBuyer{" + "surname='" + surname + '\'' + ", name='" + name + '\'' + '}';
    }
}
