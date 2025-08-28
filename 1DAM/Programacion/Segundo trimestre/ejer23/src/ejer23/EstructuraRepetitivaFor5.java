package ejer23;

import java.util.Scanner;


public class EstructuraRepetitivaFor5 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int cantidad = 0, n, x, valor;
		
		System.out.println("Cuantos valores quieres introducir? ");
		
		n=teclado.nextInt();
		
		for(x=0;x<n;x++) {
			
			System.out.println("Introduce el valor: ");
			valor=teclado.nextInt();
			
			if (valor>=1000){
				
				cantidad= cantidad+1;
			}
			
			
			
		}
		System.out.println("La cantidad de valores>=100 es de: "+cantidad);
		
	}
	

}
