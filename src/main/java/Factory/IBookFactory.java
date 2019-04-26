package Factory.Book;

import Domain.domainBook.Book;

import java.util.Map;

public interface IBookFactory
{
    Book getBook(Map<String, String> input);
}
