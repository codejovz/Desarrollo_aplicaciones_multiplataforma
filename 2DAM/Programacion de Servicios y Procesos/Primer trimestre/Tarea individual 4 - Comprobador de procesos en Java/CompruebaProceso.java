package lanzaproceso;
import java.io.IOException;
import java.util.Arrays;
public class CompruebaProceso {
	public static void main(String[] args) {
		//String[] comando= {"wsl.exe", "./bucle.sh"};
		String[] comando= {"wsl.exe", "./bucle.sh"};
		//chmod +x miscript.sh
		ProcessBuilder pb = new ProcessBuilder(comando);
		pb.inheritIO();
		
		try {
			System.out.println("------------------------------------------------------------------");
			System.out.println("Soy el proceso que ejecuta el programa Java CompruebaProceso. Mi pid en Windows es: " +
			ProcessHandle.current().toString());
			Process p = pb.start();
			System.out.println("Acabo de lanzar el script de Linux bucle.sh cuyo piden Windows es: "+p.pid());
			
			while(p.isAlive()) {
				System.out.println("Soy el proceso en Windows del programa de Java CompruebaProceso - pid: "+ ProcessHandle.current().toString());
				Thread.sleep(3000);  //Esperamos 3 segundos
			}
			int codRet = p.waitFor();
			System.out.println("------------------------------------------------------------------");
			System.out.println("La ejecucion del proceso " + Arrays.toString(comando) + " con pid en Linux " + p.pid() + " devuelve " + codRet +
					" " + (codRet == 0 ? "(Ejecucion correcta" : "(ERROR)"));
		}catch(IOException e) {
			System.err.println("Error durante la ejecucion del proceso.");
		}catch(InterruptedException e2) {
			System.err.println("Proceso interrumpido");
			System.exit(3);
		}
	}

}
