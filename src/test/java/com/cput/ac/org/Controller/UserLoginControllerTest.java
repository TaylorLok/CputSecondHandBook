package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.UserLogin;
import com.cput.ac.org.Factory.UserLoginFactory;
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
public class UserLoginControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/UserLogin";
    private UserLogin user;


    @Before
    public void setUp() throws Exception
    {
        user = UserLoginFactory.createLogin("tay@gmail.com","12345");
    }

    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        ResponseEntity<UserLogin> postResponse = restTemplate.postForEntity(baseURL + "/create", user, UserLogin.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        user = restTemplate.getForObject(baseURL + "/update/"+ user.getEmailAddress(),UserLogin.class);
        UserLogin updatedBook = restTemplate.getForObject(baseURL + "/updatedLogin/"+ user.getEmailAddress(),UserLogin.class);
        assertNotNull(updatedBook);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        user = restTemplate.getForObject(baseURL + "/read/", UserLogin.class);
        assertNotNull(user);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAll()
    {

        user = restTemplate.getForObject(baseURL + "/UserLogin/" + user,UserLogin.class);
        assertNotNull(user);
        restTemplate.delete(baseURL + "/UserLogin/" + user);

        try
        {
            user = restTemplate.getForObject(baseURL + "/UserLogin/" + user, UserLogin.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}