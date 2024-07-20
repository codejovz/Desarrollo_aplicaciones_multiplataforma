import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreacionLecturaArchivotxt {
	
	public static void main(String[]args) {
		
		try {
			FileWriter fw = new FileWriter(new File("datos.txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Linea 1");
			bw.newLine();
			bw.write("Linea 2");
			bw.close();
			fw.close();
		}catch(IOException ex) {
			System.out.println("Problemas en la creación del archivo.");
		}
		
		
		try {
			FileReader fr = new FileReader(new File("datos.txt"));
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			
		}catch(IOException ex) {
			System.out.println("Error con lectura del archivo.");
			System.out.println(ex.getMessage());
		}

	}
}
