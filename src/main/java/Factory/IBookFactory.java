package Factory;

import Domain.Book;

import java.util.Map;

public interface IBookFactory
{
    Book getBook(Map<String, String> input);
}
