package libre24ejer;

import java.util.Scanner;

public class ArbolMasAlto {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int cont=1, alt=0, max=0,posmax=1;
		
		while(alt!=-1) {
			
			System.out.println("Introduce la altura del arbol: ");
			alt=teclado.nextInt();
			if (alt>max) {
				max=alt;
				posmax=cont;
			}
			cont=cont+1;
			
		}
		System.out.println("El arbol mas alto es el: "+posmax+" y mide: "+max);
		
	}
	
	

}
