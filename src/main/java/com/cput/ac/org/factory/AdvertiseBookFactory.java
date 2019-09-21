package com.cput.ac.org.factory;

import com.cput.ac.org.domain.AdvertiseBook;

public class AdvertiseBookFactory
{
        public static AdvertiseBook getAdvert(String userName, String title, boolean buyOrSell, double price, String date)
        {
            return new AdvertiseBook.Builder()
                                    .userName(userName)
                                    .title(title)
                                    .buyOrSell(false)
                                    .price(price)
                                    .date(date)
                                    .build();

        }
}
