package ejer11;

import java.util.Scanner;

public class CondicionesCompuestas {
	
	public static void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int num1,num2,num3;
		System.out.println("Introduce primer valor: ");
		num1=teclado.nextInt();
		System.out.println("Introduce segundo valor");
		num2=teclado.nextInt();
		System.out.println("Introduce tercer valor: ");
		num3=teclado.nextInt();
		
		if(num1>num2&&num1>num3) {
			
			System.out.println("El numero "+num1+" es mayor");
		}else {
			if(num2>num3) {
				System.out.println("El numero "+num2+" es mayor");
			}else {
				System.out.println("El numero "+num3+" es mayor");
			}
		}
		
		
		
		
		
		
	}

}
