package Domain.Advert;

import java.util.ArrayList;

public class AdvertiseBook
{
    private String userName;
    private boolean buyOrSell;
    private double price;


    protected AdvertiseBook()
    {
    }

    private AdvertiseBook(Builder builder)
    {
        this.userName = builder.userName;
        this.buyOrSell = builder.buyOrSell;
        this.price = builder.price;

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

    public ArrayList<String> getImagepaths() {
        return imagepaths;
    }

    public static class Builder {

        private String id;
        private String userName;
        private ArrayList<String> imagepaths;
        private boolean buyOrSell;
        private double price;


        public Builder() {

        }

        public Builder copy(Advert advert) {
            this.id = advert.id;
            this.title = advert.title;
            this.user = advert.user;
            this.product = advert.product;
            this.buyOrSell = advert.buyOrSell;
            this.price = advert.price;
            this.location = advert.location;
            this.imagepaths = advert.imagepaths;
            this.date = advert.date;
            return this;

        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder location(Location location) {
            this.location = location;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public Builder product(IProduct product) {
            this.product = product;
            return this;

        }

        public Builder buyOrSell(boolean buyOrSell) {
            this.buyOrSell = buyOrSell;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;

        }

        public Builder imagePaths(ArrayList<String> imagepaths) {
            this.imagepaths = imagepaths;
            return this;

        }

        public Advert build() {
            return new Advert(this);
        }


    }


}
