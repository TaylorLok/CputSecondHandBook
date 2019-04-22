package Domain;

public class BookByAuthor extends Book
{
    private String name;
    private String Bio;

    private BookByAuthor()
    {

    }

    public BookByAuthor(Builder builder)
    {
        this.name = builder.name;
        this.Bio = builder.Bio;
    }

    public String getName()
    {
        return name;
    }

    public String getBio()
    {
        return Bio;
    }

    public static class Builder
    {
        private String name;
        private String Bio;


        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder Bio(String Bio)
        {
            this.Bio = Bio;
            return this;
        }

        public BookByAuthor build()
        {
            return new BookByAuthor(this);
        }
    }
}
