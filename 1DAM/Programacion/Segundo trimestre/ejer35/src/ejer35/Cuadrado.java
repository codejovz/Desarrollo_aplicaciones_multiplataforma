package ejer35;

import java.util.Scanner;

public class Cuadrado {
	
	private Scanner teclado;
	int lado;
	
	public void inicializar() {
		
		teclado=new Scanner(System.in);
		System.out.println("Introduce el valor del lado: ");
		lado=teclado.nextInt();
		
	}
	
	public void imprimirPerimetro() {
		int perimetro;
		perimetro=lado*4;
		System.out.println("El perimetro es: "+perimetro);
	}
	
	public void imprimirSuperficie() {
		int superficie=lado*lado;
		System.out.println("La superficie es: "+superficie);
	}
	
	public static void main(String[]args) {
		
		Cuadrado cuadrado1= new Cuadrado();
		cuadrado1.inicializar();
		cuadrado1.imprimirPerimetro();
		cuadrado1.imprimirSuperficie();
		
		Cuadrado cuadrado8= new Cuadrado();
		cuadrado8.inicializar();
		cuadrado8.imprimirSuperficie();
		cuadrado8.imprimirPerimetro();
		
	}
	
}
