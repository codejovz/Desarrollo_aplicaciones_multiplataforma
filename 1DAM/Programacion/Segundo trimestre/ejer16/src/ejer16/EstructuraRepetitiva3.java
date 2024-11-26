package ejer16;

import java.util.Scanner;

public class EstructuraRepetitiva3 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int x,suma, valor, promedio;
		x=1;
		suma=0;
		while(x<=10) {
			
			System.out.print("Introduce un valor: ");
			valor=teclado.nextInt();
			suma=suma+valor;
			x=x+1;
		}
		
		promedio=suma/10;
		System.out.print("La suma de los 10 valores es: "+suma);
		System.out.println("Y el promedio da: "+promedio);
	
		
		
	}

}
