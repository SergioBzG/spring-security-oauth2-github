package com.sbz.springsecoauth2github.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

public class SpringSecOAUTH2GitHubConfig {
    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> requests.anyRequest().authenticated())
                .oauth2Login(Customizer.withDefaults()); // Using oauth2Login to enable OAuth2 login
        return http.build();
    }

    // With configuration below the client app (this app) knows all details
    // like what are the Auth Server (GitHub), client ID and client secret.

    // All this configuration was done in the application.properties file

//    @Bean
//    public ClientRegistrationRepository clientRepository() {
//        ClientRegistration clientReg = clientRegistration();
//        return new InMemoryClientRegistrationRepository(clientReg);
//    }
//
//    /**
//     * Client ID : 29bb90ae4bd00e307e3e
//     * Client Secret : 07316123e3f1bdbd9e1bd02fda777ce90fd73017
//     */
//    private ClientRegistration clientRegistration() {
//        return CommonOAuth2Provider.GITHUB.getBuilder("github")
//                .clientId("29bb90ae4bd00e307e3e")
//                .clientSecret("07316123e3f1bdbd9e1bd02fda777ce90fd73017")
//                .build();
//    }
}
