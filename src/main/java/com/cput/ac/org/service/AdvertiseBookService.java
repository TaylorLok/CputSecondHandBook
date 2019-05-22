package com.cput.ac.org.service;

import com.cput.ac.org.Domain.AdvertiseBook;

import java.util.Set;

public interface AdvertiseBookService extends IService<AdvertiseBook,String>
{
    Set<AdvertiseBook> getAll();
}
