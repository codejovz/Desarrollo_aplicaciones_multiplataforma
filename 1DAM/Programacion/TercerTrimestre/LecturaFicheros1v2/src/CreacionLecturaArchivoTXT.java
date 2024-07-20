import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CreacionLecturaArchivoTXT {
	
	public static void main(String[]args) throws IOException{
		
		FileWriter fw = new FileWriter(new File("datos.txt"));
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Linea 1");
		bw.newLine();
		bw.write("Linea 2");
		bw.close();
		fw.close();
		
		FileReader fr = new FileReader(new File("datos.txt"));
		BufferedReader br = new BufferedReader(fr);
		String linea = br.readLine();
		
		while (linea != null) {
			System.out.println(linea);
			linea = br.readLine();
		}
		
		
		
	}

}
