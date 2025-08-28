package ejer8;

import java.util.Scanner;



public class ProblemasPropuestos {
	
	public static void main(String[]args) {
		
		System.out.println("1)------------------------------------");
		
		
		Scanner teclado=new Scanner(System.in);
		
		int num1,num2,suma,diferencia,producto,division;
		
		System.out.println("Introduce dos numeros: ");
		num1=teclado.nextInt();
		num2=teclado.nextInt();
		suma=num1+num2;
		diferencia=num1-num2;
		producto=num1*num2;
		division=num1/num2;
		
		
		if (num1>num2) {
			System.out.print("Su suma es: "+suma);
			System.out.println("Y su diferencia es: "+diferencia);
			
		}else {
			
			System.out.println("Su producto es: "+producto);
			System.out.println("Su division es: "+division);
			
		}
		
		System.out.println("2)------------------------------------");
		
		int nota1,nota2,nota3,promedio;
		
		System.out.println("Introduce tres notas del alumno: ");
		nota1=teclado.nextInt();
		nota2=teclado.nextInt();
		nota3=teclado.nextInt();
		promedio=(nota1+nota2+nota3)/3;
		if(promedio>=7) {
			
			System.out.println("Promocionado");
			
		}else {
			System.out.println("Repites por flipao");
		}
		
		System.out.println("3)------------------------------------");
		
		int num;
		
		System.out.println("Introduce un numero de uno o dos digitos: ");
		
		num=teclado.nextInt();
		
		if (num<9){
			
			System.out.println("El numero tiene una cifra");
			
		}else {
			
			System.out.println("El numero tiene una cifra");
		} 
		
		if (num<0) {
			System.out.println("Error, tiene que ser positivo");
		}
		
		if(num>99) {
			System.out.println("Error, tiene que ser menor de 99");
		}
		
		
		
	}
	

}
