package ejer38;

import java.util.Scanner;

public class MayorMenor {
	
	public void cargarValores() {
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce el valor1: ");
		int valor1=teclado.nextInt();
		System.out.println("Introduce el valor2: ");
		int valor2=teclado.nextInt();
		System.out.println("Introduce el valor3: ");
		int valor3=teclado.nextInt();
		int mayor,menor;
		mayor=calcularMayor(valor1,valor2,valor3);
		menor=calcularMenor(valor1,valor2,valor3);
		System.out.println("El mayor es: "+mayor);
		System.out.println("El menor es: "+menor);
		
	}

	public int calcularMayor(int v1,int v2, int v3) {
		int m;
		if(v1>v2&&v1>v3) {
			m=v1;
		}else if(v2>v3&&v2>v3) {
			m=v2;
		}else {
			m=v3;
		}
		
		return m;
	}
	
	public int calcularMenor(int v1,int v2, int v3) {
		int m;
		if(v1<v2&&v1<v3) {
			m=v1;
		}else if(v2<v3&&v2<v3) {
			m=v2;
		}else {
			m=v3;
		}
		
		return m;
	}
	
	public static void main(String[]args) {
		MayorMenor programamaymen= new MayorMenor();
		programamaymen.cargarValores();
		
	}
	
}


