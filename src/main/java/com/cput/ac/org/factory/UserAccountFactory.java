package com.cput.ac.org.factory;

import com.cput.ac.org.domain.UserAccount;

public class UserAccountFactory
{
    public static UserAccount getUserAccount(String creationDate, String status)
    {
        return new UserAccount.Builder()
                              .getStatus(status)
                               .getCreationDate(creationDate)
                               .build();
    }
}
