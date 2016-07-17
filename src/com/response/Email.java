package com.response;

/**
 * Created by Mukesh on 17/07/2016.
 */

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Email {

    private static String to;
    private static String from;
    private static String header;
    private static String message;

    final static String username = "qwertify2015@gmail.com";
    final static String password = "qwertifytrain";


    public Email(String to, String from, String emailHeader, String emailMessage){
        Email.to = to;
        Email.from = from;
        Email.header = emailHeader;
        Email.message = emailMessage;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        Email.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        Email.from = from;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        Email.header = header;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        Email.message = message;
    }

    public void main(String [] args){

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable" , "true");
        properties.put("mail.smtp.host" , "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        System.out.println("Properties");

        Session session = Session.getInstance(properties, new Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(username,password);
            }
        });

        System.out.println("Session");

        try{

            MimeMessage sendMessage = new MimeMessage(session);
            sendMessage.setFrom(new InternetAddress(from));
            sendMessage.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));

            sendMessage.setSubject(header);
            sendMessage.setText(message);

            Transport.send(sendMessage);
            System.out.println("Ticket sent successfully!");


        }catch(MessagingException me){
            me.getMessage();
        }

    }
}
