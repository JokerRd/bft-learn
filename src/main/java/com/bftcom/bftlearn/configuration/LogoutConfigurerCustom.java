package com.bftcom.bftlearn.configuration;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.stereotype.Component;

@Component
public class LogoutConfigurerCustom implements Customizer<LogoutConfigurer<HttpSecurity>> {

    @Override
    public void customize(LogoutConfigurer<HttpSecurity> httpSecurityLogoutConfigurer) {
        httpSecurityLogoutConfigurer
                .permitAll()
                .logoutSuccessUrl("/registration");

    }
}
