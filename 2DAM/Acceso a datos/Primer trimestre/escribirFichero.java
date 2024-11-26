package accesoFicheros;

import java.io.*;

public class escribirFichero {
	static String path= "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	public static void main(String[] args) {
		
		try {
			
			File fichero = new File(path + "MVSGE.txt");
			
			FileWriter fich = new FileWriter(fichero);
			
			String cadenaGrabada = "Este es el contenido que voy a grabar2";
			
			char[] cad = cadenaGrabada.toCharArray();
			
			
			
			for(int i = 0; i< cad.length; i++) {
				
				fich.write(cad[i]);
			}
			
			fich.append("*");
			
			fich.close();
			
			
			
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
