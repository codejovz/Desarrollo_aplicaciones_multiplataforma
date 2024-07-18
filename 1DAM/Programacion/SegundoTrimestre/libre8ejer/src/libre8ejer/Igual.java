package libre8ejer;

import java.util.Scanner;


public class Igual {
	
	public static void main(String[]args) {
		int num1,num2;
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num1=teclado.nextInt();
		System.out.println("Introduce el num2: ");
		num2=teclado.nextInt();
		
		if (num1==num2) {
			
			System.out.println("Los dos numeros son iguales.");
		}else {
			
			System.out.println("Son diferentes.");
		}
		
		
	}
	
	

}
