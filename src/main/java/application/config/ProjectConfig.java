package application.config;


import application.services.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.math.BigDecimal;

@Configuration
@ComponentScan(basePackages = "application")
public class ProjectConfig {

    @Bean
    @Primary
    public HelloService helloService(){
        //System.out.println(("HelloService Bean in context -->" + helloService));
        return new HelloService();
    }

    @Bean
    public BigDecimal bigDecimal(){
        return new BigDecimal(200);
    }
}
