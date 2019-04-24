package Factory.Book;

import Domain.Book.Book;

import java.util.Map;

public interface IBookFactory
{
    Book getBook(Map<String, String> input);
}
