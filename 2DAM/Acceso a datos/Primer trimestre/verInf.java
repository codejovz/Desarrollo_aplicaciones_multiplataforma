package accesoFicheros;

import java.io.*;

public class verInf {
//2
	public static void main(String[] args) {
		
		//C:\\Users\\jotaa\\OneDrive\\Escritorio\\ProgramacionSinEditar\\Practica_java_tercer_trimestre\\accesoFicheros
		
		String path= ".\\src\\accesoFicheros\\verInf.java";
		
		File f = new File(path);
		
		if(f.exists()) {
			
			System.out.println("Nombre del archivo: "+f.getName());
			System.out.println("Ruta del archivo: "+f.getPath());
			System.out.println("Ruta absoluta: "+f.getAbsolutePath());
			System.out.println("Se puede leer: "+f.canRead());
			System.out.println("Se puede escribir: "+f.canWrite());
			System.out.println("Tamaño del archivo: "+f.length());
			System.out.println("Es un directorio: "+f.isDirectory());
			System.out.println("Es un fichero: "+f.isFile());
			
		}else {
			System.out.println("Archivo no encontrado");
		}

	}

}
