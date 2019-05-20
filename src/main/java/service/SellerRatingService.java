package service;

import Domain.SellerRating;

import java.util.Set;

public interface SellerRatingService extends IService<SellerRating,String >
{
    Set<SellerRating> getAll();
}
