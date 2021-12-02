package com.ejemplo.tiendaalamano;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;

import com.ejemplo.tiendaalamano.config.JWTAuthorizationFilter;

@SpringBootApplication
public class TiendaALaManoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaALaManoApplication.class, args);
	}

	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			CorsConfiguration configuration = new CorsConfiguration();
			configuration.setAllowedHeaders(Arrays.asList("Authorization", "Cache-Control", "Content-Type"));
			configuration.setAllowedOrigins(Arrays.asList("*"));
			configuration.setAllowedMethods(Arrays.asList("GET", "POST", "HEAD", "PUT", "DELETE"));
			configuration.setAllowCredentials(true);
			configuration.setExposedHeaders(Arrays.asList("Authorization"));

			http.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
					.authorizeRequests().antMatchers(HttpMethod.GET, "/api/auth").permitAll().anyRequest()
					.authenticated()
					.and().csrf().disable().cors().configurationSource(request -> configuration);
		}
	}
}
