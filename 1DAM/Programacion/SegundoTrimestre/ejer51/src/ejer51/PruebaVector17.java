package ejer51;

import java.util.Scanner;


public class PruebaVector17 {
	
	private Scanner teclado;
	private String[]paises;
	private int[]habitantes;
	
	public void cargar() {
		
		teclado= new Scanner(System.in);
		paises=new String[5];
		habitantes= new int[5];
		System.out.println("Carga de paises y habitantes: ");
		for(int f=0;f<paises.length;f++) {
			System.out.println("Introduce el nombre del pais: ");
			paises[f]=teclado.next();
			System.out.println("Introduce sus habitantes: ");
			habitantes[f]=teclado.nextInt();
			teclado.nextLine();
		}
	}
	
	public void ordenarCant() {
		
		for(int k=0;k<habitantes.length-1;k++) {
			 for(int f=0;f<habitantes.length-1-k;f++) {
				 if (habitantes[f]<habitantes[f+1]) {
					 int auxnota;
					 auxnota=habitantes[f];
					 habitantes[f]=habitantes[f+1];
					 habitantes[f+1]=auxnota;
					 String auxnombre;
					 auxnombre=paises[f];
					 paises[f]=paises[f+1];
					 paises[f+1]=auxnombre;
				 }
			 }
		}
	}
	
	public void ordenarAlf() {
		
		for(int k=0;k<paises.length-1;k++) {
			 for(int f=0;f<paises.length-1-k;f++) {
				 if (paises[f].compareTo(paises[f+1])>0) {
					 String auxpais;
					 auxpais=paises[f];
					 paises[f]=paises[f+1];
					 paises[f+1]=auxpais;
					 int auxcant;
					 auxcant=habitantes[f];
					 habitantes[f]=habitantes[f+1];
					 habitantes[f+1]=auxcant;
				 }
			 }
		}
		
		
	}
	
	public void imprimir() {
		 for(int f=0;f<habitantes.length;f++) {
			 System.out.println(paises[f] + " - " + habitantes[f]);
		 }
	}
	
	public static void main(String[] ar) {
		 PruebaVector17 pv17=new PruebaVector17();
		 pv17.cargar();
		 System.out.println("Nombres de paises y habitantes alfabeticamente");
		 pv17.ordenarAlf();
		 pv17.imprimir();
		 System.out.println("Nombres de paises y habitantes por cant");
		 pv17.ordenarCant();
		 pv17.imprimir();
		 
	}  
		
}
