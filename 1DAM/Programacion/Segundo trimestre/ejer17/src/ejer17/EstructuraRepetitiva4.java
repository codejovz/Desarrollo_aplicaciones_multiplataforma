package ejer17;

import java.util.Scanner;

public class EstructuraRepetitiva4 {
	
	public static void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int x=1, cantidad=0,n;
		float largo;
		System.out.println("Cuantas piezas procesara? ");
		n=teclado.nextInt();
		while(x<=n) {
			
		System.out.println("Introduce la medida de la pieza: ");
		largo=teclado.nextFloat();
		if(largo>1.20 && largo<=1.30) {
			
			cantidad=cantidad+1;
		}
		x=x+1;	
			
		}
		System.out.println("La cantidad de piezas aptas son: "+cantidad);
	
	}

}
