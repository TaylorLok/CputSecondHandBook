package com.cput.ac.org.service;

import com.cput.ac.org.domain.BookByCourse;
import com.cput.ac.org.repository.BookByCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service("BookByCourseServiceImpl")
public class BookByCourseServiceImpl implements BookByCourseService
{
    private static BookByCourseServiceImpl service = null;
    private Map<String, BookByCourse> books;

    private BookByCourseServiceImpl()
    {
        this.books = new HashMap<>();
        this.service = service;
    }

    public static BookByCourseServiceImpl getRepository()
    {
        if(service == null) service = new BookByCourseServiceImpl();
        return service;

    }

    @Autowired
    BookByCourseRepository bookByCourseRepository;

    @Override
    public BookByCourse create(BookByCourse bookCourse)
    {
        this.books.put(bookCourse.getProjectManagement(),bookCourse);
        this.books.put(bookCourse.getCommerce(),bookCourse);
        this.books.put(bookCourse.getInformationTech(),bookCourse);
        this.books.put(bookCourse.getManagement(),bookCourse);
        this.books.put(bookCourse.getMarketing(),bookCourse);
        return bookCourse;
    }

    @Override
    public BookByCourse update(BookByCourse bookCourse)
    {
        this.books.replace(bookCourse.getProjectManagement(),bookCourse);
        this.books.replace(bookCourse.getCommerce(),bookCourse);
        this.books.replace(bookCourse.getInformationTech(),bookCourse);
        this.books.replace(bookCourse.getManagement(),bookCourse);
        this.books.replace(bookCourse.getMarketing(),bookCourse);
        return bookCourse;
    }

    @Override
    public void delete(BookByCourse bookCourse)
    {
        this.books.remove(bookCourse);
    }

    @Override
    public BookByCourse read(BookByCourse bookCourse)
    {
        this.books.get(bookCourse);
        return bookCourse;
    }

    @Override
    public Set<BookByCourse> getAll()
    {
        Set<BookByCourse> set = new HashSet<>();
        set.addAll(bookByCourseRepository.findAll());
        return set;
    }
}
