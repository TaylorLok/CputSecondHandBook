package com.cput.ac.org.controller;

import com.cput.ac.org.domain.UserForgotPassword;
import com.cput.ac.org.factory.UserForgotPasswordFactory;
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
public class UserForgotPasswordControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/UserForgotPaasword";
    private UserForgotPassword user;

    @Before
    public void setUp() throws Exception
    {
        user = UserForgotPasswordFactory.getUserPassword("your name","Sonia");
    }

    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        ResponseEntity<UserForgotPassword> postResponse = restTemplate.postForEntity(baseURL + "/create", user, UserForgotPassword.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        user = restTemplate.getForObject(baseURL + "/update/"+ user.getSecretQuestion(),UserForgotPassword.class);
        UserForgotPassword updatedBook = restTemplate.getForObject(baseURL + "/updatedPassword/"+ user.getSecretQuestion(),UserForgotPassword.class);
        assertNotNull(updatedBook);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        user = restTemplate.getForObject(baseURL + "/read/", UserForgotPassword.class);
        assertNotNull(user);
    }

    @Test(expected = ResourceAccessException.class)
    public void getAll()
    {

        user = restTemplate.getForObject(baseURL + "/UserForgotPassword/" + user,UserForgotPassword.class);
        assertNotNull(user);
        restTemplate.delete(baseURL + "/UserForgotPassword/" + user);

        try
        {
            user = restTemplate.getForObject(baseURL + "/UserForgotPassword/" + user, UserForgotPassword.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}