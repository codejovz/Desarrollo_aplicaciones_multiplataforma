import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreacionLecturaArchivoTXT {
	
	public static void main(String[]args) {		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(new File("datos.txt"));
			bw = new BufferedWriter(fw);
			bw.write("Linea 1");
			bw.newLine();
			bw.write("Linea 4");
			bw.close();
			fw.close();
		}catch(IOException ex) {
			System.out.println("Problemas en la creación del archivo.");
		}finally {
			try {
				if(fw != null) {
					fw.close();
				}
				if(bw != null) {
					bw.close();
				}
			}catch(IOException ex){
				System.out.println(ex.getMessage());
			}
		}
		FileReader fr = null;
		BufferedReader br= null;
		
		try {
			fr = new FileReader(new File("datos.txt"));
			br = new BufferedReader(fr);
			String linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		}catch(IOException ex) {
			System.out.println("Error con lectura del archivo.");
			System.out.println(ex.getMessage());
		}finally {

			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
				
			}catch(IOException ex){
				System.out.println(ex.getMessage());
			}
		}
	}
}
