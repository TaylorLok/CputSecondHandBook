package Factory.Sell;

import Domain.Sell.UserSeller;

public class UserSellerFactory
{
    private static UserSellerFactory getInstance(String bookDesc,String bookTitle,int price,String advertDate,String expireDate)
    {
        return new UserSellerFactory.Builder()
                                     .bookDesc(bookDesc)
                                      .bookTitle(bookTitle)
                                      .price(price)
                                     .advertDate(advertDate)
                                      .expireDate(expireDate)
                                     .build();
    }
}
