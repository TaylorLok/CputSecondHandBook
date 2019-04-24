package Factory;

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
