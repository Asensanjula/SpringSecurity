package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity(debug = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    //this class


    @Override
    protected void configure( AuthenticationManagerBuilder auth ) throws Exception {

        auth.inMemoryAuthentication()
            .withUser( "asen" )
            .password( "123" )
            .roles( "admin" );
    }

    @Bean
    PasswordEncoder getPasswordEncoder() {

        return  NoOpPasswordEncoder.getInstance();
    }
}
