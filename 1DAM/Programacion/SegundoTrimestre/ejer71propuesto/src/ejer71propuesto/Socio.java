package ejer71propuesto;

import java.util.Scanner;


public class Socio {
	
	private Scanner teclado;
	private String nombre;
	private int antigClub;
	
	
	public Socio() {
		teclado=new Scanner(System.in);
		
		System.out.println("Introduce el nombre del socio: ");
		nombre=teclado.next();
		System.out.println("Introduce la antigüedad en el club: ");
		antigClub=teclado.nextInt();
		
		
	}
	

}
