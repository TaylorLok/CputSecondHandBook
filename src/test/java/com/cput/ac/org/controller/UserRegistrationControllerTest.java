package com.cput.ac.org.controller;

import com.cput.ac.org.domain.UserRegistration;
import com.cput.ac.org.factory.UserRegistrationFactory;
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
public class UserRegistrationControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/UserRegistration";
    private UserRegistration usereg;


    @Before
    public void setUp() throws Exception
    {
        usereg = UserRegistrationFactory.getUserRegistration("tl","Lt","12548","1230","tay@gmail.com");
    }

    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        ResponseEntity<UserRegistration> postResponse = restTemplate.postForEntity(baseURL + "/create", usereg, UserRegistration.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        usereg = restTemplate.getForObject(baseURL + "/update/"+ usereg.getPassword(),UserRegistration.class);
        UserRegistration updatedBook = restTemplate.getForObject(baseURL + "/updatedPassword/"+ usereg.getPassword(),UserRegistration.class);
        assertNotNull(updatedBook);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        usereg = restTemplate.getForObject(baseURL + "/read/", UserRegistration.class);
        assertNotNull(usereg);
    }

    @Test(expected = ResourceAccessException.class)
    public void getAll()
    {

        usereg = restTemplate.getForObject(baseURL + "/UserRegistration/" + usereg,UserRegistration.class);
        assertNotNull(usereg);
        restTemplate.delete(baseURL + "/UserRegistration/" + usereg);

        try
        {
            usereg = restTemplate.getForObject(baseURL + "/UserRegistration/" + usereg, UserRegistration.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}