package Domain;


public class UserSeller extends User
{
    private String bookDesc;
    private String bookTitle;
    private int price;
    private String advertDate;
    private String expireDate;

    public UserSeller(String name, String surname, String studentNumber, long telNumber, String bookDesc, String bookTitle, int price, String advertDate, String expireDate)
    {
        super(name, surname, studentNumber, telNumber);
        this.bookDesc = bookDesc;
        this.bookTitle = bookTitle;
        this.price = price;
        this.advertDate = advertDate;
        this.expireDate = expireDate;
       // this.telNumber= telNumber;
    }


    public UserSeller(Builder builder)
    {

        this.bookDesc = builder.bookDesc;
        this.bookTitle = builder.bookTitle;
        this.price = builder.price;
        this.advertDate = builder.advertDate;
        this.expireDate = builder.expireDate;
    }

    public String getBookDesc()
    {
        return bookDesc;
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public int getPrice()
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
        private String bookDesc;
        private String bookTitle;
        private int price;
        private String advertDate;
        private String expireDate;

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

        public Builder price(int price)
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

        public UserSeller builc()
        {
            return new UserSeller(this);
        }
    }

    @Override
    public String toString()
    {
        return "UserSeller{" + "bookDesc='" + bookDesc + '\'' + ", bookTitle='" + bookTitle + '\'' + ", price=" + price + ", advertDate=" + advertDate + ", expireDate=" + expireDate + '}';
    }
}
