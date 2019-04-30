package Factory;

import Domain.SellerRating;
import sun.plugin.dom.core.Comment;

public class SellerRatingFactory
{
    public static SellerRating getSellerRating(String userName,String surName,String rating,String advertDate, Comment comment)
    {
        return new SellerRating.Builder()
                               .getUserName(userName)
                                .getSurName(surName)
                                .getRating(rating)
                                .getAdvertDate(advertDate)
                                .getComment(comment)
                                .build();
    }
}
