package accesoFicheros;

import java.io.*;
//4


public class leerFichTexto {

	public static void main(String[] args) {
		
		try {
			
			File fichero = new File("C:\\Users\\jotaa\\OneDrive\\Escritorio\\MVSGE.txt");
			
			FileReader fitch = new FileReader(fichero);
			
			int i ;
			
			//while((i.fich))  //Version lectura caractrer a caracter
			
			
			
			
			
			
			
			char b[] = new char[30];   //Version con lecttura por buffer
			
			while((i=fitch.read(b)) != -1){
				
				System.out.println(b);
			}fitch.close();
			
		}catch(IOException ex2) {
			ex2.printStackTrace();
		}

	}

}
