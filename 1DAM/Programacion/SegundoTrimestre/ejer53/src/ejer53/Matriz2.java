package ejer53;

import java.util.Scanner;

public class Matriz2 {
	private String[][]mat;
	
	public void cargar() {
		mat=new String[4][4];
		for(int f=0;f<4;f++) {
			for(int c=0;c<4;c++) {
				if(f==c) {
					mat[f][c]="X";
				}else {
					mat[f][c]="-";
				}
			}
		}
	}
	
	public void imprimirDiagonalPrincipal() {
		for(int f=0;f<4;f++) {
			for(int c=0;c<4;c++) {
				System.out.print(mat[f][c]);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[]args) {
		Matriz2 mz2=new Matriz2();
		mz2.cargar();
		mz2.imprimirDiagonalPrincipal();
	}
	

}
