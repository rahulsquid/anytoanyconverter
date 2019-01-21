package com.ts.a2converter.app;

import com.ts.a2converter.dto.QueryDetails;
import com.ts.a2converter.dto.User;
import com.ts.a2converter.service.ConverterService;
import com.ts.a2converter.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import java.util.UUID;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.ts"})
public class A2ConverterApp extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(A2ConverterApp.class, args);
    }


    ConverterService<QueryDetails> converterService= (t)->
        new QueryDetails(UUID.randomUUID().toString(),"Hello");
    ;

    UserService userService= (title,name,dob)->
         new User(UUID.randomUUID().toString(),title,name,dob);

    @Bean
    @Qualifier("converterService")
    ConverterService<QueryDetails> converterService(){
       return converterService;
    }

    @Bean
    @Qualifier("userService")
   public UserService userService(){
        return userService;
    }


    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/graphiql").setViewName(
                "forward:/graphiql/index.html");
    }

}