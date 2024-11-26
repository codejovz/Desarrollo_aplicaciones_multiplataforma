package accesoFicheros;
//1
import java.io.*;



public class verDir {
	
	public static void main(String[] args) {
		
		System.out.println("Ficheros del directorio actual");
		
		File f = new File("."); //el archivo punto es donde se almacena la lista de los archivos que hay en el directorio
		String[] archivos = f.list();
		
		for (int i=0; i<archivos.length ; i++) {
			
			System.out.println(archivos[i]+" aa"+i);
			
		}
		
		
		System.out.println("Directorio 2");
		File f2 = new File("C:\\Users\\jotaa\\OneDrive\\Escritorio\\ProgramacionSinEditar\\Practica_java_tercer_trimestre\\accesoFicheros");
		
		String[] archivos2 = f2.list();
		
		for (int i=0; i<archivos2.length ; i++) {
			
			System.out.println(archivos2[i]);
			
		}
		
		
		System.out.println("Directorio anterior");
		File f3 = new File("././");
		
		String[] archivos3 = f2.list();
		
		for (int i=0; i<archivos3.length ; i++) {
			
			System.out.println(archivos2[i]);
			
		}
		
		
		
		
		
	}

}
