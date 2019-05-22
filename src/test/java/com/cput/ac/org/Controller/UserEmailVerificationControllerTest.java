package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.UserEmailVerification;
import com.cput.ac.org.Factory.UserEmailVerificationFactory;
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
public class UserEmailVerificationControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/UserEmailVerification";
    private UserEmailVerification user;

    @Before
    public void setUp() throws Exception
    {
        user = UserEmailVerificationFactory.getUserVerify("taylor","1245525","tay@gmail.com","002");
    }

    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        ResponseEntity<UserEmailVerification> postResponse = restTemplate.postForEntity(baseURL + "/create", user, UserEmailVerification.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        user = restTemplate.getForObject(baseURL + "/update/"+ user.getStudentNumber(),UserEmailVerification.class);
        UserEmailVerification updatedBook = restTemplate.getForObject(baseURL + "/updatedStudentNo/"+ user.getStudentNumber(),UserEmailVerification.class);
        assertNotNull(updatedBook);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        user = restTemplate.getForObject(baseURL + "/read/", UserEmailVerification.class);
        assertNotNull(user);
    }

    @Test(expected = ResourceAccessException.class)
    public void getAll()
    {

        user = restTemplate.getForObject(baseURL + "/UserSeller/" + user,UserEmailVerification.class);
        assertNotNull(user);
        restTemplate.delete(baseURL + "/UserEmailVerification/" + user);

        try
        {
            user = restTemplate.getForObject(baseURL + "/UserEmailVerification/" + user, UserEmailVerification.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}