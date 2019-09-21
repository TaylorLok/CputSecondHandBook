package com.cput.ac.org.factory;

import com.cput.ac.org.domain.BookByAuthor;

public class BookByAuthorFactory
{
    public static BookByAuthor getAuthor(String name, String Bio)
    {
        return new BookByAuthor.Builder()
                               .name(name)
                               .Bio(Bio)
                               .build();
    }
}
