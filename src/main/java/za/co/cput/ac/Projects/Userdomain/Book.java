package Domain;

public class Book implements IBook
{

    private String bookTitle;
    private String bookDescription;
    private int bookPrice;
    private String publisher;
    private  String publicationDate;
    private String bookLanguage;

    protected Book()
    {

    }

    public Book (Builder builder)
    {
        this.bookDescription = builder. bookDescription;
        this.bookLanguage = builder. bookLanguage;
        this.bookPrice = builder.bookPrice;
        this.bookTitle = builder.bookTitle;
        this.publicationDate = builder. publicationDate;
        this.publisher = builder.publisher;
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public String getBookDescription()
    {
        return bookDescription;
    }

    public int getBookPrice()
    {
        return bookPrice;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public String getPublicationDate()
    {
        return publicationDate;
    }

    public String getBookLanguage()
    {
        return bookLanguage;
    }

    public static class Builder
    {
        private String bookTitle;
        private String bookDescription;
        private int bookPrice;
        private String publisher;
        private  String publicationDate;
        private String bookLanguage;

        public Builder bookTitle(String bookTitle)
        {
            this.bookTitle = bookTitle;
                    return this;
        }

        public Builder bookDescription(String bookDescription)
        {
            this.bookDescription= bookDescription;
            return this;
        }

        public Builder bookPrice(int bookPrice)
        {
            this.bookPrice = bookPrice;
            return this;
        }

        public Builder publisher(String publisher)
        {
            this.publisher = publisher;
            return this;
        }

        public Builder publicationDate(String publicationDate)
        {
            this.publicationDate = publicationDate;
            return this;
        }

        public Builder bookLanguage(String bookLanguage)
        {
            this.bookLanguage = bookLanguage;
            return this;
        }

        public Book build()
        {
            return new Book(this);
        }
    }

}
