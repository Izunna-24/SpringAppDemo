package application.services;

public class MailGunMailService implements MailService{


    @Override
    public void sendMailto(String email) {
        System.out.println("mail sent to " +email + "using mailgun");
    }
}
