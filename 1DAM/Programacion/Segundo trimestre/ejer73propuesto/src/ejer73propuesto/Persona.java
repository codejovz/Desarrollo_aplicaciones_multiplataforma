package ejer73propuesto;

import java.util.Scanner;

public class Persona {
	
	protected String nombre;
	protected int edad;
	protected Scanner teclado;
	
	public Persona(){
		
		teclado=new Scanner(System.in);
		
	}
	
	public void cargar() {
		System.out.println("Introduce el nombre:");
		nombre=teclado.next();
		System.out.println("Introduce su edad: ");
		edad=teclado.nextInt();
	}
	
	public void imprimir() {
		
		System.out.println("Se llama "+nombre+" y tiene "+edad+" años.");
	}
	
	
	
}
