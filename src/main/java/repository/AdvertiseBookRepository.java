package repository;

import Domain.AdvertiseBook;

import java.util.Set;

public interface AdvertiseBookRepository extends IRepository<AdvertiseBook,String>
{
    Set<AdvertiseBook> getAll();
}
