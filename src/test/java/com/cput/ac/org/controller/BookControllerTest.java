package com.cput.ac.org.controller;

import com.cput.ac.org.domain.Book;
import com.cput.ac.org.factory.BookFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class BookControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/Book";
    private Book book;

    @Before
    public void setUp() throws Exception
    {
        book = BookFactory.getNewBook("how to program","important book for programmers",200.00,"Ngoune",
                "22/05/2019","English & French");
    }

    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        ResponseEntity<Book> postResponse = restTemplate.postForEntity(baseURL + "/create", book, Book.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        book = restTemplate.getForObject(baseURL + "/update/"+book.getBookTitle(),Book.class);
        Book updatedBook = restTemplate.getForObject(baseURL + "/updatebook/"+ book.getBookTitle(),Book.class);
        assertNotNull(updatedBook);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        book = restTemplate.getForObject(baseURL + "/read/", Book.class);
        assertNotNull(book);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAll()
    {

        book = restTemplate.getForObject(baseURL + "/Book/" + book,Book.class);
        assertNotNull(book);
        restTemplate.delete(baseURL + "/Book/" + book);

        try
        {
            book = restTemplate.getForObject(baseURL + "/Book/" + book, Book.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}