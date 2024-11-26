package accesoFicheros;

import java.io.*;

public class EscribirDatos {
	
	static String path="C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fileout= new FileOutputStream(path+"prueba1.txt");  //Claswe para grabar datos de un tipo concreto
			DataOutputStream fileOS = new DataOutputStream (fileout);
			String nombres[]= {"Pedro", "Carlos", "Lola", "Andres"};
			int edades[] = {15,18,23,45};
			
			for(int i=0; i<nombres.length; i++) {
				
				fileOS.writeUTF(nombres[i]);
                fileOS.writeInt(edades[i]);
				
				
			}fileOS.close();fileout.close();
			System.out.println("hecho");
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
		

	}

}
