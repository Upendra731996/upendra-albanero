package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) //this line for amke only admin user this
public class UserSecurity extends WebSecurityConfigurerAdapter {
    //============================== this is basic authentication=======

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/user/getUser").hasRole("NORMAL")
//                .antMatchers("user/userCreate").hasRole("ADMIN")
//                .anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic();
//
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("ajit").password(this.passwordEncoder().encode("gupta@123")).roles("ADMIN");
//        auth.inMemoryAuthentication().withUser("aji").password(this.passwordEncoder().encode("ajit@123")).roles("NORMAL");
//    }
//    @Bean
//    public PasswordEncoder passwordEncoder(){
////        return NoOpPasswordEncoder.getInstance();
//        return new BCryptPasswordEncoder(10);
//    }
    //====================================
@Override
protected void configure(HttpSecurity http) throws Exception {
    http
            .csrf().disable()
            .authorizeRequests()
            .antMatchers("/user/getUser").hasRole("NORMAL")
            .antMatchers("user/userCreate").hasRole("ADMIN")
            .anyRequest()
            .authenticated()
            .and()
            .formLogin();


}

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("ajit").password(this.passwordEncoder().encode("gupta@123")).roles("ADMIN");
        auth.inMemoryAuthentication().withUser("aji").password(this.passwordEncoder().encode("ajit@123")).roles("NORMAL");
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
        return new BCryptPasswordEncoder(10);
    }
    //====================================
}
