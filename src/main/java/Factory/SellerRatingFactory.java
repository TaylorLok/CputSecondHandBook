package Factory;

import Domain.SellerRating;

public class SellerRatingFactory
{

    public static SellerRating getSellerRating(String userName,String surName,String rating,
                                               String advertDate,String comment)
    {
        return new SellerRating.Builder()
                                .getUserName(userName)
                                .getSurName(surName)
                                .getAdvertDate(advertDate)
                                .getRating(rating)
                                 .getComment(comment)
                                .build();
    }
}
