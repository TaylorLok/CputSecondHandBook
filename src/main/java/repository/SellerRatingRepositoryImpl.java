package repository;

import Domain.SellerRating;

import java.util.HashSet;
import java.util.Set;

public class SellerRatingRepositoryImpl implements SellerRatingRepository
{
    private static SellerRatingRepository repository = null;
    private Set<SellerRating> seller;

    private SellerRatingRepositoryImpl()
    {
        this.seller = new HashSet<>();
    }

    protected static SellerRatingRepositoryImpl getRepository()
    {
        if(repository==null)repository = new SellerRatingRepositoryImpl();
        return getRepository();
    }



    @Override
    public SellerRating create(SellerRating sort)
    {
        this.seller.add(sort);
        return sort;
    }

    @Override
    public SellerRating update(SellerRating sort)
    {
        return null;
    }

    @Override
    public void delete(SellerRating sort)
    {

    }

    @Override
    public SellerRating read(SellerRating sort)
    {
        return null;
    }

    @Override
    public Set<SellerRating> getAll()
    {
        return null;
    }
}
