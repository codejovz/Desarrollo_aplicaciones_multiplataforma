package Tema3.socketsUDP;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;


public class ClienteMulticast {
	
	//IP Multicast
	private static final String IPMULTICAST = "224.0.0.1";

	//Puerto servidor multicast
	private static final int PUERTO = 12345;
	//Puerto servidor multicast
	private static final String FIN = "adios";
	
	public static void main(String[] args) throws Exception {
		System.out.println("INICIO CLIENTE MULTICAST.......");
		InetAddress ipGrupo = InetAddress.getByName(IPMULTICAST);
		
		//Se crea el socket Multicast
		MulticastSocket socketMulticast = new MulticastSocket(PUERTO);
		
		//Nos unimos al grupo
		//socketMulticast.joinGroup(ipGrupo); --> Obsoleto
		socketMulticast.joinGroup(new InetSocketAddress(ipGrupo, PUERTO), NetworkInterface.getByInetAddress(InetAddress.getLocalHost()));
		
		String mensaje = "";
		while (!mensaje.trim().equals(FIN)) {
			byte[] buffer = new byte[1000];
			//Recibe el paquete del servidor Multicast
			DatagramPacket paquete = new DatagramPacket(buffer, buffer.length);
			socketMulticast.receive(paquete);;
			
			mensaje = new String(paquete.getData(), 0, paquete.getLength());
			System.out.println("Recibo: " + mensaje.trim());

		}
		
		//socketMulticast.leaveGroup(ipGrupo);  --> Obsoleto
		socketMulticast.leaveGroup(new InetSocketAddress(ipGrupo, PUERTO), NetworkInterface.getByInetAddress(InetAddress.getLocalHost()));
		socketMulticast.close();
		System.out.println("FIN DEL CLIENTE MULTICAST...............");
		
	}	

}
