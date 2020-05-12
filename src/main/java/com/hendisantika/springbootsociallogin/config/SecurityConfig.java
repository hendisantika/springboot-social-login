package com.hendisantika.springbootsociallogin.config;

import com.hendisantika.springbootsociallogin.security.FacebookConnectionSignup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-social-login
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/05/20
 * Time: 07.01
 */
@Configuration
@EnableWebSecurity
@ComponentScan(basePackages = {"com.hendisantika.springbootsociallogin"})
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${spring.social.facebook.appSecret}")
    String appSecret;

    @Value("${spring.social.facebook.appId}")
    String appId;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private FacebookConnectionSignup facebookConnectionSignup;

}
