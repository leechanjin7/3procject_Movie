package com.example.demo.configuration;

import com.example.demo.configuration.auth.CustomAuthenticationSuccessHandler;
import com.example.demo.configuration.auth.PrincipalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private PrincipalDetailsService principalDetailsService;

    @Autowired
    private CustomAuthenticationSuccessHandler successHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception{

        http.csrf().disable();

        http
                .authorizeRequests()
                    .antMatchers("/resources/**").permitAll()
                    .antMatchers("/", "/member/**", "/main", "/member/join","/member/login").permitAll()
                    .antMatchers("/admin").hasRole("ADMIN")
                    .anyRequest().authenticated()
                .and()

                .formLogin()
                    .loginPage("/member/login")
                    .successHandler(successHandler)
                    .defaultSuccessUrl("/main")
                    .permitAll()
                .and()

                .logout()
                    .logoutUrl("/member/logout")
                    .logoutSuccessUrl("/member/login")
                    .permitAll()
                ;


    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(principalDetailsService)
                .passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


}
