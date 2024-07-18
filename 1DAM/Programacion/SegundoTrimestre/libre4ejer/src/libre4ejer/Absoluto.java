package libre4ejer;

import java.util.Scanner;

public class Absoluto {
	
	public static void main(String[]args) {
		
		int num,abso;
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce un numero positivo o negativo: ");
		
		num=teclado.nextInt();
		
		if (num<0) {
			
			abso=num*(-1);
		}else {
			abso=num;
		}
		
		System.out.println("El numero absoluto de "+num+" es "+abso);
		
	}

}
