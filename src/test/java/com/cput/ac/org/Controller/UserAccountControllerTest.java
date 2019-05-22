package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.UserAccount;
import com.cput.ac.org.Factory.UserAccountFactory;
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
public class UserAccountControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/UserAccount";
    private UserAccount account;

    @Before
    public void setUp() throws Exception
    {
        account = UserAccountFactory.getUserAccount("22/05/2019","Active");
    }

    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        ResponseEntity<UserAccount> postResponse = restTemplate.postForEntity(baseURL + "/create", account, UserAccount.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        account = restTemplate.getForObject(baseURL + "/update/"+ account.getStatus(),UserAccount.class);
        UserAccount updatedBook = restTemplate.getForObject(baseURL + "/updateCourse/"+ account.getStatus(),UserAccount.class);
        assertNotNull(updatedBook);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        account = restTemplate.getForObject(baseURL + "/read/", UserAccount.class);
        assertNotNull(account);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAll()
    {

        account = restTemplate.getForObject(baseURL + "/UserAccount/" + account,UserAccount.class);
        assertNotNull(account);
        restTemplate.delete(baseURL + "/UserAccount/" + account);

        try
        {
            account = restTemplate.getForObject(baseURL + "/UserAccount/" + account, UserAccount.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}