package ejer64;

import java.util.Scanner;

public class Alumno {
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	public Alumno() {
		
		teclado=new Scanner(System.in);
		System.out.print("Introduce nombre: ");
		nombre=teclado.next();
		System.out.print("Introduce edad: ");
		edad=teclado.nextInt();
		
	}
	
	public void imprimir() {
		System.out.println("Nombre "+nombre);
		System.out.println("Edad "+edad);
	}
	
	
	public void esMayorEdad() {
		
		if(edad>=18) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("No es mayor de edad");
		}
		
		
	}
	
	public static void main(String[]args) {
		
		Alumno almn= new Alumno();
		almn.imprimir();
		almn.esMayorEdad();
		
	}

}
