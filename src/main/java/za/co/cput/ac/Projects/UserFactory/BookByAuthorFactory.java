package Factory;

import Domain.BookByAuthor;
import Domain.IBookByAuthor;

import java.util.Map;

public abstract class BookByAuthorFactory implements IBookByAuthor
{
    private static BookByAuthorFactory factory = null;

    protected BookByAuthorFactory()
    {

    }
    public BookByAuthor getBook(Map<String, String> input)
    {

        BookByAuthor author = new BookByAuthor.Builder().build();

        if (input.containsKey("Name"))
        {
            BookByAuthor author1 = new BookByAuthor.Builder()
                    .name(getName())
                    .Bio(getBio())
                    .build();

        }

        return author;
    }
}
