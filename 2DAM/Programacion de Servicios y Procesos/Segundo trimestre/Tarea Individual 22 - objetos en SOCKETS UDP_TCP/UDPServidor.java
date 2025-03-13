package Tema3.objetos;



import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UDPServidor {
	
	private static final int PUERTO = 12345;
	
	public static void main(String[] args) throws Exception{
		
		//buffer para recibir el datagrama
		byte[] buffer = new byte[1024];
		DatagramSocket socket = new DatagramSocket(PUERTO);
		
		//Esperando datagrama
		System.out.println("Esperando datagrama.......");
		DatagramPacket paquete = new DatagramPacket(buffer, buffer.length);
		socket.receive(paquete); //Recibo datagrama
		
		//Convertimos el buffer en un stream ByteArrayInputStream
		ByteArrayInputStream flujoBytes = new ByteArrayInputStream(buffer);
		//Extraemos el stream de objetos del ByteArrayInputStream
		ObjectInputStream flujoObjetos = new ObjectInputStream(flujoBytes);
		
		//Convertimos el datagrama a un objeto Persona
		Persona persona = (Persona) flujoObjetos.readObject();
		System.out.println("Recibido objeto: " + persona.getNombre() + "*" + persona.getEdad());
		
		//Cerramos streams y sockets
		socket.close();
		flujoObjetos.close();
		flujoBytes.close();
		
	}

}
