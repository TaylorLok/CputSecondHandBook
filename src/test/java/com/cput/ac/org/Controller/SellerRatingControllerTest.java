package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.SellerRating;
import com.cput.ac.org.Factory.SellerRatingFactory;
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
public class SellerRatingControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/SellerRating";
    private SellerRating sellerRating;

    @Before
    public void setUp() throws Exception
    {
        sellerRating = SellerRatingFactory.getSellerRating("taylor","Lokombe","*****","22/05/2019","test");
    }

    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        ResponseEntity<SellerRating> postResponse = restTemplate.postForEntity(baseURL + "/create", sellerRating, SellerRating.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        sellerRating = restTemplate.getForObject(baseURL + "/update/"+sellerRating.getUserName(),SellerRating.class);
        SellerRating updatedBook = restTemplate.getForObject(baseURL + "/updatebook/"+ sellerRating.getUserName(),SellerRating.class);
        assertNotNull(updatedBook);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        sellerRating = restTemplate.getForObject(baseURL + "/read/", SellerRating.class);
        assertNotNull(sellerRating);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAll()
    {

        sellerRating = restTemplate.getForObject(baseURL + "/SellerRating/" + sellerRating,SellerRating.class);
        assertNotNull(sellerRating);
        restTemplate.delete(baseURL + "/SellerRating/" + sellerRating);

        try
        {
            sellerRating = restTemplate.getForObject(baseURL + "/SellerRating/" + sellerRating, SellerRating.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}