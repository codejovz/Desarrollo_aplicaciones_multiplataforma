package ejer9;

/*Haz un programa en el que se pida al usuario tres notas*/
/*El programa calcula y muestra el promedio*/
/*Si saca >=7 dice que promociona,>=4 
 * dice que regular, <4 dice que suspende.*/

import java.util.Scanner;

public class EstructuraCondicionalAnidada {
	
	public void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int nota1,nota2,nota3,promedio;
		
		System.out.println("Introduce nota1 : ");
		nota1=teclado.nextInt();
		System.out.println("Introduce nota2 : ");
		nota2=teclado.nextInt();
		System.out.println("Introduce nota3 : ");
		nota3=teclado.nextInt();
		promedio=(nota1+nota2+nota3)/3;
		System.out.println("El promedio es: " +promedio);
		
		if (promedio>=7) {
			System.out.println("Promociona");
		}else if(promedio>=4) {
			System.out.println("Regular, te falta un herbor");
		}else if(promedio<4) {
			System.out.println("Haber chapao");
		}
		
		
		
		
		
	}

}
