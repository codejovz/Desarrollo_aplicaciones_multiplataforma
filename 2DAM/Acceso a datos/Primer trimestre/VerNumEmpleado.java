package accesoFicheros;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VerNumEmpleado {
	static String path= "C:\\Users\\jotaa\\OneDrive\\Escritorio\\";
	public static void main(String[] args) throws IOException {
		File fichero = new File(path + "MVSGE.txt");
		RandomAccessFile file = new RandomAccessFile(fichero, "r");
		Scanner in = new Scanner(System.in);
		
		while(true) {
			try {
				int id=1;
				System.out.print("Introduce el apellido del nempleado q quieres ver su id: ");
				String apellidoLeido=in.next();
				apellidoLeido.trim();
				int dep, posicion;
				
				Double salario;
				char apellido[]= new char[10];
				
				while(true) {
					
					posicion=(id-1)*36;  //estructura 4int, 10(x2)char, 4int, 8double
					file.seek(posicion+4);
					for(int i =0; i<apellido.length;i++) {
						apellido[i]=file.readChar();
					}
					
					String apellidoEnFichero="".valueOf(apellido).trim();
					System.out.println("Apellido leido: "+apellidoLeido);
					System.out.println("Apellido en disco: "+apellidoEnFichero);
					
					if(apellidoLeido.equals(apellidoEnFichero)) {
						System.out.println("El numero del empleado "+apellidoLeido+" es "+id);
						id=0;
						break;
					}else {
						id++;
						continue;
					}
								
				}

			}catch(InputMismatchException e) {
				System.out.println("Eso no es un apellido de empleado");
				in.next();
			}catch(EOFException e) {
				System.out.println("No hay tantos empleados.");
			}
		}
				

	}

}
