package Domain;

public abstract class BookByCourse extends Book
{
    private String informationTech;
    private String management;
    private String commerce;
    private String marketing;
    private  String projectManagement;


   public BookByCourse()
    {
      super();
    }
    public BookByCourse (Builder builder)
    {
        this.informationTech = builder. informationTech;
        this.management = builder.management;
        this.commerce = builder.commerce;
        this.marketing = builder.marketing;
        this.projectManagement = builder.projectManagement;

    }

    public String getInformationTech()
    {
        return informationTech;
    }

    public String getManagement()
    {
        return management;
    }


    public String getCommerce()
    {
        return commerce;
    }

    public String getMarketing()
    {
        return marketing;
    }

    public String getProjectManagement()
    {
        return projectManagement;
    }

    public static class Builder
    {
        private String informationTech;
        private String management;
        private String commerce;
        private String marketing;
        private  String projectManagement;

        public Builder informationTech(String informationTech)
        {
            this.informationTech = informationTech;
            return this;
        }

        public Builder management(String management)
        {
            this.management = management;
            return this;
        }

        public Builder commerce(String commerce)
        {
            this.commerce = commerce;
            return this;
        }

        public Builder marketing(String marketing)
        {
            this.marketing = marketing;
            return this;
        }

        public Builder projectManagement(String projectManagement)
        {
            this.projectManagement = projectManagement;
            return this;
        }

        public BookByCourse build()
        {
            BookByCourse bookByCourse = new BookByCourse(this) {
                @Override
                public String getDptOfAppliedScience() {
                    return null;
                }

                @Override
                public String getDptOfInformDesign() {
                    return null;
                }

                @Override
                public String getDptOfEngineering() {
                    return null;
                }

                @Override
                public String getDptOfEducation() {
                    return null;
                }

                @Override
                public String getDptOfBusiness() {
                    return null;
                }

                @Override
                public String getDptOfHealth() {
                    return null;
                }
            };
            return bookByCourse;
        }
    }


}
