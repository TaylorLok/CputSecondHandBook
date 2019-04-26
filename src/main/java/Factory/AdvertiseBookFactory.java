package Factory;

import Domain.AdvertiseBook;

public class AdvertiseBookFactory
{
        public static AdvertiseBook getAdvert(String userName, String title, boolean buyOrSell, double price, String date)
        {
            return new AdvertiseBook.Builder().Advert(getAdvert(userName,title, buyOrSell,price, date)).build();

        }
}
