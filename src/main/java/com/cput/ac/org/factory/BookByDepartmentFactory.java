package com.cput.ac.org.factory;

import com.cput.ac.org.domain.BookByDepartment;

public class BookByDepartmentFactory
{
    public static BookByDepartment getDepartmentBook(String dptOfAppliedScience, String dptOfInformDesign,
                                                     String dptOfEngineering,
                                                     String dptOfEducation, String dptOfBusiness, String dptOfHealth)
    {
        return new BookByDepartment.Builder()
                                    .dptOfInformDesign(dptOfInformDesign)
                                    .dptOfHealth(dptOfHealth)
                                    .dptOfEngineering(dptOfEngineering)
                                    .dptOfEducation(dptOfEducation)
                                    .dptOfBusiness(dptOfBusiness)
                                    .dptOfAppliedScience(dptOfAppliedScience)
                                    .build();
    }
}
