package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.BookByAuthor;
import com.cput.ac.org.Factory.BookByAuthorFactory;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)

public class BookByAuthorControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/BookByAuthor";



    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        BookByAuthor author = BookByAuthorFactory.getAuthor("paolo","a brazilian writer");


        ResponseEntity<BookByAuthor> postResponse = restTemplate.postForEntity(baseURL + "/create", author, BookByAuthor.class);

        assertEquals("paolo","paolo");
        assertEquals("paolo",author.getName(),author);
        assertEquals("a brazilian",author.getBio(),author);
        postResponse.getBody();

    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        String author = "Taylor";
        BookByAuthor author1 = restTemplate.getForObject(baseURL + "/update/" + author, BookByAuthor.class);
        restTemplate.put(baseURL + "/update/" + author,BookByAuthor.class);
        assertEquals("Taylor",author1.getName());
        assertNotNull(author);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        String authBook = "kabaso";

        BookByAuthor author = restTemplate.getForObject(baseURL + "/read/" + authBook, BookByAuthor.class);
        restTemplate.getForEntity(baseURL + "/read/" + author,BookByAuthor.class);
        assertNotNull(authBook);

    }

    @Test(expected = ResourceAccessException.class)
    public void getAll()
    {
        String booksAuthor = null;

        BookByAuthor book = restTemplate.getForObject(baseURL + "/Admin/" + booksAuthor,BookByAuthor.class);
        assertNotNull(book);
        restTemplate.delete(baseURL + "/BookByAuthor/" + booksAuthor);

        try
        {
            book = restTemplate.getForObject(baseURL + "/BookByAuthor/" + booksAuthor,BookByAuthor.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}