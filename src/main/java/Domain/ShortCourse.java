package Domain.domainBook;

public class ShortCourse extends BookByCourse
{
    private String ccna1;
    private String ccna2;
    private String ccnp;
    private String cyberSecurity;


    public ShortCourse()
    {
        super();
    }

    public ShortCourse(Builder builder)
    {
        this.ccna1 = builder.ccna1;
        this.ccna2 = builder.ccna2;
        this.ccnp = builder.ccnp;
        this.cyberSecurity = builder.cyberSecurity;

    }

    public String getCcna1()
    {
        return ccna1;
    }

    public String getCcna2()
    {
        return ccna2;
    }

    public String getCcnp()
    {
        return ccnp;
    }

    public String getCyberSecurity()
    {
        return cyberSecurity;
    }

    public static class Builder
    {
        private String ccna1;
        private String ccna2;
        private String ccnp;
        private String cyberSecurity;


        public Builder ccna1(String ccna1)
        {
            this.ccna1 = ccna1;
            return this;
        }

        public Builder ccna2(String ccna2)
        {
            this.ccna2 = ccna2;
            return this;
        }

        public Builder ccnp(String ccnp)
        {
            this.ccnp = ccnp;
            return this;
        }

        public Builder cyberSecurity(String cyberSecurity)
        {
            this.cyberSecurity = cyberSecurity;
            return this;
        }

        public ShortCourse build()
        {
            return new ShortCourse(this);
        }
    }

    @Override
    public String toString() {
        return "ShortCourse{" + "ccna1='" + ccna1 +
                '\'' + ", ccna2='" + ccna2 + '\'' +
                ", ccnp='" + ccnp + '\'' + ", cyberSecurity='"
                + cyberSecurity + '\'' + '}';
    }
}
