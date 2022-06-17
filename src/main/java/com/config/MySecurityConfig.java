package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
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
            .password( "$2a$12$83jnIIaHoqjM6hSJbmPfGOZaAZz3hqtzH3YJ641I2AlKbiAzGOEXO" ).roles( "admin" ) // 123
            .and()
            .withUser( "sanjula" )
            .password( "$2a$12$83jnIIaHoqjM6hSJbmPfGOZaAZz3hqtzH3YJ641I2AlKbiAzGOEXO" ).roles( "user" ); // 123
    }


    @Override
    protected void configure( HttpSecurity http ) throws Exception {

        http.authorizeRequests()
            .antMatchers( "/helloWorld").authenticated()
            .antMatchers( "/bye" ).permitAll()
            .and()
            .formLogin().loginPage( "/myCustomLogin" ).loginProcessingUrl( "/process-login" )
            .and()
            .httpBasic();
    }

    @Bean
    PasswordEncoder getPasswordEncoder() {

        return  new BCryptPasswordEncoder();
    }
}
