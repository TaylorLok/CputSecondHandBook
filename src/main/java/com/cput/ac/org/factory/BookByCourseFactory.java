package com.cput.ac.org.factory;

import com.cput.ac.org.domain.BookByCourse;

public class BookByCourseFactory
{
    public static BookByCourse getBookbyCouse(String informationTech, String management, String commerce, String marketing, String projectManagement)
    {
        return new BookByCourse.Builder()
                .informationTech()
                .management()
                .commerce()
                .marketing()
                .projectManagement()
                .build();

    }

}
