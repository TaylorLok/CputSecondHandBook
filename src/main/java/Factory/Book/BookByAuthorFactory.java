package Factory.Book;

import Domain.Book.BookByAuthor;

public class BookByAuthorFactory
{
    private static BookByAuthorFactory getAuthor(String name,String Bio)
    {
        return new BookByAuthorFactory.Builder()
                   .name(name)
                   .Bio(Bio)
                   . build();
    }


}
