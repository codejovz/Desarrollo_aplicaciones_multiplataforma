package ejer72;

import java.util.Scanner;

public class Operacion {
	
	protected Scanner teclado;
	protected int valor1;
	protected int valor2;
	protected int resultado;
	
	public Operacion() {
		teclado=new Scanner(System.in);
		
	}
	
	public void cargar1() {
		System.out.println("Introduce el primer valor: ");
		valor1=teclado.nextInt();
	}
	
	public void cargar2() {
		System.out.println("Introduce el segundo valor: ");
		valor2=teclado.nextInt();	
	}
	
	public void mostrarResultado() {
		System.out.println(resultado);
	}
}
