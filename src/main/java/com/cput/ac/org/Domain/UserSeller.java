package com.cput.org.Controller.Domain;


public class UserSeller
{
    private String name;
    private String surname;
    private String studentNumber;
    private String telNumber;
    private String bookDesc;
    private String bookTitle;
    private double price;
    private String advertDate;
    private String expireDate;

    public UserSeller()
    {
    }


    public UserSeller(Builder builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
        this.studentNumber = builder.studentNumber;
        this.telNumber = builder.telNumber;
        this.bookDesc = builder.bookDesc;
        this.bookTitle = builder.bookTitle;
        this.price = builder.price;
        this.advertDate = builder.advertDate;
        this.expireDate = builder.expireDate;
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

    public String getTelNumber()
    {
        return telNumber;
    }

    public String getBookDesc()
    {
        return bookDesc;
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public double getPrice()
    {
        return price;
    }

    public String getAdvertDate()
    {
        return advertDate;
    }

    public String getExpireDate()
    {
        return expireDate;
    }

    public static class Builder
    {
        private String name;
        private String surname;
        private String studentNumber;
        private String telNumber;
        private String bookDesc;
        private String bookTitle;
        private double price;
        private String advertDate;
        private String expireDate;

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

        public Builder telNumber(String telNumber)
        {
            this.telNumber = telNumber;
            return this;
        }

        public Builder bookDesc(String bookDesc)
        {
            this.bookDesc = bookDesc;
            return this;
        }

        public Builder bookTitle(String bookTitle)
        {
            this.bookTitle = bookTitle;
            return this;
        }

        public Builder price(double price)
        {
            this.price= price;
            return this;
        }

        public Builder advertDate(String advertDate)
        {
            this.advertDate = advertDate;
            return this;
        }

        public Builder expireDate(String expireDate)
        {
            this.expireDate = expireDate;
            return this;
        }

        public UserSeller build()
        {
            return new UserSeller(this);
        }
    }

    @Override
    public String toString()
    {
        return "UserSeller{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", studentNumber='" + studentNumber + '\'' + ", telNumber=" + telNumber + ", bookDesc=" + bookDesc + ", bookTitle=" + bookTitle + ", price=" + price + ", advertDate=" + advertDate + ", expireDate=" + expireDate + '}';
    }
}
