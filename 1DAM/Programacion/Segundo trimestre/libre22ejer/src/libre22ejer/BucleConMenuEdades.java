package libre22ejer;

import java.util.Scanner;

public class BucleConMenuEdades {
	
	public static void main(String[]args) {
		
		int edad=1,suma=0,media,cant=0,may=0;
		
		Scanner teclado = new Scanner(System.in);
		
		while(edad>=0) {
			
			System.out.println("Introduce una edad(negativo saca:");
			edad=teclado.nextInt();
			
			if (edad>=0) {
				suma=suma+edad;
				cant=cant+1;
				if(edad>=18) {
					may=may+1;
				}
			}
			
			
			
		}
		
		if(cant>0) {
			System.out.println("La suma de edades es: "+suma);
			System.out.println("La cantidad de edades es: "+cant);
			System.out.println("La media de edades es: "+suma/cant);
			System.out.println("Y la cantidad de mayores de edad es: "+may);
			
		}
		
		System.out.println("Gracias por usar el programa!");
		
	}

}
