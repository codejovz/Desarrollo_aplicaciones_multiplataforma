package libre11ejer;

import java.util.Scanner;

public class Ordenar {
	
	public static void main(String[]args) {
		int n1,n2,may,men;
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce el primer numero: ");
		
		n1=teclado.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		
		n2=teclado.nextInt();
		
		if(n1>n2) {
			System.out.println(n1+" "+n2);
		}else {
			System.out.println(n2+" "+n1);
		}
		
	}

}
