package com.cput.ac.org.domain;

import javax.persistence.Entity;

@Entity
public class BookByCourse extends Book
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

        public Builder management()
        {
            this.management = management;
            return this;
        }

        public Builder commerce()
        {
            this.commerce = commerce;
            return this;
        }

        public Builder marketing()
        {
            this.marketing = marketing;
            return this;
        }

        public Builder projectManagement()
        {
            this.projectManagement = projectManagement;
            return this;
        }

        public BookByCourse build()
        {
            return new BookByCourse(this);
        }

        public Builder informationTech()
        {
            this.informationTech = informationTech;
            return this;
        }
    }

    @Override
    public String toString()
    {
        return "BookByCourse{" + "informationTech='" + informationTech +
                '\'' + ", management='" + management + '\'' + ", commerce='" + commerce +
                '\'' + ", marketing='" + marketing + '\'' + ", projectManagement='" + projectManagement +
                '\'' + '}';
    }
}
