package ejer58propuesto;

import java.util.Scanner;

public class Matriz7 {
	private int[][] mat;
	private int[]aux;
	int n,m;
	
	public void cargar() {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce cuántas filas quieres: ");
		n=teclado.nextInt();
		System.out.println("Introduce cuántas columnas quieres: ");
		m=teclado.nextInt();
		mat=new int[n][m];
		for(int f=0;f<n;f++) {
			for(int c=0;c<m;c++) {
				System.out.println("Introduce un elemento f"+f+" c"+c);
				mat[f][c]=teclado.nextInt();
			}
		}
		
		for(int f=0;f<n;f++) {
			for(int c=0;c<m;c++) {
				System.out.print(mat[f][c]+" ");
				
			}
			System.out.println();
		}
		
	
	
	}
	
	public void cambiar() {
		
	aux=new int[n];
		
		for(int f=0;f<2;f++) {
			for(int c=0;c<m;c++) {
				if(f==1) {
					aux[c]=mat[f][c];                   /*Para crear fila AUX*/
					
				}
		
			}
			
		
		}
		
		
		for(int f=0;f<2;f++) {
			for(int c=0;c<m;c++) {
				if(f==1) {                           /* la 2 iguala a la 1*/
					mat[f][c]=mat[f-1][c];
				}
		
			}
			
		
		}
		
		
		for(int f=0;f<2;f++) {
			for(int c=0;c<m;c++) {
				if(f==1) {                         /*la 1 se hace aux*/
					mat[f-1][c]=aux[c];
				}
			}
			
		
		}
		
		
		for(int f=0;f<n;f++) {
			for(int c=0;c<m;c++) {
				System.out.print(mat[f][c]+" ");  /*Vuelve a printear todo*/
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	public void imprVertices() {
		
		System.out.print(mat[0][0]+" ");
		System.out.println(mat[0][m-1]);
		System.out.print(mat[n-1][0]+" ");
		System.out.println(mat[n-1][m-1]);
		
	}
	
	
	
	
	public static void main(String[]args) {
		Matriz7 mt7= new Matriz7();
		mt7.cargar();
		mt7.cambiar();
		mt7.imprVertices();
		
	}
	
	
	
	
	
}
