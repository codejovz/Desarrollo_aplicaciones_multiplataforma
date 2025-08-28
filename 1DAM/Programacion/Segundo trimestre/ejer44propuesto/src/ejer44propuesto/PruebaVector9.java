package ejer44propuesto;

import java.util.Scanner;

public class PruebaVector9 {
	
	public static void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int vector1[];
		
		System.out.println("Introduce la cantidad de elementos que quieres: ");
		int cant=teclado.nextInt();
		
		vector1=new int[cant];
		
		
		
		for(int x=0;x<vector1.length;x++) {
			System.out.println("Introduce un elemento al vector: ");
			vector1[x]=teclado.nextInt();
		}
		int suma=0;
		
		for(int x=0;x<vector1.length;x++) {
			suma=suma+vector1[x];
		}
		System.out.println("La suma da: "+suma);
		
		suma=0;
		
		for(int x=vector1.length;x>=0;x--) {
			suma=suma+vector1[x];
			System.out.println(x);
		}
		System.out.println("La suma al reves da: "+suma);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
