package com.cput.org.Controller.service;

import com.cput.org.Controller.Domain.SellerRating;

import java.util.Set;

public interface SellerRatingService extends IService<SellerRating,String >
{
    Set<SellerRating> getAll();
}
