package accesoFicheros;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerObjetos {
	
	static String path= "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Persona persona;
		File fichero= new File(path+"FichPersona.txt");
		FileInputStream filein = new FileInputStream(fichero);
		
		ObjectInputStream dataIS= new ObjectInputStream(filein);
		
		try {
			//Vamos leyendo objetos del archivo
			while(true) {
				persona = (Persona)dataIS.readObject();
				System.out.println("Hemos leido el nombre: "+persona.getNombre()+" y la edad: "+ persona.getEdad());
			}
			
			
			
		}catch(EOFException eo) {
			System.out.println("Leidos todos los objetos");
		}
		
		dataIS.close();
		
		
		
		
	}

}
