package ejer60propuesto;

import java.util.Scanner;

public class MatrizIrregular1 {
	
	private Scanner teclado;
	private int[][]mat;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		System.out.print("Cuantas filas tiene la matriz: ");
		int filas=teclado.nextInt();
		mat=new int[filas][];
		for(int f=0;f<mat.length; f++) {
			System.out.println("Cuantos elementos tiene la fila "+f+": ");
			int elementos=teclado.nextInt();
			for(int c=0; c<mat[f].length; c++) {
				System.out.println("Introduce componente: ");
				mat[f][c]=teclado.nextInt();
			}
		}
	}
	
	public void imprimir() {
		for(int f=0;f<mat.length; f++) {
			
			for(int c=0; c<mat[f].length; c++) {
				System.out.print(mat[f][c]);

			}
			System.out.println();
		}
	}
	
	
	
	
	public static void main(String[]args) {
		
		MatrizIrregular1 mtz= new MatrizIrregular1();
		mtz.cargar();
		mtz.imprimir();
	}
	
	
	

}
