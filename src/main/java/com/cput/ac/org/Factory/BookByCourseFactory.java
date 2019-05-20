package com.cput.org.Controller.Factory;

import com.cput.org.Controller.Domain.BookByCourse;

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
