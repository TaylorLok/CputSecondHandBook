package Factory;

import Domain.UserBuyer;

public class UserBuyerFactory
{
   public static UserBuyer getBuyer(String search)
   {
       return new UserBuyer.Builder()
                          //.search(search)
                           .build();

   }


}
