package ejer32;

import java.util.Scanner;

public class CadenaDeCaracteres4 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		String nombre1,nombre2;
		
		System.out.println("Introduce el primer nombre: ");
		nombre1=teclado.next();
		System.out.println("Introduce el segundo nombre: ");
		nombre2=teclado.next();
		
		if(nombre1.equalsIgnoreCase(nombre2)) {
			System.out.println("Los nombres son iguales");
		}else {
			System.out.println("Los nombres son diferentes");
		}
		
		
		
	}

}
