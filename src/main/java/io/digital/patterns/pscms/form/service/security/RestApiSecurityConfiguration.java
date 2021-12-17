package io.digital.patterns.pscms.form.service.security;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.DelegatingOAuth2TokenValidator;
import org.springframework.security.oauth2.core.OAuth2TokenValidator;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoders;
import org.springframework.security.oauth2.jwt.JwtValidators;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;




@Configuration
@EnableWebSecurity
@Order(SecurityProperties.BASIC_AUTH_ORDER - 20)
@EnableGlobalMethodSecurity(jsr250Enabled = true, prePostEnabled = true)
public class RestApiSecurityConfiguration extends WebSecurityConfigurerAdapter {

    private static final String ACTUATOR_HEALTH = "/actuator/health/**";
    private static final String ACTUATOR_METRICS = "/actuator/metrics/**";
    private static final String ACTUATOR_INFO = "/actuator/info/**";
    private static final String ACTUATOR_PROMETHEUS = "/actuator/prometheus/**";
    private static final String ACTUATOR = "/actuator";

    @Value("${spring.security.oauth2.resourceserver.jwt.issuer-uri}")
    private String issuer;



    private final KeycloakAuthenticationConverter keycloakJwtConverter;

    public RestApiSecurityConfiguration(KeycloakAuthenticationConverter keycloakJwtConverter) {
        this.keycloakJwtConverter = keycloakJwtConverter;
        SecurityContextHolder
                .setStrategyName(SecurityContextHolder.MODE_INHERITABLETHREADLOCAL);
    }

    @Override
    public void configure(final HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, ACTUATOR_HEALTH).permitAll()
                .antMatchers(HttpMethod.GET,ACTUATOR_METRICS).permitAll()
                .antMatchers(HttpMethod.GET,ACTUATOR_INFO).permitAll()
                .antMatchers(ACTUATOR, "GET").permitAll()
                .antMatchers(HttpMethod.GET, ACTUATOR_PROMETHEUS).permitAll()
                .antMatchers("/swagger/**").permitAll()
                .antMatchers("/docs/**").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().oauth2ResourceServer()
                .jwt()
                .jwtAuthenticationConverter(keycloakJwtConverter);
    }

    @Bean
    public NimbusJwtDecoder jwtDecoder() {
        NimbusJwtDecoder jwtDecoder = (NimbusJwtDecoder)
                JwtDecoders.fromOidcIssuerLocation(issuer);

        OAuth2TokenValidator<Jwt> audienceValidator = new AudienceValidator("camunda-rest-api");
        OAuth2TokenValidator<Jwt> withIssuer = JwtValidators.createDefaultWithIssuer(issuer);
        OAuth2TokenValidator<Jwt> withAudience = new DelegatingOAuth2TokenValidator<>(withIssuer, audienceValidator);

        jwtDecoder.setJwtValidator(withAudience);

        return jwtDecoder;
    }



}