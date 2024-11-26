package accesoFicheros;

import java.io.*;


public class LeerLineaALinea {

	public static void main(String[] args) {
		
		
		try {
			
			File file1= new File("C:\\Users\\jotaa\\OneDrive\\Escritorio\\ProgramacionSinEditar\\Practica_java_tercer_trimestre\\accesoFicheros\\src\\accesoFicheros\\LeerLineaALinea.java"); 
			FileReader fr= new FileReader(file1);
			BufferedReader br= new BufferedReader(fr);
			
			String line= br.readLine();
			
			
			while(line != null) {
				System.out.println(line);
				line=br.readLine();
				}br.close();fr.close();
			
		}catch(FileNotFoundException ex1) {

			System.out.println("Archivo no encontrado");	
		}catch(IOException  ex2) {
			ex2.printStackTrace();
		}
		
		
		
		

	}

}
