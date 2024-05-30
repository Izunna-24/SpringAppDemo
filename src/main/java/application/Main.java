package application;

import application.config.ProjectConfig;
import application.services.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("beans in context: " + Arrays.toString(context.getBeanDefinitionNames()));
        HelloService helloService = context.getBean(HelloService.class);
        helloService.sayHello("Doe");
    }
}
