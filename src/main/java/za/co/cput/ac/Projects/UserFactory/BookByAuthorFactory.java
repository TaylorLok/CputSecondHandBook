package Factory;

import Domain.BookByAuthor;

import java.util.Map;

public class BookByAuthorFactory
{
    private static BookByAuthorFactory getInstance(String name,String Bio)
    {
        return new BookByAuthorFactory.Builder()
                   .name(name)
                   .Bio(Bio)
                   . build();
    }


}
