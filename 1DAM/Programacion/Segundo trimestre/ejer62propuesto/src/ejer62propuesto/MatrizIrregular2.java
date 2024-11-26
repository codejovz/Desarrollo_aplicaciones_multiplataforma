package ejer62propuesto;

import java.util.Scanner;

public class MatrizIrregular2 {
	Scanner teclado= new Scanner(System.in);
	int matriz[][];

	
	public void cargar() {
		
		 teclado=new Scanner(System.in);
		 matriz=new int[6][];
		 for(int f=0;f<matriz.length;f++) {
			 matriz[f]=new int[f];            
			 	for(int c=0;c<f;c++) {
			 		System.out.print("Introduce componente:");
			 		matriz[f][c]=teclado.nextInt();
			 	}
		 	}
	}
	
	
	public void imprimir() {
		
		for(int f=0; f<matriz.length; f++) {
			for(int c=0; c<f; c++) {
				System.out.print(matriz[f][c]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	String nombres[];
	int faltas[];
	int num;
	public void cargar2() {
		
		nombres=new String[1];
		
		for(int f=0; f<nombres.length;f++) {
			System.out.println("Como se llama? ");
			nombres[f]=teclado.next();
			System.out.println("Cuantos dias ha faltado "+nombres[f]+"? ");
			num=teclado.nextInt();
			faltas=new int[num];
			for(int c=0; c<num; c++) {
				System.out.println("Que dia era?");
				faltas[c]=teclado.nextInt();
			}
		}
		
		
		
	}
	
	 public void imprimir2() {
		

		
		for(int f=0; f<nombres.length;f++) {
			
			
			System.out.print(nombres[f]+" ha faltado: ");
			for(int c=0;c<faltas.length;c++) {
				System.out.println(faltas[c]);
			}
			

	
		}
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[]args) {
		
		MatrizIrregular2 mtz= new MatrizIrregular2();
		/*System.out.println("1)------------------------------------------------");
		mtz.cargar();
		mtz.imprimir();*/
		System.out.println("2)------------------------------------------------");
		mtz.cargar2();
		mtz.imprimir2();
		
		
	}
	
	
	
	
	
	
	
	

}
