package com.bftcom.bftlearn.configuration;

import lombok.SneakyThrows;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.stereotype.Component;

@Component
public class AuthorizeRequestCustom implements Customizer<ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry> {

    @SneakyThrows
    @Override
    public void customize(ExpressionUrlAuthorizationConfigurer<HttpSecurity>
                                      .ExpressionInterceptUrlRegistry expressionInterceptUrlRegistry) {
        expressionInterceptUrlRegistry
                .antMatchers("/registration").not().fullyAuthenticated()
                .anyRequest().authenticated();
    }
}
