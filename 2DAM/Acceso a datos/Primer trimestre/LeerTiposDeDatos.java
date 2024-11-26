
package accesoFicheros;

import java.io.*;

public class LeerTiposDeDatos {
	
	static String path= "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	public static void main(String[] args) {
		
		try {
			
			FileInputStream filein= new FileInputStream(path+"MVSGE.txt");  //Claswe para grabar datos de un tipo concreto
			DataInputStream dataIn = new DataInputStream (filein);
			String cadenaLeida;
			int enteroLeido;
			
			try {
				
				while(true) {
					cadenaLeida=dataIn.readUTF();
					enteroLeido=dataIn.readInt();
					System.out.println("Leida la cadena: "+cadenaLeida+". Edad: "+enteroLeido);
				}
				
			}catch(IOException ex) {
				
			}dataIn.close();filein.close();

		}catch(IOException ex){
			ex.printStackTrace();
		}
		

	}

}
