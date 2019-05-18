package service;

import Domain.AdvertiseBook;

import java.util.Set;

public interface AdvertiseBookService extends IService<AdvertiseBook,String>
{
    Set<AdvertiseBook> getAll();
}
