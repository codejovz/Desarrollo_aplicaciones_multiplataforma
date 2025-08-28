package ejer40;

import java.util.Scanner;

public class PruebaVector2 {
	
	private Scanner teclado;
	private float[] alturas;
	private float promedio;
	
	
	public void cargar() {
		teclado=new Scanner(System.in);
		alturas=new float[5];
		
		
		for(int f=0;f<5;f++) {
			System.out.println("Introduce la altura de una persona: ");
			alturas[f]=teclado.nextFloat();
		}
	}
	
	
	public void calcularPromedio() {
		float suma=0;
		for(int f = 0; f<5;f++) {
			suma=suma+alturas[f];
		}
		promedio=suma/5;
		System.out.println("El promedio es: "+promedio);
	}
	
	
	public void mayoresMenores() {
		int may=0,men=0;
		for(int f = 0; f<5; f++) {
			if(alturas[f]>promedio) {
				may++;
			}else {
				if(alturas[f]<promedio) {
					men++;
				}
			}
		}
		
		System.out.println("Cantidad de personas mayores al promedio: "+may);
		System.out.println("Cantidad de personas menores al promedio: "+men);
		
	}
	

	public static void main(String[]args) {
		PruebaVector2 pv2=new PruebaVector2();
		pv2.cargar();
		pv2.calcularPromedio();
		pv2.mayoresMenores();
	}
	
	
	
	
	
	
	
	
}
