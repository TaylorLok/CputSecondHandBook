package com.cput.ac.org.controller;

import com.cput.ac.org.domain.Comment;
import com.cput.ac.org.factory.CommentFactory;
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
public class CommentControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/Comment";
    private Comment cmnt;


    @Before
    public void setUp() throws Exception
    {
        cmnt = CommentFactory.getComment("Espoir","keep it up");
    }

    @Test(expected = ResourceAccessException.class)
    public void create()
    {
        ResponseEntity<Comment> postResponse = restTemplate.postForEntity(baseURL + "/create", cmnt, Comment.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test(expected = ResourceAccessException.class)
    public void update()
    {
        cmnt = restTemplate.getForObject(baseURL + "/update/"+cmnt.getUserName(),Comment.class);
        Comment updatedBook = restTemplate.getForObject(baseURL + "/updatebook/"+ cmnt.getUserName(),Comment.class);
        assertNotNull(updatedBook);
    }

    @Test(expected = ResourceAccessException.class)
    public void read()
    {
        cmnt = restTemplate.getForObject(baseURL + "/read/", Comment.class);
        assertNotNull(cmnt);
    }

    @Test(expected = ResourceAccessException.class)
    public void getAll()
    {

        cmnt = restTemplate.getForObject(baseURL + "/Comment/" + cmnt,Comment.class);
        assertNotNull(cmnt);
        restTemplate.delete(baseURL + "/Comment/" + cmnt);

        try
        {
            cmnt = restTemplate.getForObject(baseURL + "/Comment/" + cmnt, Comment.class);
        } catch (final HttpClientErrorException e)
        {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}