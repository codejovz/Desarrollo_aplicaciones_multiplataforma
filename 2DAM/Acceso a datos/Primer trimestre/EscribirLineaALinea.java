package accesoFicheros;

import java.io.*;


public class EscribirLineaALinea {

	public static void main(String[] args) {
		
		int cont =0;
		String path = "C:\\Users\\jotaa\\OneDrive\\Escritorio\\ProgramacionSinEditar\\Practica_java_tercer_trimestre\\";
		try {
			
			File file1= new File(path+"EscribirLineaAlinea.txt"); 
			FileWriter fw= new FileWriter(path+"EscribirLineaAlinea.txt");
			BufferedWriter bw= new BufferedWriter(fw);
			//PrintWriter pw = new PrintWriter(fw);
			
			
			
			for(int x = 0; x<10; x++) {
				bw.write("linea "+cont);
				bw.newLine();
				cont = cont+1;
			}fw.close();bw.close();
			System.out.println("Fichero creado");
			
		}catch(FileNotFoundException ex1) {

			System.out.println("Archivo no encontrado");	
		}catch(IOException  ex2) {
			ex2.printStackTrace();
		}
		
		
		
		

	}

}