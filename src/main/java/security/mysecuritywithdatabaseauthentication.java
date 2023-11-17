package security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;


@Configuration
@EnableWebSecurity
public class mysecuritywithdatabaseauthentication {
	
	@Autowired
	UserDetailsService customDetailsService;

	 
	@Bean
	public static org.springframework.security.crypto.password.PasswordEncoder PasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails user = User.builder()
//				.username("user")
//				.password(PasswordEncoder().encode("password"))
//				.roles("USER")
//				.build();
//		UserDetails admin = User.builder()
//				.username("rakesh")
//				.password(PasswordEncoder().encode("rakesh"))
//				.roles("ADMIN", "USER")
//				.build();
//		return new InMemoryUserDetailsManager(user, admin);
//	}

	@Bean
	public AuthenticationManager authenticationManager() {
		
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(customDetailsService);
		authenticationProvider.setPasswordEncoder(PasswordEncoder());

	return new ProviderManager(authenticationProvider);
}
	
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
//			.authorizeHttpRequests().requestMatchers("/hello").permitAll().and()
			.authorizeHttpRequests((authorize)-> authorize.anyRequest().authenticated())
//			.formLogin();
			.httpBasic(Customizer.withDefaults());
		return http.build();
	}
	 

}
