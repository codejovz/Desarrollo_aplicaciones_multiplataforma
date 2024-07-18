package ejer20;

import java.util.Scanner;
public class EstructuraRepetitivaFor2 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int suma = 0, x, valor, promedio;
		for(x = 0;x <= 10; x++) {
			
			System.out.println("Introduce un valor: ");
			valor=teclado.nextInt();
			suma=suma+valor;
			
		}
		
		System.out.println("La suma es "+suma);
		promedio = suma/10;
		
		System.out.println("Y el promedio es "+promedio);
		
	}

}
