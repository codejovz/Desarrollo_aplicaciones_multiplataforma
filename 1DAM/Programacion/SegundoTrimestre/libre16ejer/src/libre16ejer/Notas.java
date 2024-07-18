package libre16ejer;

import java.util.Scanner;

public class Notas {
	
	public static void main(String[]args) {
		
		System.out.println("Imprime definicion de la nota segun cual sea");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce una nota: ");
		
		int nota;
		
		nota=teclado.nextInt();
		
		if (nota>=0&&nota<5) {
			System.out.println("Suspenso");
		}else if(nota>=5&&nota<6) {
			System.out.println("Aprobado");
		}else if(nota>=6&&nota<7) {
			System.out.println("Bien");
		}else if(nota>=7&&nota<10) {
			System.out.println("Notable");
		}else if (nota==10) {
			System.out.println("Sobresaliente");
		}else{
			System.out.println("Error. La nota debe ser del 0 al 10");
		}
		
		
		
		
	}

	
	
	
	
}
