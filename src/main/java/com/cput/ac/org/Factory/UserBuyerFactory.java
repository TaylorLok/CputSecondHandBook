package com.cput.org.Controller.Factory;

import com.cput.org.Controller.Domain.UserBuyer;

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
