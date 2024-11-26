package accesoFicheros;
import java.io.*;
import java.io.File;
import java.util.Scanner;

public class LeerResgistro {
	static String path= "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	public static void main(String[] args) throws FileNotFoundException,IOException{
		
		File fichero = new File(path + "MVSGE.txt");
		RandomAccessFile file = new RandomAccessFile(fichero, "r");
		
		Scanner in = new Scanner(System.in);
		
		int id;
		
		while(true) {
			
			try {
				System.out.println();
				id= in.nextInt();
				
				int dep, posicion;
				
				
			}catch() {
				
			}
			
			
			
		}
		
		

	}

}
