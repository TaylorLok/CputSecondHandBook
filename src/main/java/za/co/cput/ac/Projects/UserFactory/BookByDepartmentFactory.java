package Factory;

public class BookByDepartmentFactory
{
   public static BookByDepartmentFactory getInstance(String dptOfAppliedScience,String dptOfInformDesign,
                                                     String dptOfEngineering,String dptOfEducation,String dptOfBusiness,
                                                     String dptOfHealth)
   {
       return new BookByDepartmentFactory.Builder()
                  .dptOfAppliedScience(dptOfAppliedScience)
                  .dptOfInformDesign(dptOfInformDesign)
                  .dptOfEngineering(dptOfEngineering)
                  .dptOfEducation(dptOfEducation)
                  .dptOfBusiness(dptOfBusiness)
                  .dptOfHealth(dptOfHealth)
                  .build();
   }
}
