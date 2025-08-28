package accesoFicheros;

import java.io.*;

public class EscribirFichBytes {
	static String path = ".//";
	public static void main(String[] args) {
		
		try {
			
			
			
			File fichero = new File(path + "FicheroBinario.dat");
			
			//Creamos el flujo de salida
			FileOutputStream fileout = new FileOutputStream(fichero);
			
			//Creamos el flujo de entrada
			FileInputStream filein = new FileInputStream(fichero);
			//escriben y leen byte a byte
			int i;
			
			for (i = 0; i<100; i++) {
				fileout.write(i);
			}fileout.close();
			
			
			//Ver los datos que hemops grabado
			while((i = filein.read())!= -1) {
				System.out.println("Esta es la fila: "+i);
			}
			
			filein.close();
			fileout.close();
			
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex2){
			ex2.printStackTrace();
		}
		
		
		
		
		

		

	}

}
