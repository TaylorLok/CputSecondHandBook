package com.cput.ac.org.service;

import com.cput.ac.org.Domain.SellerRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("SellerRatingServiceImpl")
public class SellerRatingServiceImpl implements SellerRatingService
{
    @Autowired
    @Qualifier("SellerRatingServiceImpl")
    private static SellerRatingServiceImpl service = null;
    private Map<String,SellerRating > rating;

    private SellerRatingServiceImpl()
    {
        this.rating = new HashMap<>();
    }

    public static SellerRatingServiceImpl getRepository()
    {
        if(service == null) service = new SellerRatingServiceImpl();
        return service;

    }


    @Override
    public SellerRating create(SellerRating sell)
    {
        this.rating.put(sell.getUserName(),sell);
        this.rating.put(sell.getSurName(),sell);
        this.rating.put(sell.getRating(),sell);
        this.rating.put(sell.getComment(),sell);
        return sell;
    }

    @Override
    public SellerRating update(SellerRating sell)
    {
        this.rating.replace(sell.getUserName(),sell);
        this.rating.replace(sell.getSurName(),sell);
        this.rating.replace(sell.getRating(),sell);
        this.rating.replace(sell.getComment(),sell);
        return sell;
    }

    @Override
    public void delete(SellerRating sell)
    {
        this.rating.remove(sell);
    }

    @Override
    public SellerRating read(SellerRating sell)
    {
        this.rating.get(sell);
        return sell;
    }

    @Override
    public Set<SellerRating> getAll()
    {
        Collection<SellerRating> sellerRatings = this.rating.values();
        Set<SellerRating> set = new HashSet<>();
        set.addAll(sellerRatings);
        return set;
    }
}
