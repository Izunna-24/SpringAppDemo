package application.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
public class MailGunMailService implements MailService{


    @Override
    public void sendMailto(String email) {
        System.out.println("mail sent to " +email + "using mailgun");
    }
}
