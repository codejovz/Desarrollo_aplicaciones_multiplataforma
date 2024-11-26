package ejer27;

import java.util.Scanner;

public class EstructuraRepetitivaDoWhile3 {
	
	public static void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int cant1=0,cant2=0,cant3=0,suma;
		float peso;
		do {
			System.out.println("Introduce el peso de la pieza(0finaliza)");
			peso=teclado.nextFloat();
			
			if(peso>10.2) {
				cant1=cant1+1;
			}else if(peso>=9.8) {
				cant2=cant2+1;
			}else if(peso>0){
				cant3=cant3+1;
			}
			
		}while(peso!=0);
		
		suma=cant1+cant2+cant3;
		System.out.println("Piezas aptas: "+cant2);
		System.out.println("Superior a 10.2:"+cant1);
		System.out.println("Inferior a 9.8:"+cant3);
	}
		
		
  
}
