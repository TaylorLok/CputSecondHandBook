package com.cput.ac.org.Controller;

import com.cput.ac.org.Domain.Admin;
import com.cput.ac.org.Factory.AdminFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;



@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class AdminControllerTest
{

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/Admin";

    @Test(expected = ResourceAccessException.class)
    public void getAll()
    {
        HttpHeaders headers = new HttpHeaders();


        HttpEntity<String> entity = new HttpEntity<String>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all", HttpMethod.GET,entity,String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void create()
    {
        Admin admin = AdminFactory.getAdmin("allow");

        ResponseEntity<Admin> postResponse = restTemplate.postForEntity(baseURL + "/create", admin, Admin.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        String notAllow = null;

        Admin admin = restTemplate.getForObject(baseURL + "/Admin/" + notAllow,Admin.class);

        restTemplate.put(baseURL + "/Admin/" + notAllow,admin);
        Admin updatedAdmin = restTemplate.getForObject(baseURL + "/Admin/" + notAllow,Admin.class);
        assertNotNull(updatedAdmin);
    }

    @Test(expected = ResourceAccessException.class)
    public void delete()
    {
        String permit = null;

        Admin admin = restTemplate.getForObject(baseURL + "/Admin/" + permit,Admin.class);
        assertNotNull(admin);
        restTemplate.delete(baseURL + "/Admin/" + permit);

        try
        {
            admin = restTemplate.getForObject(baseURL + "/Admin/" + permit,Admin.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }


}