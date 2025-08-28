package lanzaproceso;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class LanzaProcesoCapturaSalida {
	public static void main(String[] args) {
		if (args.length <= 0) {
			System.out.println("Debe indicarse un comando a ejecutar.");
			System.exit(1);
		}
		ProcessBuilder pb = new ProcessBuilder(args);
		try {
			Process p = pb.start();
			//usamos un try con recursos para leer la salida del proceso (lo necesitamos porque no lo heredamos del proceso)
				InputStream is = p.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				int codRet = p.waitFor();
				System.out.println("La ejecucion de "+Arrays.toString(args)+ " devuelve "+ codRet + " " +
				(codRet==0 ? "(Ejecucion correcta)" : "(ERROR)"));
				System.out.println("-------------------------------------------------------------");
				System.out.println("El proceso ya terminó y HEMOS GUARDADO su SALIDA");
				System.out.println("-------------------------------------------------------------");
				System.out.println("Mostramos linea a linea la salida guardada del proceso");
				System.out.println("-------------------------------------------------------------");
				String linea = null;
				while( (linea = br.readLine()) != null) {
					System.out.println(linea);
				}
				System.out.println("-------------------------------------------------------------");
				
		}catch(IOException ex) {
			System.err.println("Error durante la ejecucuion del proceso");
			System.err.println("Informacion detallada");
			System.out.println("-------------------------------------------------------------");
			ex.printStackTrace();
			System.out.println("-------------------------------------------------------------");
			System.exit(2);
		}catch(InterruptedException ex2) {
			System.err.println("Proceso interrumpido");
			System.exit(3);
		}
		
	}

}
