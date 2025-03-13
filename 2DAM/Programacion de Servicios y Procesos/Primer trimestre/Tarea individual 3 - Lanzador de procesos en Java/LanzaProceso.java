package lanzaproceso;
import java.util.Arrays;
import java.io.IOException;
public class LanzaProceso {
	public static void main(String[] args) {
		if(args.length <= 0) {
			System.out.println("Debe indicarse un comando a ejecutar");
			System.exit(1);
		}
		ProcessBuilder pb = new ProcessBuilder(args);
		pb.inheritIO();
		
		try {
			Process p = pb.start();
			int codRet = p.waitFor();
			System.out.println("La ejecucion de " + Arrays.toString(args) + " devuelve " + codRet + " " +
			(codRet==0 ? "(ejecucion correcta)" : "(ERROR)") );
		}catch(IOException e) {
			System.err.println("Error durante el proceso.");
			System.err.println("Información detallada");
			System.err.println("-----------------------");
			e.printStackTrace();
			System.err.println("-----------------------");
			System.exit(2);
		}catch(InterruptedException e) {
			System.err.println("Proceso interrumpido");
			System.exit(3);
		}
	}
}