package Tema4.correo;

import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.MimeBodyPart;


public class EjemploPOP3 {
	
	private static final String HOST = "pop.gmail.com";
	private static final String USERNAME = "jotaaloud@gmail.com";
	private static final String PASSWORD = "yknu xvhc uczi uswn";
	//Aqui personalizo una carpeta destino
	private static final String CARPETA_DESTINO = "C:\\Users\\jotaa\\Desktop\\Programación de Servicios y Procesos\\Correos";
	
	
	
	public static void main(String[] args) throws MessagingException, IOException{
		//ReceiveMailPOP3.dois();
		Folder carpeta = null;
		Store store = null;
		
		try {
			Properties props = new Properties();
			//Google usa POP3S (SEGURO)
			props.put("mail.store.protocol", "pop3s");
			//Uso de TLS 1.2
			props.put("mail.pop3s.ssl.protocols", "TLSv1.2 TLSv1.3");  
			props.put("mail.pop3s.ssl.enable", "true"); 

			//Clase que representa una sesion de correo
			//Encapsula la configuracion y propiedades necesarias para conectarse a un servidor de correo
			Session session = Session.getDefaultInstance(props);
			//La clase store proporciona metodos para conectarse, desconectarse y acceder a buzones de un servidor de correo
			store = session.getStore();
			store.connect(HOST, USERNAME, PASSWORD);
			System.out.println("---------------------------[CONEXION ABIERTA]--------------------------");
			//Obtenemos todo el contenido del buzon de entrada
			carpeta = store.getDefaultFolder().getFolder("INBOX");
			carpeta.open(Folder.READ_ONLY);
			//Obtenemos los mensajes del buzon de entrada
			Message[] mensajes = carpeta.getMessages();
			System.out.println("Numero de mensajes: " + carpeta.getMessageCount());
			System.out.println("Numero de mensajes no leidos: " + carpeta.getUnreadMessageCount());
			//Recorremos todos los mensajes
			for (int i = 0; i< 3; ++i) {  //for (int i = 0; i<mensajes.length; ++i) {
				
				System.out.println("MENSAJE #" + (i + 1) + ":");
				Message mensaje = mensajes[i];
				
				String remitente = "Desconocido";
				//Si el mensaje es de respuesta cogemos el primero para nuestro remitente
				if(mensaje.getReplyTo().length >= 1) {
					remitente = mensaje.getFrom()[0].toString();
				}
				//Si no, cogemos el primer remitente de la lista de remitentes
				else if(mensaje.getFrom().length>=1) {
					remitente = mensaje.getFrom()[0].toString();
				}
				
				//Obtenemos el asunto del mensaje
				String asunto = mensaje.getSubject();
				System.out.println("Guardando... " + asunto + " " + remitente);
				//Eliminamos caracteres especiales---------------------------------------------------------------------------
				asunto.replaceAll("[\\\\/:*?\"<>| ]", "_").trim();
				String nombreFichero = CARPETA_DESTINO + "\\"+ i;
				System.out.println("Nombre del archivo: " + nombreFichero);
				//Guardamos el archivo en nuestra carpeta
				guardaEnFichero(mensaje.getContent(), nombreFichero);

			}
		}finally {
			//Cerramos los objetos 
			if(carpeta != null) {
				carpeta.close(true);  }
			
			if(store!=null) {store.close(); }
			System.out.println("--------------------[SESION CERRADA, SERVIDOR DESCONECTADO]--------------------");
		}
		
	}
	
	public static void guardaEnFichero(Object contenido, String nombreFichero) throws IOException, MessagingException {
		
		OutputStream flujoSalida = null;
		InputStream flujoEntrada = null;
		
		try {
			
			if(contenido instanceof Multipart) {
				//Hacemos un cast para obtener las diferentes partes del email
				Multipart multi = ((Multipart)contenido);
				int parts = multi.getCount();
				
				//Recorremos todas las partes del email
				for(int i=0; i < parts; ++i) {
					
					//Sacamos una parte del email
					MimeBodyPart parte = (MimeBodyPart)multi.getBodyPart(i);
					//Si esta parte tiene mas partes hacemos una recursion
					if(parte.getContent() instanceof Multipart) {
						guardaEnFichero(parte.getContent(), nombreFichero);
						
					}else {
						// Si no tiene mas partes
						String extension = "";
						//Fijamos la extension del fichero segun el tipo de la parte
						if(parte.isMimeType("text/html")) {
							extension = "html";
						}else if(parte.isMimeType("text/plain")) {
							extension="txt";
						}else { //Si no sabemos el tipo intentamos obtener la extension del nombre
							
							if (parte.getDataHandler() != null) {
							    extension = parte.getDataHandler().getName();
							}

						}
						//Añadimos la extension al fichero
						nombreFichero = nombreFichero + "." +extension;
						System.out.println("... " + nombreFichero);
						flujoSalida = new FileOutputStream(new File(nombreFichero));
						// Sacamos todo el contenido de la parte del mensaje
						flujoEntrada = parte.getInputStream();
						// Leemos el contenido de la parte byte a byte y lo escribimos en el fichero
						int j;
						while ((j = flujoEntrada.read()) != -1) {
							flujoSalida.write(j);
						}
					} //else
				}  //for
			}   // if
			
		}finally {  //cerramos los objetos
			
			if(flujoEntrada!=null) {flujoEntrada.close(); }
			if(flujoSalida !=null) {flujoSalida.close(); }
			
		}
			
	}

}
