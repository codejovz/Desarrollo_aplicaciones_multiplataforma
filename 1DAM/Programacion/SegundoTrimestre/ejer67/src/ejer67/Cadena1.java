package ejer67;

import java.util.Scanner;

public class Cadena1 {
	
	public static void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		String cad1,cad2;
		System.out.println("Introduce la primera cadena: ");
		cad1=teclado.nextLine();
		System.out.println("Introduce la segunda cadena: ");
		cad2=teclado.nextLine();
		if(cad1.equals(cad2)==true) {
			System.out.println(cad1+" es exactamente igual a"+cad2);
		}else {
			System.out.println(cad1+" no es exactamente igual a "+cad2);
		}
		
		if(cad1.equalsIgnoreCase(cad2)==true) {
			System.out.println(cad1+" es exactamente igual a "+cad2+" sin tener en cuenta las mayusculas.");
		}else {
			System.out.println(cad1+" no es igual a "+cad2+" sin tener en cuenta las mayusculas.");
		}
		
		if(cad1.compareTo(cad2)==0) {
			System.out.println(cad1+" es exactamente igual a "+cad2+" alfabeticamente.");
		}else if(cad1.compareTo(cad2)>0){
			System.out.println(cad1+" es mayor a "+cad2+" alfabeticamente.");
		}else {
			System.out.println(cad1+" es menor alfabeticamente que "+cad2);
		}
		
		char carac1=cad1.charAt(0);
			System.out.println("El primer caracter de "+cad1+" es "+carac1);
		int largo=cad1.length();
		System.out.println("La cadena "+cad1+" tiene "+largo+" caracteres.");
		String cad3=cad1.substring(0,3);
		System.out.println("Los tres primeros caracteres de "+carac1+" son "+cad3);
		int posi=cad1.indexOf(cad2);
		if(posi==1) {
			System.out.println(cad2+" no esta contenido en "+cad1);
		}else {
			System.out.println(cad2+" está contenido a partir de la posicion "+posi);
		}
		System.out.println(cad1+" convertido a mayusculas es "+cad1.toUpperCase());
		System.out.println(cad1+" convertido a minusculas es "+cad1.toLowerCase());
		
		
	}

}
