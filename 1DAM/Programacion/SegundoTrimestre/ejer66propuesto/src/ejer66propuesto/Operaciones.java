package ejer66propuesto;

import java.util.Scanner;

public class Operaciones {
	
	

	public Operaciones(int va1, int va2) {
		
		int valor1, valor2;
		valor1=va1;
		valor2=va2;
		
	}
	
	
	
	public void suma() {
		System.out.println("La suma de "+valor1+"+"+valor2+"="+(valor1+valor2));
	}
	
	public void resta() {
		System.out.println("La resta de "+valor1+"-"+valor2+"="+(valor1-valor2));
	}
	
	
	
	
	
	public static void main(String[]args) {
		
		
		System.out.println("2)--------------------------------------");
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el valor1: ");
		int va1=teclado.nextInt();
		int va2=teclado.nextInt();
		
		
		Operaciones op= new Operaciones(va1,va2);
		op.suma();
		op.resta();
		op.multi();
		op.divi();
	}
}
