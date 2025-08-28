package libre5ejer;
/*El programa pide tres notas, las devuelve primero sin decimales y luego con decimales*/

import java.util.Scanner;



public class MediaTrimes {
	
	public static void main(String[]args) {
		
		double nota1,nota2,nota3,media;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce la nota1: ");
		nota1=teclado.nextDouble();
		System.out.println("Introduce la nota2: ");
		nota2=teclado.nextDouble();
		System.out.println("Introduce la nota3: ");
		nota3=teclado.nextDouble();
		
		media=(nota1+nota2+nota3)/3;
		System.out.println("La media del curso con decimales es: "+media);
		/*System.out.println("La media del curso sin decimales es: "+int(media))*//*No sabemos convertir clases :(*/
		
	}

}
