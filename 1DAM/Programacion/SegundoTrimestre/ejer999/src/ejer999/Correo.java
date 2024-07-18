//Usuario mete correo electronico
//Comprobar que solo tiene una arroba, que no esta ni al inicio ni al final.
//ver cual es el dominio, desde la arroba hasta el final
//Contar cuantas arrobas tiene
//comprobar que no es un palindromo



package ejer999;

import java.util.Scanner;

public class Correo {
	
	protected Scanner teclado;
	protected String correo;
	protected int posArroba;
	
	public Correo() {
		
		teclado= new Scanner(System.in);
		
		
		
		
		
	}
	
	
	void cargar() {
		System.out.println("Introduce el correo: ");
		correo=teclado.nextLine();
		
	}
	
	void comprobar() {
		
		posArroba=correo.indexOf('@');
		
		if(posArroba!=-1&&posArroba!=0 && posArroba!=correo.length()-1) {
			System.out.println("El correo es valido.");
			System.out.println("Su dominio es: "+correo.substring(posArroba+1));
			
		}
		
		
		int cont=0;
		for(int x=0;x<correo.length();x++) {
			
			if(correo.charAt(x)=='@') {
				cont=cont+1;
			}
		}
		
		StringBuilder builder= new StringBuilder(correo);
		String alreves= builder.reverse().toString();
		System.out.println(alreves);
		
		StringBuilder algo= new StringBuilder(correo);
		String otro= algo.reverse().toString();
		
		
		if(alreves.equals(correo)) {
			System.out.println("este correo es un palindromo xd");
		}else {
			System.out.println("Este correo no es un palindromo.");
		}
		
	}
	
	public static void main(String[]args) {
		
		Correo correo1=new Correo();
		correo1.cargar();
		correo1.comprobar();
	}
	

}
