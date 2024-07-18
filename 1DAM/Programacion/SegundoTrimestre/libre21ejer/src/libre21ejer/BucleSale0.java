package libre21ejer;

import java.util.Scanner;

public class BucleSale0 {
	
	public static void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int num=1;
		
		while(num!=0) {
			
			System.out.println("Introduce un numero(El 0 saca del programa): ");
			num=teclado.nextInt();
			
			if (num!=0) {
				
				if(num%2==0) {
					System.out.println("Es par");
				}else {
					System.out.println("No es par");
				}
				
				if (num>0) {
					System.out.println("Es positivo");
				}else {
					System.out.println("Es negativo");
				}
				
				System.out.println("Su cuadrado es: "+num*num);
				
				
				
			}
			
			
		}
		
		System.out.println("Gracias por usar el programa!");
	}

}
