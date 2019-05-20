package com.cput.org.Controller.repository;

import com.cput.org.Controller.Domain.AdvertiseBook;

import java.util.*;

public class AdvertiseBookRepositoryImpl implements AdvertiseBookRepository
{
  private static AdvertiseBookRepositoryImpl repository = null;
  private Map<String,AdvertiseBook> advertiseBooks;


  private AdvertiseBookRepositoryImpl()
  {
      this.advertiseBooks = new HashMap<>();
  }

  public static AdvertiseBookRepositoryImpl getRepository()
  {
      if(repository==null) repository = new AdvertiseBookRepositoryImpl();
      return repository;

  }

  public AdvertiseBook create(AdvertiseBook advertiseBook)
  {
      this.advertiseBooks.put(advertiseBook.getUserName(),advertiseBook);
      this.advertiseBooks.put(advertiseBook.getTitle(),advertiseBook);
      this.advertiseBooks.put(String.valueOf(advertiseBook.getPrice()),advertiseBook);
      this.advertiseBooks.put(String.valueOf(advertiseBook.isBuyOrSell()),advertiseBook);
      this.advertiseBooks.put(advertiseBook.getDate(),advertiseBook);
      return advertiseBook;
  }


  public AdvertiseBook update(AdvertiseBook advertiseBook)
  {
      this.advertiseBooks.replace(advertiseBook.getUserName(),advertiseBook);
      this.advertiseBooks.replace(advertiseBook.getTitle(),advertiseBook);
      this.advertiseBooks.replace(String.valueOf(advertiseBook.getPrice()),advertiseBook);
      this.advertiseBooks.replace(String.valueOf(advertiseBook.isBuyOrSell()),advertiseBook);
      this.advertiseBooks.replace(advertiseBook.getDate(),advertiseBook);
      return advertiseBook;
  }

    public void delete(AdvertiseBook advertiseBook)
    {
     this.advertiseBooks.remove(advertiseBook);
    }


    public AdvertiseBook read(AdvertiseBook advertiseBook)
    {
        this.advertiseBooks.get(advertiseBook);
        return advertiseBook;
    }


    public Set<AdvertiseBook> getAll()
  {
      Collection<AdvertiseBook> advertiseBooks = this.advertiseBooks.values();
      Set<AdvertiseBook> set = new HashSet<>();
      set.addAll(advertiseBooks);
      return set;
  }

}
