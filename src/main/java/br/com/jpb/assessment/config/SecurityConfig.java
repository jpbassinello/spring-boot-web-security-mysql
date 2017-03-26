package br.com.jpb.assessment.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
				.antMatchers("/user/**")
				.hasRole("USER")
				.and()
				.exceptionHandling()
				.accessDeniedPage("/404")
				.and()
				.sessionManagement()
				.sessionFixation()
				.none()
				.and()
				.formLogin()
				.loginPage("/user/")
				.failureUrl("/user/?error")
				//				.loginProcessingUrl("/j_spring_security_check")
				//				.usernameParameter("j_username")
				//				.passwordParameter("j_password")
				.defaultSuccessUrl("/user/home")
				.permitAll()
				.and()
				.logout()
				//				.logoutUrl("/j_spring_security_logout")
				.logoutSuccessUrl("/");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web
				.ignoring()
				.antMatchers("/")
				.antMatchers("/resources/**");
	}
}
