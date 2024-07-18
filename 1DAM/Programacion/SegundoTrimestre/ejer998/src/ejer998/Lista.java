package ejer998;

import java.util.Scanner;

public class Lista {
	protected String correo;
	protected Scanner teclado;
	
	
	public Lista() {
		
		teclado=new Scanner(System.in);
		
		
		
	}
	
	void cargar() {
		
		System.out.println("Introduce el correo electronico: ");
		correo=teclado.nextLine();
		
	}
	
	
	void comprobar() {
		
		StringBuilder builder= new StringBuilder(correo);
		String alreves= builder.reverse().toString();
		System.out.println("El correo al reves es: "+alreves);
		
		
		if(correo.equals(alreves)) {
			System.out.println("Ete correo es un palindromo.");
		}
		
		if(correo.indexOf('@')!=-1 && correo.indexOf('@')>0 && correo.indexOf('@')<correo.length()-1) {
			System.out.println("Este correo es correcto");
		}
		int cont=0;
		
		for(int x =0; x<correo.length();x++) {
			if(correo.charAt(x)=='@') {
				int pos=x;
				cont=cont+1;
				System.out.println("El dominio del correo es: "+correo.substring(pos));
			}
			
		}
		
		if(cont>1) {
			System.out.println("Este correo tiene mas de una arroba");
		}
		
		
		
	}
	
	
	public static void main(String[]args) {
		
		Lista ls= new Lista();
		ls.cargar();
		ls.comprobar();
		
		
	}
	
	
	
	

}
