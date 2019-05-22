package com.cput.ac.org.Domain;

public class BookByDepartment extends Book
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

    public BookByDepartment (Builder builder )
    {
        this.dptOfAppliedScience = builder.dptOfAppliedScience;
        this.dptOfInformDesign = builder.dptOfInformDesign;
        this.dptOfEngineering = builder.dptOfEngineering;
        this.dptOfEducation = builder.dptOfEducation;
        this.dptOfBusiness = builder.dptOfBusiness;
        this.dptOfHealth = builder.dptOfHealth;
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

    public static class Builder
    {
        private String dptOfAppliedScience;
        private String dptOfInformDesign;
        private String dptOfEngineering;
        private  String dptOfEducation;
        private String dptOfBusiness;
        private String dptOfHealth;

        public Builder dptOfAppliedScience(String dptOfAppliedScience)
        {
            this.dptOfAppliedScience = dptOfAppliedScience;
            return this;
        }

        public  Builder dptOfInformDesign(String dptOfInformDesign)
        {
            this.dptOfInformDesign = dptOfInformDesign;
            return this;
        }

        public  Builder dptOfEngineering(String dptOfEngineering)
        {
            this.dptOfEngineering = dptOfEngineering;
            return this;
        }

        public  Builder dptOfEducation(String dptOfEducation)
        {
            this.dptOfEducation = dptOfEducation;
            return this;
        }

        public  Builder dptOfBusiness(String dptOfBusiness)
        {
            this.dptOfBusiness = dptOfBusiness;
            return this;
        }

        public  Builder dptOfHealth(String dptOfHealth)
        {
            this.dptOfHealth = dptOfHealth;
            return this;
        }

        public BookByDepartment build()
        {
            return new BookByDepartment(this);
        }
    }

    @Override
    public String toString() {
        return "BookByDepartment{" + "dptOfAppliedScience='" + dptOfAppliedScience +
                '\'' + ", dptOfInformDesign='" + dptOfInformDesign +
                '\'' + ", dptOfEngineering='" + dptOfEngineering + '\''
                + ", dptOfEducation='" + dptOfEducation + '\'' + ", dptOfBusiness='"
                + dptOfBusiness + '\'' + ", dptOfHealth='" + dptOfHealth + '\'' + '}';
    }
}
