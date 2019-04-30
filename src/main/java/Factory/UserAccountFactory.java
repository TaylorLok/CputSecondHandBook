package Factory;

import Domain.UserAccount;

public class UserAccountFactory
{
    public static UserAccount getUserAccount(String creationDate,String status)
    {
        return new UserAccount.Builder()
                              .getStatus(status)
                               .getCreationDate(creationDate)
                               .build();
    }
}
