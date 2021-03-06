package com.myproject.v1;


import com.auth0.spring.security.api.JwtWebSecurityConfigurer;
import com.myproject.v1.auth.JWTAuthenticationFilter;
import com.myproject.v1.auth.JWTAuthorizationFilter;
import com.myproject.v1.auth.SecurityConstants;
import com.myproject.v1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfigurationSource;

public class SecurityConfig{

}

//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Value(value = "${auth0.apiAudience}")
//    private String apiAudience;
//    @Value(value = "${auth0.issuer}")
//    private String issuer;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        JwtWebSecurityConfigurer
//                .forRS256(apiAudience, issuer)
//                .configure(http)
//                .cors().and().csrf().disable().authorizeRequests()
//                .anyRequest().permitAll();
//    }
//

//}