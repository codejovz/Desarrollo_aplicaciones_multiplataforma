package ejer3;

import java.util.Scanner;




public class SuperficieCuadrado {

	public static void main(String[]atgs) {
		
		
		Scanner teclado=new Scanner(System.in);
		int lado;
		int superficie;
		System.out.print("Introduce el lado del cuadrado: ");
		lado = teclado.nextInt();
		superficie = lado* lado;
		System.out.print("La superficie del cuadrado es: ");
		System.out.println(superficie);
			
		
	//Triangulo(lo he hecho yo)//
		
		int altura;
		int anchura;
		int superf;
		System.out.print("Introduce altura del triangulo");
		altura = teclado.nextInt();
		System.out.println("Introduce la anchura del triangulo: ");
		anchura= teclado.nextInt();
		System.out.print("La superficie del triangulo es: ");
		superf=altura*anchura;
		System.out.println(superf);
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
	
	
}
