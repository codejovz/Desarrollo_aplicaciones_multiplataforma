package Tema3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class servidorInteractivoUDP {
	//ASOCIO EL SOCKET AL PUERT 12345
	private static final int PUERTO_SERVIDOR = 12345;
	
	public static void main(String[] args) throws Exception{
		
		DatagramSocket socketServidor = new DatagramSocket(PUERTO_SERVIDOR);
		
		//ESPERANDO DATAGRAMA DEL CLIENTE
		System.out.println("Esperando datagrama.... ");
		DatagramPacket paqueteRecibido;
		byte[] bufferReception = new byte[1024]; //buffer para recibir el datagrama
		paqueteRecibido = new DatagramPacket(bufferReception, bufferReception.length);
		socketServidor.receive(paqueteRecibido); //RECIBIMOS DATAGRAMA
		
		String mensaje = new String(paqueteRecibido.getData(), 0, paqueteRecibido.getLength()).trim();
 
		System.out.println("Servidor recibe: " + mensaje);
		
		
		//CONTAMOS NUMERO DE LETRAS a
		int contA = 0;
		for (int i = 0; i < mensaje.length(); i++) {
			if(Character.toLowerCase(mensaje.charAt(i)) == 'a') {
				contA++;
			}
		}
		
		//DATOS DEL CLIENTE
		InetAddress ipCliente = paqueteRecibido.getAddress();
		int puertoCliente = paqueteRecibido.getPort();
		
		//ENVIAMOS RESPUESTA AL CLIENTE
		System.out.println("Enviado contador de letra 'a' : " + contA);
		byte b = (byte) contA;  //Codificamos el numero para poder enviarlo
		byte[] bufferEnvio = new byte[1024]; //Buffer para enviar el datagrama
		bufferEnvio[0] = b;
		
		DatagramPacket paqueteEnvio = new DatagramPacket(bufferEnvio, bufferEnvio.length, ipCliente, puertoCliente);
		socketServidor.send(paqueteEnvio);
		
		//CERRAMOS EL SOCKET
		System.out.println("Cerrando la conexion...");
		socketServidor.close();
		
	}

}




















