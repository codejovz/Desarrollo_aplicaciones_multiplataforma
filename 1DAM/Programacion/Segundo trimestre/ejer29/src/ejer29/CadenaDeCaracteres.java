package ejer29;

import java.util.Scanner;

public class CadenaDeCaracteres {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int edad1,edad2;
		String nombre1,nombre2;
		
		System.out.println("Introduce un nombre: ");
		nombre1=teclado.next();
		System.out.println("Introduce su edad: ");
		edad1=teclado.nextInt();
		System.out.println("Introduce otro nombre: ");
		nombre2=teclado.next();
		System.out.println("Introduce su edad: ");
		edad2=teclado.nextInt();
		
		if(edad1>edad2) {
			System.out.println(nombre1);
		}else {
			System.out.println(nombre2);
		}
		
	}

}
