package com.cput.ac.org.controller;

import com.cput.ac.org.domain.ResponseObject;
import com.cput.ac.org.domain.UserLogin;
import com.cput.ac.org.factory.ResponseObjectFactory;
import com.cput.ac.org.service.UserLoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CputSecondHandBook/UserLogin")
public class BookManagementController
{
    @Autowired
   UserLoginServiceImpl userLoginService;


    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createUserLogin(@RequestBody UserLogin userlogin)
{
    System.out.println(userlogin);
    ResponseObject responseObject = ResponseObjectFactory.buildGenericResponseObject(HttpStatus.OK.toString(),"user created!");
    if (userlogin.getEmailAddress()==null || userlogin.getPassword()==null){
        responseObject.setResponse(HttpStatus.PRECONDITION_FAILED.toString());
        responseObject.setResponseDescription("Please provide a login credentials");
    }
    else
        {
            UserLogin user = saveUserLogin(userlogin);
            responseObject.setResponse(user);

    }
    return ResponseEntity.ok(responseObject);
}
    private UserLogin saveUserLogin(UserLogin userLogin)
    {
        return userLoginService.create(userLogin);
    }

}
