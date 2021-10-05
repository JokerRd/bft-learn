package com.bftcom.bftlearn.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final AuthorizeRequestCustom authorizeRequestCustom;
    private final FormLoginConfigurerCustom formLoginConfigurerCustom;

    public SecurityConfiguration(AuthorizeRequestCustom authorizeRequestCustom,
                                 FormLoginConfigurerCustom formLoginConfigurerCustom) {
        this.authorizeRequestCustom = authorizeRequestCustom;
        this.formLoginConfigurerCustom = formLoginConfigurerCustom;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests(authorizeRequestCustom::customize)
                .formLogin(formLoginConfigurerCustom);
    }
}
