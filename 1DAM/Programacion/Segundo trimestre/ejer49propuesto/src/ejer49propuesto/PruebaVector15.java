package ejer49propuesto;

import java.util.Scanner;

public class PruebaVector15 {
	
	private int[]elementos;
	Scanner teclado= new Scanner(System.in);
	
	public void cargar() {
		
		System.out.println("Cuantos elementos quieres en el vector? ");
		int n=teclado.nextInt();
		elementos=new int[n];
		
		for(int x=0;x<elementos.length;x++) {
			System.out.println("Introduce un elemento al vector: ");
			elementos[x]=teclado.nextInt();
		}
		
	}
	
	
	public void ordenar() {
		
		for(int k=0;k<elementos.length-1;k++) {
			for(int x=0; x<elementos.length-1-k;x++) {
				
				if(elementos[x]>elementos[x+1]) {
					
					int aux=elementos[x+1];
					elementos[x+1]=elementos[x];
					elementos[x]=aux;
				}
				
				
				
			}
		}
		
		
	}
	
	public void ordenarAlreves() {
		for(int k=0;k<elementos.length-1;k++) {
			for(int x=0; x<elementos.length-1-k;x++) {
				
				if(elementos[x]<elementos[x+1]) {
					
					int aux=elementos[x+1];
					elementos[x+1]=elementos[x];
					elementos[x]=aux;
				}
				
				
				
			}
		}
		
		
	}
	
	
	
	public void imprimir() {
		System.out.println("Lista de elementos ordenados: ");
		for(int x=0;x<elementos.length;x++) {
			System.out.print(elementos[x]+", ");
		}
		
	}
	
	
	public static void main(String[]args) {
		PruebaVector15 pv15= new PruebaVector15();
		pv15.cargar();
		pv15.ordenar();
		pv15.imprimir();
		pv15.ordenarAlreves();
		pv15.imprimir();
		
	}
	
	
	
}
