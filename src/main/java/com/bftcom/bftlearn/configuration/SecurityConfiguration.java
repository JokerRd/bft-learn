package com.bftcom.bftlearn.configuration;

import com.bftcom.bftlearn.services.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final AuthorizeRequestCustom authorizeRequestCustom;
    private final FormLoginConfigurerCustom formLoginConfigurerCustom;
    private final LogoutConfigurerCustom logoutConfigurerCustom;
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    public SecurityConfiguration(AuthorizeRequestCustom authorizeRequestCustom,
                                 FormLoginConfigurerCustom formLoginConfigurerCustom,
                                 LogoutConfigurerCustom logoutConfigurerCustom,
                                 UserService userService,
                                 PasswordEncoder passwordEncoder) {
        this.authorizeRequestCustom = authorizeRequestCustom;
        this.userService = userService;
        this.formLoginConfigurerCustom = formLoginConfigurerCustom;
        this.logoutConfigurerCustom = logoutConfigurerCustom;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests(authorizeRequestCustom)
                .csrf().disable()
                .formLogin(formLoginConfigurerCustom);
    }

    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
    }
}
