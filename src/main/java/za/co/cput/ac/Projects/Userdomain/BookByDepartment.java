package Domain;

public abstract class BookByDepartment extends Book
{
    private String dptOfAppliedScience;
    private String dptOfInformDesign;
    private String dptOfEngineering;
    private  String dptOfEducation;
    private String dptOfBusiness;
    private String dptOfHealth;

    public BookByDepartment(String dptOfAppliedScience,String dptOfInformDesign,String dptOfEngineering,String dptOfEducation,String dptOfBusiness,String dptOfHealth,String bookTitle,String bookDescription,Double bookPrice,String publisher,String publicationDate,String bookLanguage)
    {
      super();
        this.dptOfAppliedScience = dptOfAppliedScience;
        this.dptOfInformDesign = dptOfInformDesign;
        this.dptOfEngineering = dptOfEngineering;
        this.dptOfEducation = dptOfEducation;
        this.dptOfBusiness = dptOfBusiness;
        this.dptOfHealth = dptOfHealth;
    }

    public BookByDepartment (Builder builder,String dptOfAppliedScience,String dptOfInformDesign,String dptOfEngineering,String dptOfEducation,String dptOfBusiness,String dptOfHealth )
    {
        super((builder));
        this.dptOfAppliedScience = dptOfAppliedScience;
        this.dptOfInformDesign = dptOfInformDesign;
        this.dptOfEngineering = dptOfEngineering;
        this.dptOfEducation = dptOfEducation;
        this.dptOfBusiness = dptOfBusiness;
        this.dptOfHealth = dptOfHealth;
    }

    public String getDptOfAppliedScience()
    {
        return dptOfAppliedScience;
    }

    public String getDptOfInformDesign()
    {
        return dptOfInformDesign;
    }

    public String getDptOfEngineering()
    {
        return dptOfEngineering;
    }

    public String getDptOfEducation()
    {
        return dptOfEducation;
    }

    public String getDptOfBusiness()
    {
        return dptOfBusiness;
    }

    public String getDptOfHealth()
    {
        return dptOfHealth;
    }

}
