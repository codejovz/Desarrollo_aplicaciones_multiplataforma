package accesoFicheros;

import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;

public class EscribirFichAleatorio {
	
	static String path= "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	public static void main(String[] args) throws IOException{
		
		File fichero = new File(path + "MVSGE.txt");
		RandomAccessFile file = new RandomAccessFile(fichero, "rw");
		
		String apellido[] = {"FERNANDEZ","PEREZ","BENITEZ","HERRERO","SANTOS"};
		int dep []= {10,20,30,40,50} ;
		Double salario[]= {1000.45, 1545.0, 25442.01, 145236.12, 452.10};
		
		StringBuffer buffer = null;
		int n = apellido.length;
		for(int i =0; i<n; i++) {
			
			file.writeInt(i+1);
			buffer= new StringBuffer(apellido[i]);
			buffer.setLength(10); //10 chars para el apellido, cada char ocupa 2 bytes
			file.writeChars(buffer.toString());
			file.writeInt(dep[i]);  //
			file.writeDouble(salario[i]);  //
			
		}
		file.close();
		System.out.println("Todo correcto");
	}

}
