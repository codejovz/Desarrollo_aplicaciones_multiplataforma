package ejer31;

import java.util.Scanner;

public class CadenaDeCaracteres3 {
	
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		
		String apellido1,apellido2;
		System.out.println("Introduce el primer apellido: ");
		apellido1=teclado.next();
		System.out.println("Introduce el segundo apellido: ");
		apellido2=teclado.next();
		
		if(apellido1.equals(apellido2)) {
			System.out.println("Los apellidos son iguales");
		}else {
			System.out.println("Los apellidos son diferentes");
		}
		
	}

}
