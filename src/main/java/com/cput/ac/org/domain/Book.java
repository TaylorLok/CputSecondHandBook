package com.cput.ac.org.domain;

import com.cput.ac.org.factory.IBookFactory;

import javax.persistence.Entity;
import java.util.Map;

@Entity
public class Book implements IBookFactory
{

    private String bookTitle;
    private String bookDescription;
    private Double bookPrice;
    private String publisher;
    private  String publicationDate;
    private String bookLanguage;

    public Book()
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

    public Double getBookPrice()
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

    @Override
    public Book getBook(Map<String, String> input)
    {
        return null;
    }

    public static class Builder
    {
        private String bookTitle;
        private String bookDescription;
        private Double bookPrice;
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

        public Builder bookPrice(Double bookPrice)
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

    @Override
    public String toString()
    {
        return "domainBook{" + "bookTitle='" + bookTitle +
                '\'' + ", bookDescription='" + bookDescription +
                '\'' + ", bookPrice=" + bookPrice + ", publisher='"
                + publisher + '\'' + ", publicationDate='" + publicationDate +
                '\'' + ", bookLanguage='" + bookLanguage + '\'' + '}';
    }
}
