package ejer60propuesto;

import java.util.Scanner;

public class Matriz10 {
	
	private Scanner teclado;
	private String[] paises;
	private int[][] temperaturas;
	private int[]medias;
	
	public void cargar() {
		teclado= new Scanner(System.in);
		paises=new String[4];
		temperaturas=new int[4][3];
		
		for(int f=0; f<paises.length;f++) {
			System.out.println("Introduce el nombre del pais: ");
			paises[f]=teclado.next();
			for(int c=0; c<temperaturas[f].length ;c++) {
				System.out.println("Introduce su temperatura "+c+": ");
				temperaturas[f][c]=teclado.nextInt();
			}
		}
		
	}
	
	public void imprimir() {
		for(int f=0; f<paises.length;f++) {
			System.out.print(paises[f]+": ");
			for(int c=0; c<temperaturas[f].length ;c++) {
				System.out.print(temperaturas[f][c]+"  ,");
			}
			System.out.println();
		}
		
		
	}
	
	
	
	
	public void calcularMedia() {
		medias=new int[4];
		for(int f=0; f<paises.length; f++) {
			int suma=0;
			
			for(int c=0; c<temperaturas[f].length; c++) {
				suma=suma+temperaturas[f][c];
			}
			int media=suma/3;
			medias[f]=media;
		}
	}
	
	public void imprimirMedias() {
		
		for(int f=0; f<paises.length;f++) {
			System.out.print("Media de: "+paises[f]+"= ");
			for(int c=0; c<temperaturas[f].length ;c++) {
				
			}
			System.out.print(medias[f]);
			System.out.println();
		}
		
	}
	
	public void imprimirMayor() {
		
		int posMayF=0;
		int posMayC=0;
		
		for(int f =0; f<paises.length;f++) {
			for(int c=0; c<temperaturas[f].length;c++) {
				
				if(temperaturas[f][c]>temperaturas[posMayF][posMayC]) {
					posMayF=f;
					posMayC=c;
				}
				
			}
		}
		System.out.println(paises[posMayF]);
		
	}
	
	
	public static void main(String[]args) {
		Matriz10 ma10= new Matriz10();
		System.out.println("A)---------------------------------------");
		ma10.cargar();
		System.out.println("B)---------------------------------------");
		ma10.imprimir();
		System.out.println("C)---------------------------------------");
		ma10.calcularMedia();
		System.out.println("D)---------------------------------------");
		ma10.imprimirMedias();
		System.out.println("E)---------------------------------------");
		ma10.imprimirMayor();
	}

}
