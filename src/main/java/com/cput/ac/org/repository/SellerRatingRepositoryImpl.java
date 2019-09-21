package com.cput.ac.org.repository;

import com.cput.ac.org.domain.SellerRating;

import java.util.*;

public class SellerRatingRepositoryImpl implements SellerRatingRepository
{
    private static SellerRatingRepository repository;
    private Map<String, SellerRating> seller;

    private SellerRatingRepositoryImpl()
    {
        this.seller = new HashMap<>();
    }

    public static SellerRatingRepositoryImpl getRepository()
    {
        if(repository==null)repository = new SellerRatingRepositoryImpl();
        return (SellerRatingRepositoryImpl) repository;
    }


    @Override
    public SellerRating create(SellerRating selRat)
    {
        this.seller.put(selRat.getUserName(),selRat);
        this.seller.put(selRat.getSurName(),selRat);
        this.seller.put(selRat.getRating(),selRat);
        this.seller.put(selRat.getComment(),selRat);
        return selRat;
    }

    @Override
    public SellerRating update(SellerRating selRat)
    {
        this.seller.replace(selRat.getUserName(),selRat);
        this.seller.replace(selRat.getSurName(),selRat);
        this.seller.replace(selRat.getRating(),selRat);
        this.seller.replace(selRat.getComment(),selRat);
        return selRat;
    }

    @Override
    public void delete(SellerRating selRat)
    {
        this.seller.remove(selRat);
    }

    @Override
    public SellerRating read(SellerRating selRat)
    {
        this.seller.get(selRat);
        return selRat;
    }

    @Override
    public Set<SellerRating> getAll()
    {
        Collection<SellerRating> sellerRatings = this.seller.values();
        Set<SellerRating> set = new HashSet<>();
        set.addAll(sellerRatings);
        return set;
    }
}
