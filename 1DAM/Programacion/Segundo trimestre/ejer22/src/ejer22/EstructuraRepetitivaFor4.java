package ejer22;

import java.util.Scanner;


public class EstructuraRepetitivaFor4 {
	
	public static void main(String[]args) {
		
		int x, valor, mul3=0, mul5=0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(x=0;x<=10;x++) {
			
			System.out.println("Introduce un valor: ");
			valor=teclado.nextInt();
			
			if (valor%3==0) {
				mul3=mul3+1;
			}
			if(valor%5==0) {
				mul5=mul5+1;
			}
			
			
		}
		
		System.out.println("Los multiplos de 3 son: "+mul3);
		System.out.println("Y los multiplos de 5 son: "+mul5);
		
		
	}

}
