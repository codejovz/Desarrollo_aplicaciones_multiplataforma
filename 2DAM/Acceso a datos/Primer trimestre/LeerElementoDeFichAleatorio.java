package accesoFicheros;
import java.io.IOException;
import java.io.EOFException;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerElementoDeFichAleatorio {
	static String path= "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	public static void main(String[] args) throws IOException{
		
		File fichero = new File(path + "MVSGE.txt");
		RandomAccessFile file = new RandomAccessFile(fichero, "r");    //Hacer lo mismo pero con busqueda por apellido //Leer el fichero con 10 numeros
		
		Scanner in = new Scanner(System.in);
		int id;
		while(true) {
			try {
				System.out.print("Introduce el numero del empleado a ver: ");
				id= in.nextInt();
				
				int dep, posicion;
				Double salario;
				char apellido[] = new char[10];
				
				posicion= (id-1)*36;   //36+4 para el apellido
				
				file.seek(posicion);
				id=file.readInt();
				
				for(int i=0; i<apellido.length;i++) {
					apellido[i]= file.readChar();
				}
				String apellidoS= new String(apellido);
				dep=file.readInt();
				salario= file.readDouble();
				
				System.out.println("Id empleado: "+id+" - Apellido:  "+apellidoS+" - Depto: "+dep+" - Salario: "+salario);
				
			}catch(InputMismatchException e) {
				System.out.println("Eso no es un numero de empleado");
				in.next();
			}catch(EOFException e) {
				System.out.println("No hay tantos empleados.");
			}

		}		
	}

}
