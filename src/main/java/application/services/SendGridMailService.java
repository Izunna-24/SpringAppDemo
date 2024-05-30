package application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SendGridMailService implements MailService{
//field dependency injection
//@Autowired
    private  HelloService helloService;

    //constructor dependency injection
    @Autowired
    public SendGridMailService(HelloService helloService){
        System.out.println(("creating hello service"));
        this.helloService = helloService;
    }

    //setters dependency injection
    //@Autowired
    private void setHelloService(HelloService helloService){
        this.helloService = helloService;
    }

    @Override
    public void sendMailto(String email) {
        helloService.sayHello(email);
        System.out.println("mail sent to "+email+ " using sendgrid");
    }
}
