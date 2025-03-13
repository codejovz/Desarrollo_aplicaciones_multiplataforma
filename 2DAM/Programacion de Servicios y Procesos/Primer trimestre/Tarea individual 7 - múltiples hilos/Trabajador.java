package lanzaproceso;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Trabajador extends Thread{
	
	private String mensaje;
	private String nombre;
	private int prioridad;
	
	public Trabajador(String nombre, int prioridad, String mensaje){
		this.nombre= nombre;
		this.prioridad=prioridad;
		this.mensaje=mensaje;
	}
	
	public String getNombre(){
		
		return nombre;
	}
	
	public int getPrioridad(){
		
		return prioridad;
	}
	
	public String getMensaje(){

		return mensaje;
	}

	@Override
	public void run() {
		Random r = new Random();
		int pausa = r.nextInt(3000);
		
		String tNombre=Thread.currentThread().getName();
		int tPrioridad=Thread.currentThread().getPriority();
		System.out.println("El trabajador: "+tNombre+"(Prioridad "+tPrioridad+") iniciado");
		
		try {
			Thread.sleep(pausa);
			String mensaje=((Trabajador) Thread.currentThread()).getMensaje();
			System.out.println("Mensaje '"+mensaje+"' procesado.");

		}catch(InterruptedException e) {
			System.err.println(e.getStackTrace());
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Thread.currentThread().setName("Principal");
		List <Trabajador> trabajadores = new ArrayList<>();
		
		String mensajes[]= {
				"1. Hola",
				"2. Azul",
				"3. Arbol",
				"4. Caligrafia",
				"5. App"	
		};
		
		String nombres[]= {
				"(1)Jorge ",
				"(2)Juan ",
				"(3)Jacinto ",
				"(4)Jimeno ",
				"(5)Jose "	
		};
		
		Random r = new Random();
		for( int x=0; x<5; x++) {
			int prioridad= r.nextInt(10)+1;
			trabajadores.add(new Trabajador(nombres[x],prioridad,mensajes[x]));
		}
		
		
		for( Trabajador t : trabajadores) {
			String Nombre= t.getNombre();
			t.setName(Nombre);
			int Prioridad= t.getPrioridad();
			t.setPriority(Prioridad);
			t.start();
		}

		//El hilo principal termina sin esperar a que terminen los trabajadores.
		System.out.println("El hilo " + Thread.currentThread().getName() + " ha finalizado. \n");

	}

}
