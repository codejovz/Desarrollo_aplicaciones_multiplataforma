package practicaExamenColaboracion1;

import java.util.Scanner;

public class Socio {
	
	protected Scanner teclado;
	protected String nombre;
	protected int antiguedad;
	
	public Socio() {
		
		teclado= new Scanner(System.in);
		
	}
	
	void cargarDatos() {
		
		System.out.println("Introduce el nombre del socio: ");
		nombre=teclado.next();
		System.out.println("Introduce su antiguedad en el club: ");
		antiguedad= teclado.nextInt();
	}
	
	
	public int retornarAntiguedad() {
		
		return antiguedad;
	}

}
