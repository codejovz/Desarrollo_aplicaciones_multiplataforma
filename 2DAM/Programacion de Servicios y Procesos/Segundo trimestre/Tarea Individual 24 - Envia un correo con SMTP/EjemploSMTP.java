package Tema4.correo;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;
import javax.mail.Transport;


public class EjemploSMTP {
	
	
	public static void main(String [] args) {
		//VALORES destinatario, asunto y cuerpo
		String destinatario = "jotaaloud@gmail.com";
		String asunto = "Correo de prueba enviado desde Java";
		String cuerpo= "Esta es una prueba de correo...";
		//Envio de correo
		enviarConGmail(destinatario, asunto, cuerpo);
		System.out.println("Correo enviado!");
		

	}
	
	private static void enviarConGmail(String destinatario, String asunto, String cuerpo) {
		
		//Direccion de correo de envio
		String remitente = "jotaaloud@gmail.com";
		String claveemail = "yknu xvhc uczi uswn";
		Properties props = System.getProperties();
		
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.user", remitente);
		props.put("mail.smtp.password", claveemail);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.port", "465");
		//Uso de TLS 1.2
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");
		
		Session session = Session.getDefaultInstance(props);
		MimeMessage message = new MimeMessage(session);
		
		try {
			
			message.setFrom(new InternetAddress(remitente));
			//Se podrian añadir varios de la misma manera
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
			message.setSubject(asunto);
			message.setText(cuerpo);
			Transport transport = session.getTransport("smtp");
			transport.connect("smtp.gmail.com", remitente, claveemail);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
			
			
			
		}catch(AuthenticationFailedException af) {
			System.out.println("Error al hacer login");
			
		}catch(MessagingException me) {
			me.printStackTrace(); //Si produce un error
		}
		
	}

}
