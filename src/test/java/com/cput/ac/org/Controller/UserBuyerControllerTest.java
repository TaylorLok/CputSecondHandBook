package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.UserBuyer;
import com.cput.ac.org.Factory.UserBuyerFactory;
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
public class UserBuyerControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/UserAccount";
    private UserBuyer buyer;

    @Before
    public void setUp() throws Exception
    {
        buyer = UserBuyerFactory.getBuyer("John","Lokombe");
    }

    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        ResponseEntity<UserBuyer> postResponse = restTemplate.postForEntity(baseURL + "/create", buyer, UserBuyer.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        buyer = restTemplate.getForObject(baseURL + "/update/"+ buyer.getName(),UserBuyer.class);
        UserBuyer updatedBook = restTemplate.getForObject(baseURL + "/updatedBuyer/"+ buyer.getName(),UserBuyer.class);
        assertNotNull(updatedBook);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        buyer = restTemplate.getForObject(baseURL + "/read/", UserBuyer.class);
        assertNotNull(buyer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAll()
    {

        buyer = restTemplate.getForObject(baseURL + "/UserBuyer/" + buyer,UserBuyer.class);
        assertNotNull(buyer);
        restTemplate.delete(baseURL + "/UserBuyer/" + buyer);

        try
        {
            buyer = restTemplate.getForObject(baseURL + "/UserBuyer/" + buyer, UserBuyer.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}