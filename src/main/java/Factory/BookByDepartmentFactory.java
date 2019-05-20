package Factory;

import Domain.BookByDepartment;

public class BookByDepartmentFactory
{
    public static BookByDepartment getDepartmentBook(String dptOfAppliedScience,String dptOfInformDesign,
                                                     String dptOfEngineering,
                                                     String dptOfEducation,String dptOfBusiness,String dptOfHealth)
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
