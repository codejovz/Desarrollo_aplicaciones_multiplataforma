
package accesoFicheros;
//3
import java.io.*;

public class crearDir {

	public static void main(String[] args) {
		
		String path= ".\\src\\accesoFicheros\\";
		
		File actual = new File(".");
		if (actual.exists()) {
			System.out.println(actual.getAbsolutePath());
		}
		
		File d= new File(path + "NUEVODIR");
		File file1= new File(path + "NUEVODIR\\FICHERO1.txt");
		File file2= new File(path + "\\NUEVODIR\\FICHERO2.txt");
		
		d.mkdir();
		System.out.println("Directorio NUEVODIR creado");
		
		try  {
			file1.createNewFile();
			System.out.println("directorio y archivo 1 creado");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		file1.renameTo(new File(d, "NUEVOARCHIVO1"));
		
		try {
			
			File f3 = new File (path + "NUEVODIR\\FICHERO3.txt");
			f3.createNewFile();
			f3.renameTo(new File("NUEVOARCHIVO3.txt"));
			System.out.println("Archivo 3 creado y nombre cambiado.");
			f3.delete();
			System.out.println("archivo 3 borrado");
			
		}catch(Exception ex2) {
			ex2.printStackTrace();
		}
		
	}

}
