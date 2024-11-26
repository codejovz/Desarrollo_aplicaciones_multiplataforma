package ejer26;

import java.util.Scanner;

public class EstructuraRepetitivaDoWhile2 {
	
	public static void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int suma=0,cant=0,valor,promedio;
		
		do {
			System.out.println("Introduce un valor(0 finaliza): ");
			valor=teclado.nextInt();
			if(valor!=0) {
				suma=suma+valor;
				cant=cant+1;
			}
			
		}while(valor!=0);
		
		if(cant!=0) {
			
			promedio=suma/cant;
			System.out.println("El promedio es: "+promedio);
		}else {
			System.out.println("No se introdujeron numeros");
		}
		
	}

}
