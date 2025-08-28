package ejer46propuesto;

import java.util.Scanner;



public class PruebaVector12 {

	
	private int[]elementos;
	
	public void cargar() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el numero de elementos del vector: ");
		int num=teclado.nextInt();
		elementos=new int[num];
		
		for(int x=0;x<elementos.length;x++) {
			System.out.println("Introduce un elemento al vector: ");
			elementos[x]=teclado.nextInt();
		}
		
		
		
	}
	
	public void imprimirMenor() {
	    int men=elementos[0];
		int rep=0;
		for(int x=1;x<elementos.length;x++) {
			
			if(elementos[x]<men) {
				men=elementos[x];
			}
		}
		System.out.println("El elemento menor del vector es: "+men);
		
		for(int x=0;x<elementos.length;x++) {
			if(elementos[x]==men) {
				rep=rep+1;
			}
			
		}
		if(rep>1){
			System.out.println("El elemento menor está "+rep+" veces.");
		}

	}
	
	
	public static void main(String[]args) {
		
		PruebaVector12 pv12= new PruebaVector12();
		pv12.cargar();
		pv12.imprimirMenor();
		
	}
	
	
}
