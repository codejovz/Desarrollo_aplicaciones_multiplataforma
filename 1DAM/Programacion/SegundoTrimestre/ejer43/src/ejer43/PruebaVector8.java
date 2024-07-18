package ejer43;

import java.util.Scanner;

public class PruebaVector8 {
	private Scanner teclado;
	private int[]sueldos;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		System.out.println("Cuantos sueldos introduciras?: ");
		int cant;
		cant=teclado.nextInt();
		sueldos=new int[cant];
		for(int f=0;f<sueldos.length;f++) {
			
			System.out.println("Introduce sueldo: ");
			sueldos[f]=teclado.nextInt();
			
		}
		
	}
	
	public void imprimir() {
		
		for(int f=0;f<sueldos.length;f++) {
			System.out.println(sueldos[f]);
		}
	}
	
	
	public static void main(String[]args){
		
		PruebaVector8 pv8 = new PruebaVector8();
		pv8.cargar();
		pv8.imprimir();
		
		
	}
	
	
	
	
	

}
