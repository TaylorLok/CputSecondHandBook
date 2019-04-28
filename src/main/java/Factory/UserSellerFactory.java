package Factory;

import Domain.UserSeller;

public class UserSellerFactory
{
    public static UserSeller getUserSeller(String name, String surname, String studentNumber, long telNumber, String bookDesc,
                                           String bookTitle, int price, String advertDate, String expireDate)
    {
        return new UserSeller.Builder()
                             .bookTitle(bookTitle)
                             .bookDesc(bookDesc)
                             .price(price)
                             .advertDate(advertDate)
                             .expireDate(expireDate)
                             .build();
    }
}
