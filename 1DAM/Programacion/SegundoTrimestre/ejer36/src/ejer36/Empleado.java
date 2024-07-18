package ejer36;

import java.util.Scanner;

public class Empleado {
	
	String nombre;
	int sueldo;
	Scanner teclado=new Scanner(System.in);
	
	public void inicializar() {
		
		System.out.println("Introduce el nombre del empleado: ");
		nombre=teclado.next();
		System.out.println("Introduce su sueldo: ");
		sueldo=teclado.nextInt();
	}
	
	public void imprimirDatos() {
		
		System.out.println("El nombre del empleado es: "+nombre);
		System.out.println("Y su sueldo es: "+sueldo);
	}
	
	public void debePagar() {
		if(sueldo>3000) {
			System.out.println("Debe pagar impuestos, cobra mas de 3k");
		}else {
			System.out.println("No debe pagar impuestos, cobra menos de 3k");
		}
		
	}
	
	
	public static void main(String[]args) {
		
		Empleado empleado1= new Empleado();
		empleado1.inicializar();
		empleado1.imprimirDatos();
		empleado1.debePagar();
		
	}
		
}
