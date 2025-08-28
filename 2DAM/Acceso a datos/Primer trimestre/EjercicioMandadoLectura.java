package accesoFicheros;

import java.io.*;

public class EjercicioMandadoLectura {
	
	static String path = "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	
	
	public static void main(String[] args) {
		
		try {
			
			File fichero = new File(path + "numeros.txt");
			FileReader fr = new FileReader(fichero);
			
			int i;
			char[] b = new char[1];
			
			while((i=fr.read(b))!=-1) {
				if(i==10 || i ==13) {
					//continue; 
					break;
				}
				System.out.println(b);
			}fr.close();
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}

}
