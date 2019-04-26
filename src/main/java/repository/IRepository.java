package repository;

public interface IRepository<book,sort>
{
    book create(book sort);
    book update(book sort);
    void delete(sort sort);
    book read(sort sort);
}
