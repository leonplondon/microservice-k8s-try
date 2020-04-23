package pro.darkgod.bar.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
//        http
//            .cors(corsConfigurer -> {
//                CorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//                corsConfigurer.configurationSource(source);
//            })
//            .authorizeRequests(requests -> {
//            })
            /*.formLogin(null)
            .httpBasic(null)
            .headers(headers -> headers.disable());*/
    }
}
