package Domain;

public abstract class UserBuyer implements Search
{
    private String search;
    private String name, surname;

    private UserBuyer()
    {

    }

    public UserBuyer(Builder builder)
    {
        this.search = builder.search;
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public String getSearch()
    {
        return search;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public static class Builder
    {
        private String search;
        private String name, surname;


        public UserBuyer search(String search)
        {
            this.search = search;
            return search(search);
        }

        public UserBuyer name(String name)
        {
            this.name = name;
            return name(name);
        }

        public UserBuyer surname(String surname)
        {
            this.surname = surname;
            return surname(surname);
        }

        public UserBuyer build()
        {
            return new UserBuyer(this)
            {
                @Override
                public String getBook()
                {
                    return String.valueOf(this);
                }

                @Override
                public String getUser()
                {
                    return String.valueOf(this);
                }
            };
        }
    }


    @Override
    public String toString() {
        return "UserBuyer{" + "search='" + search + '\'' + "," +
                " name='" + name + '\'' + ", surname='" + surname + '\'' + '}';
    }
}
