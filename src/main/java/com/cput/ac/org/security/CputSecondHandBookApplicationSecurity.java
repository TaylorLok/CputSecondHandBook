package com.cput.ac.org.security;

import org.springframework.context.annotation.Configuration;


@Configuration
public class CputSecondHandBookApplicationSecurity //extends WebSecurityConfigurerAdapter
{
    /*
    private static final String USER_ROLE = "USER";
    private static final String ADMIN_ROLE = "FOUNDER";

    @Override
    protected void configure (AuthenticationManagerBuilder auth) throws Exception
    {
        auth . inMemoryAuthentication()
                .withUser("user")
                .password(encode().encode("password"))
                .roles("USER_ROLE")
                .and()
                .withUser("founder")
                .password(encode().encode("founder"))
                .roles(USER_ROLE,ADMIN_ROLE);
    }

    */
}
