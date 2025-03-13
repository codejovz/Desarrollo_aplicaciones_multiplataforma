package lanzaproceso;

public class BlocDeNotas {
	
	public static void main(String[]args) {
		
		try {
			
			// creo string de 2 strings
			String[] cmdArray = new String[2];
			
			//el primer string es el comando para ejecutar el bloc de notas
			cmdArray[0] = "notepad.exe";
			
			//el segundo string es el nombre del fichero que queremos abrir con el bloc de notas:
			cmdArray[1] = "ejemplo.txt";
			
			//Muestro un mensaje
			System.out.println("Creando proceso para ejecutar notepad.exe en Windows...");
			
			//Creo el proceso y una sesión
			Process process = Runtime.getRuntime().exec(cmdArray,null);
			
			//Muestro otro mensaje
			System.out.println("ejemplo.txt deberia de abrirse");
			
			System.out.println("Objeto clase process: "+process);

		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}


