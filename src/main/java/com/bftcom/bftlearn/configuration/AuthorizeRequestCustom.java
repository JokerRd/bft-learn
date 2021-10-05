package com.bftcom.bftlearn.configuration;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.configurers
        .ExpressionUrlAuthorizationConfigurer.ExpressionInterceptUrlRegistry;
import org.springframework.stereotype.Component;

@Component
public class AuthorizeRequestCustom implements Customizer<ExpressionInterceptUrlRegistry> {
    @Override
    public void customize(ExpressionInterceptUrlRegistry expressionInterceptUrlRegistry) {
        expressionInterceptUrlRegistry.anyRequest();
    }
}
