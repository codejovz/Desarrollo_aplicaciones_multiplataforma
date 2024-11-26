package ejer30;

import java.util.Scanner;

public class CadenaDeCaracteres2 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String apenom1,apenom2;
		int edad1,edad2;
		
		System.out.println("Introduce el apellido y el nombre: ");
		
		apenom1=teclado.nextLine();
		System.out.println("Introduce su edad: ");
		edad1=teclado.nextInt();
		
		System.out.println("Introduce otro apellido y nombre: ");
		teclado.nextLine();
		apenom2=teclado.nextLine();
		System.out.println("Introduce su edad: ");
		edad2=teclado.nextInt();
		
		if(edad1>edad2) {
			System.out.println(apenom1);
		}else {
			System.out.println(apenom2);
		}
	
	}

}
