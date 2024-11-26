package libre3ejer;

import java.util.Scanner;

public class ManzanasPeras {
	
	public static void main(String[]args) {
		int semestres,x=0;
		double kgperas,kgmanzanas,total=0;
		Scanner teclado= new Scanner(System.in);
		System.out.println("De cuantos semestres quieres hacer el calculo? ");
		semestres=teclado.nextInt();
		while (x<semestres) {
			System.out.println("Cuantos kg de peras se han vendido? ");
			kgperas=teclado.nextFloat();
			System.out.println("Cuantos kg de manzanas se han vendido? ");
			kgmanzanas=teclado.nextFloat();
			total=total+(kgperas*1.95)+(kgmanzanas*2.35);
			x=x+1;
		}
		
		System.out.println("El beneficio total ha sido de "+total+"€");
		
		
	}

}
