package Tema3;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
	
	private static void pruebaMetodos(InetAddress dir) {
		
		System.out.println("\tMetodo getByName(): " + dir);
		InetAddress dir2;
		
		try {
			
			dir2 = InetAddress.getLocalHost();
			System.out.println("\tMetodo getLocalHost(): " + dir2);
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println("\tMetodo getHostName(): " + dir.getHostName());
		System.out.println("\tMetodo getHostAddress(): " + dir.getHostAddress());
		System.out.println("\tMetodo toString(): " + dir.toString());
		System.out.println("\tMetodo getCanonicalHostName(): " + dir.getCanonicalHostName());
		
		
	}
	
	public static void main(String[] args) {
		
		InetAddress dir = null;
		System.setProperty("http.proxyHost", "192.168.1.30");
		System.setProperty("http.proxyPort", "3128");
		System.setProperty("https.proxyHost", "192.168.1.30");
		System.setProperty("https.proxyPort", "3128");
		
		try {
			
			System.out.println("=======================================================");
			System.out.println("SALIDA PARA LOCALHOST");
			dir = InetAddress.getByName("localhost");
			TestInetAddress.pruebaMetodos(dir);
			
			System.out.println("=======================================================");
			System.out.println("SALIDA PARA UNA URL");
			dir = InetAddress.getByName("www.github.com");
			TestInetAddress.pruebaMetodos(dir);
			
			
			InetAddress[] direcciones = InetAddress.getAllByName(dir.getHostName());
			System.out.println("\tDIRECCIONES IP PARA: " + dir.getHostName());
			
			for(int i = 0; i < direcciones.length; i++) {
				System.out.println("\t\t" + direcciones[i].toString());
			}
			System.out.println("=======================================================");
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}

}