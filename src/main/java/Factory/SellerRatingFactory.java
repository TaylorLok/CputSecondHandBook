package Factory;

import Domain.SellerRating;

public class SellerRatingFactory
{

    public static SellerRating getSellerRating()
    {
        return new SellerRating.Builder()

                                .build();
    }
}
