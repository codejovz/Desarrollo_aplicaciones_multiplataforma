package ejer33;

import java.util.Scanner;

public class Triangulo {
	
	private Scanner teclado;
	private int lado1,lado2,lado3;
	
	public void inicializar() {
		
		teclado= new Scanner(System.in);
		System.out.println("Medida lado 1: ");
		lado1=teclado.nextInt();
		System.out.println("Medida lado 2: ");
		lado2=teclado.nextInt();
		System.out.println("Medida lado 3: ");
		lado3=teclado.nextInt();
		
	}
	
	public void ladoMayor() {
		
		System.out.print("Lado mayor: ");
		if(lado1>lado2&&lado1>lado3) {
			System.out.println(lado1);
		}else if(lado2>lado3) {
			System.out.println(lado2);
		}else {
			System.out.println(lado3);
		}
	}

	public void esEquilatero() {

		if(lado1==lado2&&lado1==lado3) {
			System.out.println("Es equilatero");
		}else {
			System.out.println("No es equilatero");
		}
	}

	public static void main(String[]args) {
		Triangulo triangulo1=new Triangulo();  /*Primer objeto*/
		triangulo1.inicializar();
		triangulo1.ladoMayor();
		triangulo1.esEquilatero();
		
		Triangulo triangulo2=new Triangulo();  /*Segundo objeto*/
		triangulo2.inicializar();
		triangulo2.ladoMayor();
		triangulo2.esEquilatero();
		
		
	}

}
