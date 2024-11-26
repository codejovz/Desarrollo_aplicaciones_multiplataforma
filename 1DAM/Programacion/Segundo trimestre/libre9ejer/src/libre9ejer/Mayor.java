package libre9ejer;

import java.util.Scanner;
public class Mayor {
	public static void main(String[]args) {
		int n1,n2;
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce el n1: ");
		n1=teclado.nextInt();
		System.out.println("Introduce el n2: ");
		n2=teclado.nextInt();
		if (n1>n2) {
			System.out.println("El numero "+n1+" es mayor");
		}else if(n2>n1) {
			System.out.println("El numero "+n2+" es mayor");
		}else {
			System.out.println("Son iguales");
		}
		
	}

}
