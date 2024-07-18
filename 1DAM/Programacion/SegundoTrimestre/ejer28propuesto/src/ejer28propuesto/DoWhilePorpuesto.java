package ejer28propuesto;

import java.util.Scanner;

public class DoWhilePorpuesto {
	
	public static void main(String[]args) {
		int valor,suma=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1)------------------------------------------------------------");
		
		
		do {
			
			System.out.println("Introduce un valor(9999 finaliza):");
			valor=teclado.nextInt();
			if(valor!=9999) {
				suma=suma+valor;
			}
			
		}while(valor!=9999);
		
		System.out.println("La suma es: " + suma);
		
		System.out.println("2)------------------------------------------------------------");
		
		int numcuent,saldo,sumaac = 0 ,sumatot=0;
		
		do {
			
			System.out.println("Introduce numero de cuenta(0 finaliza)");
			numcuent=teclado.nextInt();
			if(numcuent != 0) {
				System.out.println("Introduce su saldo: ");
				saldo=teclado.nextInt();
				sumatot=sumatot+saldo;
				System.out.println("[Numero de cuenta: " + numcuent + "]");
				System.out.println("[Saldo: "+saldo+"]");
				if(saldo>0) {
					System.out.println("[Estado de la cuenta: Acreedor]");
					sumaac = sumaac + saldo;
				}else if(saldo == 0) {
					
					System.out.println("[Estado de la cuenta: Nulo]");
				}else{
					System.out.println("[Estado de la cuenta: Deudor.]");
				}
				
			}
				
			
		}while(numcuent!=0);
		
		if(sumaac!=0) {
			System.out.println("La suma de saldos de los acreedores es de: "+sumaac);
			System.out.println("La suma total es: "+sumatot);
		}
		
		System.out.println("Gracias por usar el programa!");
		
		
		
		
		
		
	}

}
