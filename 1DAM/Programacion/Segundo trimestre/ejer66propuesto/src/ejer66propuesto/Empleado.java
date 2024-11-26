package ejer66propuesto;

import java.util.Scanner;

public class Empleado {
	
	Scanner teclado= new Scanner(System.in);
	
	String nombre;
	int sueldo;
	
	
	public Empleado() {
		
		System.out.print("Introduce el nombre del empleado: ");
		nombre=teclado.next();
		System.out.print("Introduce su sueldo: ");
		sueldo=teclado.nextInt();
		
	}
	

	
	public void imprimir() {
		System.out.println(nombre+" cobra "+sueldo+"€");
		
	}
	
	public void impuestos() {
		if (sueldo<=3000) {
			System.out.println("No debe pagar impuestos");
		}else {
			System.out.println("Debe pagar impuestos");
		}
	}
	
	private int valor1;
	private int valor2;

	public Empleado(int va1, int va2) {
		
		System.out.println("Introduce el valor1: ");
		va1=teclado.nextInt();
		System.out.println("Introduce el valor2: ");
		va2=teclado.nextInt();
		valor1=va1;
		valor2=va2;
		
	}
	
	
	
	
	
	public static void main(String[]args) {
		
		Empleado emp = new Empleado();
		emp.imprimir();
		emp.impuestos();
		
		
		
		
	}
	
	
	
	

}
