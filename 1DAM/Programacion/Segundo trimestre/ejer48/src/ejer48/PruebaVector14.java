package ejer48;

import java.util.Scanner;

public class PruebaVector14 {
	
	private Scanner teclado;
	private String[]paises;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		paises=new String[5];
		
		for(int f=0;f<paises.length;f++) {
			System.out.println("Introduce el nombre del pais: ");
			paises[f]=teclado.next();
		}
	}
	
	public void ordenar() {
		for(int k=0;k<4;k++) {
			for(int f=0;f<4;f++) {
				if(paises[f].compareTo(paises[f+1])>0) {
					String aux;
					aux=paises[f];
					paises[f]=paises[f+1];
					paises[f+1]=aux;
				}
				
			}
			
		}
		
	}
	
	public void imprimir() {
		System.out.println("Paises ordenados alfabeticamente: ");
		for(int f=0;f<paises.length;f++) {
			System.out.println(paises[f]);
		}
	}
	
	public static void main(String[]args) {
		PruebaVector14 pv14= new PruebaVector14();
		pv14.cargar();
		pv14.ordenar();
		pv14.imprimir();
	}
	
	
	

}
