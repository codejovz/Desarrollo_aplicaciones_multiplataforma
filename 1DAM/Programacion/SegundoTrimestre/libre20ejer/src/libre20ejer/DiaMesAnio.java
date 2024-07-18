package libre20ejer;

import java.util.Scanner;

public class DiaMesAnio {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		int dia,mes,anio,dia2,mes2,anio2;
		
		System.out.println("Introduce dia: ");
		dia=teclado.nextInt();
		System.out.println("Introduce mes: ");
		mes=teclado.nextInt();
		System.out.println("Introduce el año: ");
		anio=teclado.nextInt();
		
		System.out.println("Tu fecha es: ["+dia+"/"+mes+"/"+anio+"]");
		
		dia2=dia+1;
		mes2=mes;
		anio2=anio;
		
		if(dia2>31) {
			dia2=1;
			mes2++;
		}
		if(mes2>12) {
			mes2=1;
			anio2++;
		}
		
		if (anio2==0) {
			anio2=1;
		}
		
		System.out.println("Dia siguiente: ["+dia2+"/"+mes2+"/"+anio2+"]");
		
	}

}
