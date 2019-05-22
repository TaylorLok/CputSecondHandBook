package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.BookByCourse;
import com.cput.ac.org.Factory.BookByCourseFactory;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class BookByCourseControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/BookByCourse";
    private BookByCourse bookByCourse;

    @Before
    public void setUp() throws Exception
    {
      bookByCourse = BookByCourseFactory.getBookbyCouse("IT","mng","cmrce","mrkt","prjmnt");
    }

    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        ResponseEntity<BookByCourse> postResponse = restTemplate.postForEntity(baseURL + "/create", bookByCourse, BookByCourse.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
       bookByCourse = restTemplate.getForObject(baseURL + "/update/"+bookByCourse.getInformationTech(),BookByCourse.class);
       BookByCourse updatedBook = restTemplate.getForObject(baseURL + "/updatebook/"+ bookByCourse.getInformationTech(),BookByCourse.class);
       assertNotNull(updatedBook);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        bookByCourse = restTemplate.getForObject(baseURL + "/read/", BookByCourse.class);
        assertNotNull(bookByCourse);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAll()
    {
        //String bookByC = null;

         bookByCourse = restTemplate.getForObject(baseURL + "/BookByCourse/" + bookByCourse,BookByCourse.class);
        assertNotNull(bookByCourse);
        restTemplate.delete(baseURL + "/BookByCourse/" + bookByCourse);

        try
        {
            bookByCourse = restTemplate.getForObject(baseURL + "/BookByCourse/" + bookByCourse, BookByCourse.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}