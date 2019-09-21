package com.cput.ac.org.controller;

import com.cput.ac.org.domain.BookByDepartment;
import com.cput.ac.org.factory.BookByDepartmentFactory;
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
public class BookByDepartmentControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/BookByDepartment";

    private BookByDepartment dptment;

    @Before
    public void setUp() throws Exception
    {
        dptment = BookByDepartmentFactory.getDepartmentBook("Science","design",
                "engineer","edu1","busi","clinic H" );
    }

    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        ResponseEntity<BookByDepartment> postResponse = restTemplate.postForEntity(baseURL + "/create", dptment, BookByDepartment.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        dptment = restTemplate.getForObject(baseURL + "/update/"+dptment.getDptOfAppliedScience(),BookByDepartment.class);
        BookByDepartment updatedBook = restTemplate.getForObject(baseURL + "/updatebook/"+ dptment,BookByDepartment.class);
        assertNotNull(updatedBook);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        dptment = restTemplate.getForObject(baseURL + "/read/", BookByDepartment.class);
        assertNotNull(dptment);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAll()
    {
        //String bookByC = null;

        dptment = restTemplate.getForObject(baseURL + "/BookByCourse/" + dptment,BookByDepartment.class);
        assertNotNull(dptment);
        restTemplate.delete(baseURL + "/BookByCourse/" + dptment);

        try
        {
            dptment = restTemplate.getForObject(baseURL + "/BookByCourse/" + dptment, BookByDepartment.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}