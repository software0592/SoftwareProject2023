package cleaningCarpet;
//File Name SendEmail.java

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import cleaningCarpet.SMTPAuthenticator;
public class Email {

public static void send(String to,String from) {    

   String host = "smtp.sendgrid.net";


   Properties properties = System.getProperties();

   properties.setProperty("mail.smtp.host", host);
   properties.setProperty("mail.transport.protocol", "smtp");
   properties.setProperty("mail.smtp.port", "587");
   properties.setProperty("mail.smtp.auth", "true");
   
   Authenticator auth = new SMTPAuthenticator();
   Session mailSession = Session.getDefaultInstance(properties, auth);
   mailSession.setDebug(false);

   try {
	   Transport transport = mailSession.getTransport();
      MimeMessage message = new MimeMessage(mailSession);

      message.setFrom(new InternetAddress(from));

      message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

      message.setSubject("Order");

      message.setText("Hi Zain, Your Order is complete!");

      Transport.send(message);
      System.out.println("Sent message successfully....");
   } catch (MessagingException mex) {
      mex.printStackTrace();
   }
}

}
