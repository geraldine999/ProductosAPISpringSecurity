package com.example.productosapispringsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/","/index.html").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin();
    }

    //esto suele ir en otra clase
    @Bean //ejecutar esto una vez e instanciarla
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(5); //hashea y agrega salt and pepper
        //cuanto mas alto sea el strength, mas va a tardar
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {

        UserDetails usuario1 = User.builder()
                .username("pablo")
                .password(passwordEncoder().encode("unafacil"))
                .roles("ADMIN")
                .build();

        UserDetails usuario2= User.builder()
                .username("geraldine")
                .password(passwordEncoder().encode("unafacil"))
                .roles("ADMIN")
                .build();
        UserDetails usuario3= User.builder()
                .username("jazmin")
                .password(passwordEncoder().encode("unafacil"))
                .roles("CLIENTE")
                .build();
        UserDetails usuario4= User.builder()
                .username("natalia")
                .password(passwordEncoder().encode("unafacil"))
                .roles("CLIENTE")
                .build();

        return new InMemoryUserDetailsManager(usuario1, usuario2, usuario3, usuario4);
    }
}
