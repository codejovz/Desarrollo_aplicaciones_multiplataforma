package ejer6;

import java.util.Scanner;

public class Primer_if {
	
	
	public static void main(String[]arg) {
		
		Scanner teclado= new Scanner(System.in);
		float sueldo;
		System.out.print("Introduce un sueldo: ");
		sueldo=teclado.nextFloat();
		if (sueldo>3000) {
			
			System.out.println("Debe pasar por garita.");
		}
		
		
		
	}
	

}
