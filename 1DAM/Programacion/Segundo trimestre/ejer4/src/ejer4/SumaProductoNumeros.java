package ejer4;

import java.util.Scanner;


public class SumaProductoNumeros {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2, suma, producto;
		System.out.print("Introduce el primer valor: ");
		num1=teclado.nextInt();
		System.out.print("Introduce el segundo valor: ");
		num2=teclado.nextInt();
		suma=num1+num2;
		producto=num1*num2;
		System.out.print("La suma da: ");
		System.out.println(suma);
		System.out.print("Y el producto es: ");
		System.out.println(producto);	
		teclado.close();
		
	}
	
	
	
}
