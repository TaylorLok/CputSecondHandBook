package Domain;

public class AdvertiseBook implements IAdvertiseBook
{
    private String userName;
    private String title;
    private boolean buyOrSell;
    private double price;
    private String date;



    protected AdvertiseBook()
    {
    }

    private AdvertiseBook(Builder builder)
    {
        this.userName = builder.userName;
        this.title = builder.title;
        this.buyOrSell = builder.buyOrSell;
        this.price = builder.price;
        this.date = builder.date;

    }

    public String getUserName()
    {
        return userName;
    }

    public boolean isBuyOrSell()
    {
        return buyOrSell;
    }

    public double getPrice()
    {
        return price;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDate()
    {
        return date;
    }

    public static class Builder
    {
        private String userName;
        private String title;
        private boolean buyOrSell;
        private double price;
        private String date;

        public Builder()
        {

        }

        public Builder Advert(AdvertiseBook advert) {
            this.userName = advert.userName;
            this.title = advert.title;
            this.buyOrSell = advert.buyOrSell;
            this.price = advert.price;
            this.date = advert.date;
            return this;
        }

        public Builder userName(String userName)
        {
            this.userName = userName;
            return this;
        }

        public Builder title(String title)
        {
            this.title = title;
            return this;
        }


        public Builder buyOrSell(boolean buyOrSell)
        {
            this.buyOrSell = buyOrSell;
            return this;
        }

        public Builder price(double price)
        {
            this.price = price;
            return this;

        }

       public Builder date(String date)
       {
        this.date = date;
        return this;
       }

        public AdvertiseBook build()
        {
            return new AdvertiseBook(this);
        }
    }


}
