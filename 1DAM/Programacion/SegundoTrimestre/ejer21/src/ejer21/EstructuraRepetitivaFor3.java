package ejer21;

import java.util.Scanner;

public class EstructuraRepetitivaFor3 {
	
	public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		
		int aprobados = 0, reprobados = 0, f, nota;
		
		for (f=0;f<=5;f++) {
			
			System.out.println("Introduce la nota: ");
			
			nota=teclado.nextInt();
			
			if (nota>=7) {
				aprobados=aprobados+1;
			}else {
				reprobados=reprobados+1;
			}
			
			
		}
		
		System.out.println("Cantidad de aprobados: "+aprobados);
		System.out.println("Cantidad de reprobados: "+reprobados);
		
	}

}
