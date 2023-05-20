package cleaningCarpet;

import javax.mail.PasswordAuthentication;

public class SMTPAuthenticator extends javax.mail.Authenticator {
    public PasswordAuthentication getPasswordAuthentication() {
    	   String user="apikey";
    	   String password="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";
       return new PasswordAuthentication(user, password);
    }
}