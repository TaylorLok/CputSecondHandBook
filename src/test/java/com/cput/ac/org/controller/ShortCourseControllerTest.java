package com.cput.ac.org.controller;

import com.cput.ac.org.domain.ShortCourse;
import com.cput.ac.org.factory.ShortCourseFactory;
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
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class ShortCourseControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/ShortCourse";
    private ShortCourse course;

    @Before
    public void setUp() throws Exception
    {
        course = ShortCourseFactory.getShortCourseBooks("ccna1","ccna2","ccnp","security");
    }

    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        ResponseEntity<ShortCourse> postResponse = restTemplate.postForEntity(baseURL + "/create", course, ShortCourse.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        course = restTemplate.getForObject(baseURL + "/update/"+ course.getCcna1(),ShortCourse.class);
        ShortCourse updatedBook = restTemplate.getForObject(baseURL + "/updateCourse/"+ course.getCcna1(),ShortCourse.class);
        assertNotNull(updatedBook);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        course = restTemplate.getForObject(baseURL + "/read/", ShortCourse.class);
        assertNotNull(course);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAll()
    {

        course = restTemplate.getForObject(baseURL + "/ShortCourse/" + course,ShortCourse.class);
        assertNotNull(course);
        restTemplate.delete(baseURL + "/ShortCourse/" + course);

        try
        {
            course = restTemplate.getForObject(baseURL + "/ShortCourse/" + course, ShortCourse.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}