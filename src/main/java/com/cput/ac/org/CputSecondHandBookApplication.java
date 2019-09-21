package com.cput.ac.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Configuration
public class CputSecondHandBookApplication
{

   @Bean
    public RestTemplate restTemplate()
   {
       return new RestTemplate();
    }

    public static void main(String[]args)
    {

        SpringApplication.run(CputSecondHandBookApplication.class,args);
    }
}
