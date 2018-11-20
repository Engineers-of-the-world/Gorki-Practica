package com.mycompany.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
    	
    	httpSecurity.authorizeRequests()
    	//.permitAll()
    	//.fullyAuthenticated()
    	//.antMatchers("*/index/*").authenticated()
    	.anyRequest().fullyAuthenticated();
    	//.and().httpBasic();
    	
    	httpSecurity.csrf().disable();
    	
    }
    }