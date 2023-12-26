package TwiterTask.TwiterTask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public HeaderBasedAuthenticationFilter headerBasedAuthenticationFilter() {
        return new HeaderBasedAuthenticationFilter();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .addFilterBefore(headerBasedAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
            .authorizeRequests()
                .antMatchers("/api/search-tweet-user").authenticated()
                .antMatchers("/api/get-tweets").authenticated()
                
                .anyRequest().permitAll();
                
    }
}
