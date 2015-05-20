package com.sandy.blog.config;  
  
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
  
@Configuration 
@ComponentScan("com.sandy.blog") 
@EnableAutoConfiguration
@EnableWebMvc 
@EntityScan("com.sandy.blog.model")
@EnableJpaRepositories("com.sandy.blog.repository")
@PropertySource("classpath:application.properties")
public class AppConfig {  

}  
