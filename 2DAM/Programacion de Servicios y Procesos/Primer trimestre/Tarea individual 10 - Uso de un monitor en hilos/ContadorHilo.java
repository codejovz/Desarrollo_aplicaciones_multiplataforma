package lanzaproceso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContadorHilo extends Thread{//Deberá extender de Thread
	
	 ControlSuspension suspender= new ControlSuspension();
		
	boolean stopHilo = false;
	int contador = 0;
	public static int franja;
	

	public void suspende() {
		System.out.println("Hilo suspendido, contador: " + contador);
		suspender.set(true);
	}
	
	public void reanuda() {
		System.out.println("Hilo reanudado, contador: " + contador);
		suspender.set(false);
	}
	
	public void pararHilo() {
		this.reanuda();
		this.stopHilo = true;
	}
	
	public void run() {   //Cuenta los segundos
		while(!stopHilo) {
			try {
				suspender.esperandoParaReanudar();
				contador ++;
				Thread.sleep(1000);
				
				if (contador >= franja) {    //Comprueba si ha llegado al tope, cada segundo
					this.reanuda();
					this.stopHilo = true;
					this.pararHilo();
					System.out.println("Contador final: " + this.contador);
					System.out.println("Fin del MAIN");
					System.exit(0);  //Finaliza el programa exitosamente, sin errores.
				}
				
			}catch(InterruptedException e) {
				System.out.println("Excepcion en run(): "+e.toString());
			}
			
		}
	}
	
	
	
	public static void main(String[] args) throws Exception {
		
		Scanner teclado = new Scanner(System.in);
		
		franja = 0;
		
		System.out.print("Elige un numero del 1 al 100: ");
		

		while (!(franja <= 100) || !(franja >= 1)) {   //Controla que sea un entero, entre el 1 y el 100
			try {
				
				 franja = teclado.nextInt();
				
				if(franja < 1 || franja >100) {
					System.out.println("No has metido un numero entre el 1 y el 100.\n Prueba otra vez:");
					//teclado.next();
				}
				
			}catch(InputMismatchException ime) {
				System.out.println("No has metido un numero.\nPrueba otra vez: ");
				teclado.next();
			}
		}
		
		ContadorHilo h = new ContadorHilo();
		h.start();
		
		System.out.print("[S]suspender | [R]reanudar | [T]terminar:");
		String opcion = teclado.next().toUpperCase();  //funciona aunque se meta en minusculas
		
		while(!(opcion.equals("T"))) {
			
			if(opcion.equals("S")) {
				h.suspende();
			}else if(opcion.equals("R")) {
				h.reanuda();
			}
			System.out.print("[S]suspender | [R]reanudar | [T]terminar:");
			opcion = teclado.next().toUpperCase();
			
		}
		
		teclado.close();
		
		h.pararHilo();
		
		System.out.println("Contador final: " + h.contador);
		System.out.println("Fin del MAIN");
		
	}
	

}
