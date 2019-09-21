package com.cput.ac.org.repository;

import com.cput.ac.org.domain.SellerRating;

import java.util.Set;

public interface SellerRatingRepository extends IRepository<SellerRating,String>
{
    Set<SellerRating> getAll();
}
