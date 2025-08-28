package libre26ejer;

import java.util.Scanner;

public class Contar {
	
	public static void main(String[]args) {
		
		int num,x=1;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce un numero y muestro del 1 a ese numero: ");
		
		num=teclado.nextInt();
		
		if (num>1) {
			
			while(x<=num) {
				System.out.println(x);
				x=x+1;
			}
			
			
		}
		
		
	}

}
