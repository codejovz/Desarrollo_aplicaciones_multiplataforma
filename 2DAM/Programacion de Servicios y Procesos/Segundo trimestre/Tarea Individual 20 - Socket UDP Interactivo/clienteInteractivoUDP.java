package Tema3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


public class clienteInteractivoUDP {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{
		
		DatagramSocket socketCliente = new DatagramSocket();
		
		//DATOS DEL SERVIDOR AL QUE ENVIAR EL MENSAJE
		InetAddress ipServidor = InetAddress.getLocalHost();
		int puerto = 12345;
		
		//INTRODUCIMOS DATOS POR TECLADO
		System.out.println("Introduce el mensaje: ");
		String cadena = sc.nextLine();
		
		byte[] bufferEnvio = new byte[1024];
		bufferEnvio = cadena.getBytes();
		
		
		//ENVIAMOS DATAGRAMA AL SERVIDOR
		DatagramPacket paqueteEnviado = new DatagramPacket(bufferEnvio, cadena.length(), ipServidor, puerto);
		
		socketCliente.send(paqueteEnviado);
		
		//RECIBIMOS DATAGRAMA DEL SERVIDOR
		byte[] bufferRecepcion = new byte[1024];
		DatagramPacket paqueteRecibido = new DatagramPacket(bufferRecepcion, bufferRecepcion.length);
		System.out.println("Eso+perando datagrama...");
		socketCliente.receive(paqueteRecibido);
		
		//OBTENEMOS EL Nº DE CARACTERES
		byte[] bufferDatos = paqueteRecibido.getData();
		int numero = bufferDatos[0];
		System.out.println("Recibo Nº de caracteres que son ==> : " + numero);
		
		socketCliente.close();
		
		
	}
	
}
