package com.bftcom.bftlearn.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final AuthorizeRequestCustom authorizeRequestCustom;
    private final FormLoginConfigurerCustom formLoginConfigurerCustom;
    private final LogoutConfigurerCustom logoutConfigurerCustom;

    public SecurityConfiguration(AuthorizeRequestCustom authorizeRequestCustom,
                                 FormLoginConfigurerCustom formLoginConfigurerCustom,
                                 LogoutConfigurerCustom logoutConfigurerCustom) {
        this.authorizeRequestCustom = authorizeRequestCustom;
        this.formLoginConfigurerCustom = formLoginConfigurerCustom;
        this.logoutConfigurerCustom = logoutConfigurerCustom;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests(authorizeRequestCustom)
                .formLogin(formLoginConfigurerCustom)
                .logout(logoutConfigurerCustom);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password(passwordEncoder().encode("password"))
                .roles("USER")
                .and()
                .withUser("admin")
                .password(passwordEncoder().encode("adminPassword"))
                .roles("ADMIN");
    }
}
