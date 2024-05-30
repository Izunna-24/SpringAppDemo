package application.config;


import application.services.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.math.BigDecimal;

@Configuration
//@ComponentScan(basePackages = "application")
public class ProjectConfig {

    @Bean
    @Primary
    public HelloService helloService1(){
        HelloService helloService = new HelloService();
        //System.out.println(("HelloService Bean in context -->" + helloService));
        return helloService;
    }

    @Bean
    public HelloService helloService2(){
        return new HelloService();
    }
}
