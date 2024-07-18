package ejer55propuesto;

import java.util.Scanner;

public class Matriz4 {
	private int[][]mat;
	
	public void cargar() {
		Scanner teclado= new Scanner(System.in);
		mat=new int[2][5];
		for(int c=0; c<5; c++) {
			for(int f=0; f<2;f++) {
				System.out.println("Introduce un elemento a la matriz: ");
				mat[f][c]=teclado.nextInt();
			}
		}
		
		
		
	}
	
	public void imprimir() {
		System.out.println("Matriz: ");
		for(int f=0; f<2; f++) {
			for(int c=0; c<5; c++) {
				System.out.print(mat[f][c]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[]args) {
		Matriz4 mt4= new Matriz4();
		mt4.cargar();
		mt4.imprimir();
	}

}
