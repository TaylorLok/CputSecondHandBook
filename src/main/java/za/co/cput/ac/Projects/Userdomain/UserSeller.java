package Domain;


import java.util.Date;

public class UserSeller extends User
{
    private String bookDesc;
    private String bookTitle;
    private int price;
    private Date advertDate;
    private Date expireDate;

    public UserSeller(String name, String surname, String studentNumber, long telNumber, String bookDesc, String bookTitle, int price, Date advertDate, Date expireDate) {
        super(name, surname, studentNumber, telNumber);
        this.bookDesc = bookDesc;
        this.bookTitle = bookTitle;
        this.price = price;
        this.advertDate = advertDate;
        this.expireDate = expireDate;
       // this.telNumber= telNumber;
    }


    public UserSeller(Builder builder, String bookDesc, String bookTitle, int price, Date advertDate, Date expireDate) {
        super(builder);
        this.bookDesc = bookDesc;
        this.bookTitle = bookTitle;
        this.price = price;
        this.advertDate = advertDate;
        this.expireDate = expireDate;
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

    public Date getAdvertDate()
    {
        return advertDate;
    }

    public Date getExpireDate()
    {
        return expireDate;
    }
}
