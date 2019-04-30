package repository;

import Domain.SellerRating;

import java.util.Set;

public interface SellerRatingRepository extends IRepository<SellerRating,String>
{
    Set<SellerRating> getAll();
}
