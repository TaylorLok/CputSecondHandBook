package com.cput.ac.org.repository;

import com.cput.ac.org.Domain.BookByCourse;

import java.util.*;

public class BookByCourseRepositoryImpl implements BookByCourseRepository
{
    private static BookByCourseRepository repository;
    private Map<String, BookByCourse> bookByCourseMap;

    private BookByCourseRepositoryImpl()
    {
        this.bookByCourseMap = new HashMap<>();
    }

    public static BookByCourseRepository getRepository()
    {
        if(repository == null) repository = new BookByCourseRepositoryImpl();
        return repository;
    }


    @Override
    public BookByCourse create(BookByCourse bookCourse)
    {
        this.bookByCourseMap.put(bookCourse.getProjectManagement(),bookCourse);
        this.bookByCourseMap.put(bookCourse.getCommerce(),bookCourse);
        this.bookByCourseMap.put(bookCourse.getInformationTech(),bookCourse);
        this.bookByCourseMap.put(bookCourse.getManagement(),bookCourse);
        this.bookByCourseMap.put(bookCourse.getMarketing(),bookCourse);
        return bookCourse;
    }

    @Override
    public BookByCourse update(BookByCourse bookCourse)
    {
        this.bookByCourseMap.replace(bookCourse.getProjectManagement(),bookCourse);
        this.bookByCourseMap.replace(bookCourse.getCommerce(),bookCourse);
        this.bookByCourseMap.replace(bookCourse.getInformationTech(),bookCourse);
        this.bookByCourseMap.replace(bookCourse.getManagement(),bookCourse);
        this.bookByCourseMap.replace(bookCourse.getMarketing(),bookCourse);
        return bookCourse;
    }

    @Override
    public void delete(BookByCourse bookCourse)
    {
        this.bookByCourseMap.remove(bookCourse);
    }

    @Override
    public BookByCourse read(BookByCourse bookCourse)
    {
        this.bookByCourseMap.get(bookCourse);
        return bookCourse;
    }

    @Override
    public Set<BookByCourse> getAll()
    {
        Collection<BookByCourse> bookByCourses = this.bookByCourseMap.values();
        Set<BookByCourse> set = new HashSet<>();
        set.addAll(bookByCourses);
        return set;
    }
}
