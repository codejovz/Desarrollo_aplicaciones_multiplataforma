package libre12ejer;

import java.util.Scanner;

public class Anterior_con_num_iguales {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("Introduce el numero 1: ");
		num1=teclado.nextInt();
		System.out.println("Introduce el numero 2: ");
		num2=teclado.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+" > "+num2);
		}else if(num2>num1){
			System.out.println(num2+" > "+num1);
		}else {
			System.out.println(num1+" = "+num2);
		}
		
		
		
		
	}
	
}
