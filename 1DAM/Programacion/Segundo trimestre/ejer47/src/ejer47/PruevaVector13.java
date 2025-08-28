package ejer47;

import java.util.Scanner;

public class PruevaVector13 {
	
	private Scanner teclado;
	private int[]sueldos;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		sueldos= new int[5];
		for(int f=0; f<sueldos.length;f++) {
			System.out.println("Introduce un sueldo: ");
			sueldos[f]=teclado.nextInt();
		}
	}
	
	public void ordenar() {
		
		for(int k=0;k<4;k++) {
			for(int f=0;f<4-k;f++) {
				
				if(sueldos[f]>sueldos[f+1]) {
					int aux;
					aux=sueldos[f];
					sueldos[f]=sueldos[f+1];
					sueldos[f+1]=aux;
				}
				
				
			}
		}
	}
	
	public static void main(String[]args) {
		PruevaVector13 pv13= new PruevaVector13();
		pv13.cargar();
		pv13.ordenar();
	}

	
	
}


