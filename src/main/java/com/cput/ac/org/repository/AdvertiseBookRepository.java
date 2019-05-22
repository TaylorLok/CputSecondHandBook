package com.cput.ac.org.repository;

import com.cput.ac.org.Domain.AdvertiseBook;

import java.util.Set;

public interface AdvertiseBookRepository extends IRepository<AdvertiseBook,String>
{
    Set<AdvertiseBook> getAll();
}
