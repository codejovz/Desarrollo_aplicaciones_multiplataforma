package libre10ejer;

import java.util.Scanner;

public class CasiCero {
	
	public static void main(String[]args) {
		int cond1=0,cond2=0;
		
		double num;
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num=teclado.nextDouble();
		
		if (num-1<0 && num-1<-1) {
			
			cond1=1;
		}
		
		if (num+1>0 && num+1<2) {
			cond2=1;
		}
		
		if (cond1==1 || cond2==1) {
			
			System.out.println("Ese numero es casiCero!!");
		}
		
		
	}
	
	
	

}
