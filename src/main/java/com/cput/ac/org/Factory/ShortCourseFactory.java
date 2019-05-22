package com.cput.ac.org.Factory;

import com.cput.ac.org.Domain.ShortCourse;

public class ShortCourseFactory
{
    public static ShortCourse getShortCourseBooks(String ccna1, String ccna2, String ccnp, String cyberSecurity)
    {
        return new ShortCourse.Builder()
                              .ccna1(ccna1)
                              .ccna2(ccna2)
                              .ccnp(ccnp)
                              .cyberSecurity(cyberSecurity)
                              .build();
    }
}
