package accesoFicheros;

import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;

public class LeerFicheroAleatorio {
	static String path= "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	public static void main(String[] args) throws IOException{
		
		File fichero = new File(path + "MVSGE.txt");
		RandomAccessFile file = new RandomAccessFile(fichero, "r");
		
		int id, dep, posicion;
		Double salario;
		char apellido[]= new char[10];
		
		posicion = 0;
		// ID(Int, 4 bytes) - APELLIDO (char, 10x2 bytes) - DEP(Int, 4 bytes) - SALARIO (double, 8 bytes) 
		while(true) {
			file.seek(posicion);  //Coloca la lectura en esta posicion
			id=file.readInt();
			for(int i=0; i<apellido.length; i++) {
				apellido[i] = file.readChar();
			}
			String apellidoS = new String(apellido);
			dep = file.readInt();
			salario = file.readDouble();                                 //trim() sirve para quitar los espacios en blanco
			System.out.println("ID empleado: "+ id + " - Apellido: "+apellidoS.trim()+" - Depto: "+dep+ " - Salario: "+salario );
			posicion= posicion + 36;  // 36 es la suma de posiciones de todo. si has puesto un espacio de mas te lo lee mal
			if(file.getFilePointer() == file.length()){
				break;
				}
			
		}
		

	}

}
