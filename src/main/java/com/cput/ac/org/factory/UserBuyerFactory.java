package com.cput.ac.org.factory;

import com.cput.ac.org.domain.UserBuyer;

public class UserBuyerFactory
{
   public static UserBuyer getBuyer(String name,String surname)
   {
       return new UserBuyer.Builder()
                           .getName(name)
                           .getSurname(surname)
                           .build();


   }



}
