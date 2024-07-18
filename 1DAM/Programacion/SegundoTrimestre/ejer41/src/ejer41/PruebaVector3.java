package ejer41;

import java.util.Scanner;

public class PruebaVector3 {
	
	private Scanner teclado;
	private float[]turnoMan;
	private float[]turnoTar;
	
	
	public void cargar() {
		teclado= new Scanner(System.in);
		turnoMan=new float[4];
		turnoTar=new float[4];
		System.out.println("Sueldos de empleados del turno de la mañana. ");
		for(int f=0; f<4;f++) {
			System.out.println("Introduce sueldo: ");
			turnoMan[f]=teclado.nextFloat();
			
		}

		System.out.println("Sueldos de empleados del turno de la tarde. ");
		for(int f=0; f<4;f++) {
			System.out.println("Introduce sueldo: ");
			turnoTar[f]=teclado.nextFloat();
			
		}
	}
	
	
	public void calcularGastos() {
		float man= 0, tar=0;
		for(int f = 0;f<4;f++) {
			man = man+turnoMan[f];
			tar = tar+turnoTar[f];
		}
		System.out.println("Total de gastos del turno de mañana: "+man);
		System.out.println("Total de gastos del turno de tarde: "+tar);
	}
	
	public static void main(String[]args) {
		PruebaVector3 pv=new PruebaVector3();
		pv.cargar();
		pv.calcularGastos();
	}
	
	
}
