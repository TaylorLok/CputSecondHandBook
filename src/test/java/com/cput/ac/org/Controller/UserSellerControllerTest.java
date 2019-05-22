package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.UserSeller;
import com.cput.ac.org.Factory.UserSellerFactory;
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
public class UserSellerControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/UserSeller";
    private UserSeller usersell;



    @Before
    public void setUp() throws Exception
    {
        usersell = UserSellerFactory.getUserSeller("lokombe","Lokamba","214291324","123456",
                "jesus","Jesus of nazareth",200.00,"22/05/2019","25/05/2019");
    }

    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        ResponseEntity<UserSeller> postResponse = restTemplate.postForEntity(baseURL + "/create", usersell, UserSeller.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        usersell = restTemplate.getForObject(baseURL + "/update/"+ usersell.getStudentNumber(),UserSeller.class);
        UserSeller updatedBook = restTemplate.getForObject(baseURL + "/updatedStudentNo/"+ usersell.getStudentNumber(),UserSeller.class);
        assertNotNull(updatedBook);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        usersell = restTemplate.getForObject(baseURL + "/read/", UserSeller.class);
        assertNotNull(usersell);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAll()
    {

        usersell = restTemplate.getForObject(baseURL + "/UserSeller/" + usersell,UserSeller.class);
        assertNotNull(usersell);
        restTemplate.delete(baseURL + "/UserSeller/" + usersell);

        try
        {
            usersell = restTemplate.getForObject(baseURL + "/UserSeller/" + usersell, UserSeller.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}