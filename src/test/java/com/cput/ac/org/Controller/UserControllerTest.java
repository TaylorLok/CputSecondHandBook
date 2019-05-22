package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.User;
import com.cput.ac.org.Factory.UserFactory;
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
public class UserControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/User";
    private User user;

    @Before
    public void setUp() throws Exception
    {
        user = UserFactory.getUser("Lokamba","Lokombe","214291324","214291324");
    }

    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        ResponseEntity<User> postResponse = restTemplate.postForEntity(baseURL + "/create", user, User.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        user = restTemplate.getForObject(baseURL + "/update/"+ user.getName(),User.class);
        User updatedBook = restTemplate.getForObject(baseURL + "/updateddUser/"+ user.getName(),User.class);
        assertNotNull(updatedBook);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        user = restTemplate.getForObject(baseURL + "/read/", User.class);
        assertNotNull(user);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAll()
    {

        user = restTemplate.getForObject(baseURL + "/User/" + user,User.class);
        assertNotNull(user);
        restTemplate.delete(baseURL + "/User/" + user);

        try
        {
            user = restTemplate.getForObject(baseURL + "/UserBuyer/" + user, User.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}