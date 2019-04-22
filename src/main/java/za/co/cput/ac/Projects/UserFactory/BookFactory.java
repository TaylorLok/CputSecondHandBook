package Factory;

import Domain.Book;

import java.util.Map;

public class BookFactory implements IBookFactory
{
    private static BookFactory factory = null;

    private BookFactory()
    {

    }

    public static BookFactory getInstance()
    {
        if (factory == null)
            factory = new BookFactory();

        return factory;
    }

    public Book getBook(Map<String, String> input) {

        Book book = new Book.Builder().build();


        if (input.containsKey("title"))
        {
            Book bookTitle = new Book.Builder()
                    .bookTitle(input.get("title"))
                    .build();
            book = bookTitle;

        }
        if (input.containsKey("Description"))
        {
            Book bookDescription = new Book.Builder()
                    .bookDescription(input.get("Description"))
                    .build();
            book = bookDescription;

        }
        if (input.containsKey("Publisher"))
        {
            Book publisher = new Book.Builder()
                    .publisher(input.get("publisher"))
                    .build();
            book = publisher;
        }

        if (input.containsKey("Publication Date"))
        {
            Book publicationDate = new Book.Builder()
                    .publicationDate(input.get("publicationDate"))
                    .build();
            book = publicationDate;
        }

        if (input.containsKey("Book Language"))
        {
            Book bookLanguage = new Book.Builder()
                    .bookLanguage(input.get("bookLanguage"))
                    .build();
            book = bookLanguage;
        }

        if (input.containsKey("Book Price"))
        {
            Book bookPrice = new Book.Builder()
                    .publicationDate(input.get("bookPrice"))
                    .build();
            book = bookPrice;
        }


        return book;


    }
}
