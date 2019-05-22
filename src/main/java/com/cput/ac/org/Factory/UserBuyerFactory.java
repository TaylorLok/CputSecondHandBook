package com.cput.ac.org.Factory;

import com.cput.ac.org.Domain.UserBuyer;

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
