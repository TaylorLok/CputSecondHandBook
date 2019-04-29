package repository;

import Domain.AdvertiseBook;

import java.util.HashSet;
import java.util.Set;

public class AdvertiseBookRepositoryImpl implements AdvertiseBookRepository
{
  private static AdvertiseBookRepositoryImpl repository = null;
  private Set<AdvertiseBook> advertiseBooks;


  private AdvertiseBookRepositoryImpl()
  {
      this.advertiseBooks = new HashSet<>();
  }

  public static AdvertiseBookRepositoryImpl getRepository()
  {
      if(repository==null) repository = new AdvertiseBookRepositoryImpl();
      return repository;

  }

  public AdvertiseBook create(AdvertiseBook advertiseBook)
  {
      this.advertiseBooks.add(advertiseBook);
      return advertiseBook;
  }

  public AdvertiseBook read(String desc)
  {
      return null;
  }

  public void delete(String desc)
  {

  }

  public AdvertiseBook update(AdvertiseBook advertiseBook)
  {
      return advertiseBook;
  }

    @Override
    public void delete(AdvertiseBook sort) {

    }

    @Override
    public AdvertiseBook read(AdvertiseBook sort) {
        return null;
    }

    public Set<AdvertiseBook> getAll()
  {
      return this.advertiseBooks;
  }

}
