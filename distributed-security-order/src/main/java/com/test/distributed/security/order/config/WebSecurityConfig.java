package com.test.distributed.security.order.config;

import com.test.distributed.security.order.handle.SimpleAccessDeniedHandler;
import com.test.distributed.security.order.handle.SimpleAuthenticationEntryPoint;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    //安全拦截机制（最重要）
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//       http.csrf().disable()
//                .exceptionHandling().accessDeniedHandler(new SimpleAccessDeniedHandler()).authenticationEntryPoint(new SimpleAuthenticationEntryPoint())
//                .and()
//                .authorizeRequests()
//                .antMatchers("/order/**").authenticated()//所有/r/**的请求必须认证通过
//                .anyRequest().permitAll()//除了/r/**，其它的请求可以访问
//       ;
    }
}