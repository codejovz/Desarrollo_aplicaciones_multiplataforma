package ejer54;

import java.util.Scanner;

public class Matriz3 {
	
	private Scanner teclado;
	private int[][]mat;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		mat=new int[3][4];
		for(int f=0; f<3;f++) {
			for(int c=0; c<4; c++) {
				System.out.println("Introduce componente: ");
				mat[f][c]=teclado.nextInt();
			}
		}
	}
	
	public void primerFila() {
		System.out.println("Primer fila de lamatriz: ");
		for(int c=0; c<4;c++) {
			System.out.print(mat[0][c]+" ");
		}
	}
	
	public void ultimaFila() {
		System.out.println("Ultima fila: ");
		for(int c=0; c<4;c++) {
			System.out.print(mat[2][c]+" ");
		}
	}
	
	public void primerColumna() {
		System.out.println("Primera columna: ");
			for(int f=0;f<3; f++) {
				System.out.println(mat[f][0]);
			}
		
	}

}
