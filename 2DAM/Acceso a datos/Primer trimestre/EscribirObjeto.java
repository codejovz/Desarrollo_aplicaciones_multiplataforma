package accesoFicheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirObjeto {
	static String path= "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	public static void main(String[] args) throws IOException{
		Persona persona;
		File fichero= new File(path+"FichPersona.txt");
		FileOutputStream fileout = new FileOutputStream(fichero);
		
		ObjectOutputStream dataOS = new ObjectOutputStream(fileout);
		String nombres[]= {"Manuel", "Ramon", "Menganito", "Fulanito"};
		int edades[]= {59, 71, 54, 61};
		
		for(int i = 0; i<edades.length; i++) {
			persona = new Persona(nombres[i], edades[i]);
			dataOS.writeObject(persona);
			System.out.println("Grabado el objeto: "+persona.getNombre());
		}
		dataOS.close();
		System.out.println("Hecho");
	}

}
