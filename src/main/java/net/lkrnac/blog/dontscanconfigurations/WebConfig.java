package net.lkrnac.blog.dontscanconfigurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "net.lkrnac.blog.dontscanconfigurations")
public class WebConfig extends WebMvcConfigurerAdapter {

}
