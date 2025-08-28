package ejer60mio;

import java.util.Scanner;

public class Matriz11 {
	protected Scanner teclado;
	protected int temperaturas[][];
	protected String pais[];
	public int medias[];
	public Matriz11() {
		
		teclado= new Scanner(System.in);
		pais=new String[4];
		temperaturas=new int[4][2];
		medias=new int[4];
		
		
		for(int f =0; f<4;f++) {
			System.out.println("Introduce el pais: ");
			pais[f]=teclado.next();
			for(int c=0; c<2 ;c++) {
				System.out.println("Introduce sus temperaturas: ");
				temperaturas[f][c]=teclado.nextInt();
				
			}
			
		}
		
		
	}
	
	
	public  void imprimir() {
		
		for(int f=0; f<4;f++) {
			System.out.print(pais[f]+" ");
			for(int c=0;c<2;c++) {
				System.out.print(temperaturas[f][c]+" ");
			}System.out.println();
		}
		
		
		
		
	}
	
	public void medias() {
		
		for(int f=0;f<4;f++) {
			int suma=0;
			for(int c=0;c<2;c++) {
				
				suma=suma+temperaturas[f][c];
				
			}
			medias[f]=suma/2;
		}
		
		
	}
	
	
public  void imprimirMedias() {
		
		for(int f=0; f<4;f++) {
			System.out.print(pais[f]+" ");
			for(int c=0;c<2;c++) {
				System.out.print(temperaturas[f][c]+" ");
			}System.out.println(medias[f]);
		}
		
		
		
		
	}
	
	
	
	public static void main(String[]args) {
		
		Matriz11 mtz11= new Matriz11();
		mtz11.imprimir();
		mtz11.medias();
		mtz11.imprimirMedias();
	}
	
	
	

}
