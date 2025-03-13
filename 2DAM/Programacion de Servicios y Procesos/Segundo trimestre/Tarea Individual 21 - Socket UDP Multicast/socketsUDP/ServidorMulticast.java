package Tema3.socketsUDP;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;


public class ServidorMulticast {
	
	//IP multicast
	private static final String IPMULTICAST = "224.0.0.1";

	//Puerto servidor multicast
	private static final int PUERTO = 12345;
	//Mensaje para finalizar
	private static final String FIN = "adios";
	//FLUJO PARA ENTRADA ESTANDAR
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{
		
		System.out.println("INICIO SERVIDOR MULTICAST..............");
		//Se crea el socket multicast
		MulticastSocket socketMulticast = new MulticastSocket(PUERTO);
		InetAddress ipMulticast = InetAddress.getByName(IPMULTICAST);
		
		String cadena = "";
		while(!cadena.trim().equals(FIN)) {
			System.out.println("Datos a enviar al grupo: ");
			cadena = sc.nextLine();
			//pREPARAMOS EL DATAGRAMA PARA EL GRUPO
			DatagramPacket paquete = new DatagramPacket(cadena.getBytes(), cadena.length(), ipMulticast, PUERTO);
			//ENVIAMOS AL GRUPO
			socketMulticast.send(paquete);
		}
		
		socketMulticast.close();
		System.out.println("FIN DEL SERVIDOR MULTICAST...........................");
		
		
	}

}
