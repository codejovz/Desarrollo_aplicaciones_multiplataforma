package ejer72mio;

import java.util.Scanner;

public class Operacion {
	
	protected int num1;
	protected int num2;
	protected int resultado;
	protected Scanner teclado;
	
	public Operacion(){
		
		teclado=new Scanner(System.in);
		
	}
	
	void introducir() {
		System.out.println("Introduce el num1: ");
		num1= teclado.nextInt();
		System.out.println("Introduce el num2: ");
		num2=teclado.nextInt();
		
	}
	
	void imprimir() {
		System.out.println("El resultado es: "+resultado);
	}

}
