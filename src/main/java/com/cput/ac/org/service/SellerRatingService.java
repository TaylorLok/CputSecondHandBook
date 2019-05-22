package com.cput.ac.org.service;

import com.cput.ac.org.Domain.SellerRating;

import java.util.Set;

public interface SellerRatingService extends IService<SellerRating,String >
{
    Set<SellerRating> getAll();
}
