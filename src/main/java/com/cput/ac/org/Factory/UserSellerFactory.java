package com.cput.ac.org.Factory;

import com.cput.ac.org.Domain.UserSeller;

public class UserSellerFactory
{
    public static UserSeller getUserSeller(String name, String surname, String studentNumber, String telNumber, String bookDesc,
                                           String bookTitle, double price, String advertDate, String expireDate)
    {
        return new UserSeller.Builder()
                             .name(name)
                             .surname(surname)
                             .studentNumber(studentNumber)
                             .telNumber(telNumber)
                             .bookTitle(bookTitle)
                             .bookDesc(bookDesc)
                             .price(price)
                             .advertDate(advertDate)
                             .expireDate(expireDate)
                             .build();
    }
}
