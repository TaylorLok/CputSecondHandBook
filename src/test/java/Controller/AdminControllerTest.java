package Controller;

import com.cput.ac.org.domain.Admin;
import com.cput.ac.org.factory.AdminFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)

public class AdminControllerTest
{
   @Autowired
   private TestRestTemplate restTemplate;
   private String baseURL = "http://localhost:8080/Admin";





    @Test
    public void getAll()
    {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all", HttpMethod.GET,entity,String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetAdmin()
    {
        Admin admin = restTemplate.getForObject(baseURL + "/Admin/permis",Admin.class);
        System.out.println(admin.getUser());
        System.out.println(admin.getPermission());
        System.out.println(admin.manageAdvert());
        System.out.println(admin.manageBook());
        assertNotNull(admin);
    }

    @Test
    public void create(Admin admin)
    {
       admin = AdminFactory.getAdmin("allowed");

       ResponseEntity<Admin> posResponse = restTemplate.postForEntity(baseURL + "/create",admin,Admin.class);
       assertNotNull(posResponse);
       assertNotNull(posResponse.getBody());
    }



}