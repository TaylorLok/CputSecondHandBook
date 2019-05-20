package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.SellerRating;

import java.util.Set;

public interface SellerRatingRepository extends IRepository<SellerRating,String>
{
    Set<SellerRating> getAll();
}
