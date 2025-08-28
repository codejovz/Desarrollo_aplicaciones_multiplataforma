package ejer34;

import java.util.Scanner;

public class Punto {
	
	private Scanner teclado;
	int x,y;
	
	public void inicializar() {
		
		teclado= new Scanner(System.in);
		System.out.println("Introduce coordenada X: ");
		x=teclado.nextInt();
		System.out.println("Introduce coordenada Y: ");
		y=teclado.nextInt();
		
	}
	
	
	void imprimirCuadrante() {
		
		if(x<0 && y>0) {
			System.out.println("Se encuentra en el primer cuadrante");
		}else if(x>0 && y>0) {
			System.out.println("Se encuentra en el segundo cuadrante");
		}else if(x<0 && y<0) {
			System.out.println("Se encuentra en el tercer cuadrante");
		}else if(x>0 && y<0) {
			System.out.println("Se encuentra en el cuarto cuadrante");
		}
	}
	
	public static void main(String[]args) {
		Punto punto1;
		punto1=new Punto();
		punto1.inicializar();
		punto1.imprimirCuadrante();
		
		Punto punto2=new Punto();
		
	}
}
