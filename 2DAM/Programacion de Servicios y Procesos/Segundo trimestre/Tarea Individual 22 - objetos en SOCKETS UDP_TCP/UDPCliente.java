package Tema3.objetos;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPCliente {
	
	public static void main(String[] args) throws Exception{
		
		InetAddress destino = null;
		int puerto = 12345;
		DatagramSocket socket = new DatagramSocket();
		destino = InetAddress.getLocalHost();
		
		//Necesitamos un stream de array para obtener un buffer para el paquete
		ByteArrayOutputStream flujoSalida = new ByteArrayOutputStream();
		//Creamos un stream de objetos DENTRO del streamde array de bytes
		ObjectOutputStream flujoObjetos = new ObjectOutputStream(flujoSalida);
		
		//Creamos un objeto Persona
		Persona persona = new Persona("Jorge", 22);
		//Metemos el objeto Persona en el stream de objetos DENTRO del stream de array de bytes
		flujoObjetos.writeObject(persona);
		
		//Obtenemos un buffer para enviar el datagrama del stream de array de bytes
		byte[] buffer = flujoSalida.toByteArray();
		
		//Enviamos datagrama al servidor
		DatagramPacket paqueteEnviado = new DatagramPacket(buffer, buffer.length, destino, puerto);
		socket.send(paqueteEnviado);
		
		//Cerramos streams y sockets
		socket.close();
		flujoObjetos.close();
		flujoSalida.close();
		
	}

}
