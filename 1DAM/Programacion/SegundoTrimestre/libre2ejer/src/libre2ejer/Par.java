package libre2ejer;

import java.util.Scanner;

public class Par {
	
	public static void main(String[]args) {
		
		int num;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero par/impar: ");
		num=teclado.nextInt();
		
		if (num%2==0) {
			System.out.println("El numero "+num+" es par.");
		}else {
			
			System.out.println("El numero "+num+" es impar.");
			
		}
		
		
	}

}
