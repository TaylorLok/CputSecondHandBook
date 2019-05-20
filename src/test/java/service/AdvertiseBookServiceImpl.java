package service;

import Domain.AdvertiseBook;

import java.util.*;

public class AdvertiseBookServiceImpl implements AdvertiseBookService
{
    private static AdvertiseBookServiceImpl service = null;
    private Map<String,AdvertiseBook > advert;

    private AdvertiseBookServiceImpl()
    {
        this.advert = new HashMap<>();
    }

    public static AdvertiseBookServiceImpl getRepository()
    {
        if(service == null) service = new AdvertiseBookServiceImpl();
        return service;

    }



    public AdvertiseBook create(AdvertiseBook advertiseBook)
    {
        this.advert.put(advertiseBook.getUserName(),advertiseBook);
        this.advert.put(advertiseBook.getTitle(),advertiseBook);
        this.advert.put(String.valueOf(advertiseBook.getPrice()),advertiseBook);
        this.advert.put(String.valueOf(advertiseBook.isBuyOrSell()),advertiseBook);
        this.advert.put(advertiseBook.getDate(),advertiseBook);
        return advertiseBook;
    }


    public AdvertiseBook update(AdvertiseBook advertiseBook)
    {
        this.advert.replace(advertiseBook.getUserName(),advertiseBook);
        this.advert.replace(advertiseBook.getTitle(),advertiseBook);
        this.advert.replace(String.valueOf(advertiseBook.getPrice()),advertiseBook);
        this.advert.replace(String.valueOf(advertiseBook.isBuyOrSell()),advertiseBook);
        this.advert.replace(advertiseBook.getDate(),advertiseBook);
        return advertiseBook;
    }

    public void delete(AdvertiseBook advertiseBook)
    {
        this.advert.remove(advertiseBook);
    }


    public AdvertiseBook read(AdvertiseBook advertiseBook)
    {
        this.advert.get(advertiseBook);
        return advertiseBook;
    }


    public Set<AdvertiseBook> getAll()
    {
        Collection<AdvertiseBook> advertiseBooks = this.advert.values();
        Set<AdvertiseBook> set = new HashSet<>();
        set.addAll(advertiseBooks);
        return set;
    }
}
