package Tema4.serviciosRed;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

import org.apache.commons.net.ftp.*;

public class ClienteFTPLocal {
	
	public static void main(String[] args) throws UnknownHostException, Exception{
		
		FTPClient cliente = new FTPClient();
		String servFTP = "localhost"; //127.0.0.1 servidor FTP
		int puerto = 21;  //14148
		System.out.println("Conectando a " + servFTP + ":" + puerto);
		String usuario = "jotaa@localhost";
		String clave = "9105";
		
		try {
			
			cliente.connect(servFTP,puerto);
			cliente.enterLocalPassiveMode();
			
			boolean login = cliente.login(usuario, clave);
			
			
			if(login) {
				
				System.out.println("Login correcto......");
				
				
			} else {
				
				System.out.println("Login incorrecto......");
				int replyCode = cliente.getReplyCode();
				System.out.println("Código de respuesta: " + replyCode);
				System.out.println("Mensaje de respuesta: " + cliente.getReplyString());

				cliente.disconnect();
				System.exit(1);
			}
			
			//cambiamos de directorio
			cliente.changeWorkingDirectory("/nuevodirec");
			
			System.out.println("Directorio actual: " + cliente.printWorkingDirectory());
			
			FTPFile[] files = cliente.listFiles();
			String[] tipos = {"Fichero","Directorio","Enlace simbolico"};
			
			if(files.length!=0) {
				for (int x = 0; x < files.length; ++x ) {
					System.out.println("\t" + files[x].getName() + " => " + tipos[files[x].getType()]);
				}
			} else {
				System.out.println("No hay ficheros en este directorio.");
			}
			
			
			boolean clienteDesconectado = cliente.logout();
			
			if(clienteDesconectado) {
				System.out.println("Logout exitoso.");
			}else {
				System.out.println("Hubo un error en el Logout");
			}
			
			
			cliente.disconnect();
			
			if(!(cliente.isConnected())){
				System.out.println("Servidor desconectado");
			}else {
				System.out.println("Error al desconectar del servidor");
			}
			
		}catch(SocketException se) {
			System.out.print("Error en la conexion: ");
			se.printStackTrace();
			
		}catch(IOException e) {
			System.out.print("Error con los archivos: ");
			e.printStackTrace();
		}
	}
}
