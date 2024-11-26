package ejer5;

import java.util.Scanner;



public class Cuadrado {
	public static void main(String[]args) {
		
		System.out.println("1)-------------------------------------");
		
		Scanner teclado= new Scanner(System.in);
		int lado, perimetro;
		
		System.out.print("Introduce el lado del cuadrado: ");
		lado=teclado.nextInt();
		perimetro=lado*4;
		System.out.println("El perimetro del cuadrado es: "+perimetro);
		
		System.out.println("2)-------------------------------------");
		int num1, num2,num3,num4,suma,producto;
		System.out.print("Introduce cuatro numeros: ");
		num1=teclado.nextInt();
		num2=teclado.nextInt();
		num3=teclado.nextInt();
		num4=teclado.nextInt();
		suma=num1+num2;
		producto=num3*num4;
		System.out.println("La suma de los dos primeros da: "+suma);
		System.out.println("Y el producto del 3 y 4 da: "+producto);
		
		System.out.println("3)-------------------------------------");
		int val1,val2,val3,val4,promedio;
		System.out.print("Introduce 4 valores: ");
		val1=teclado.nextInt();
		val2=teclado.nextInt();
		val3=teclado.nextInt();
		val4=teclado.nextInt();
		suma=val1+val2+val3+val4;
		promedio=(val1+val2+val3+val4)/4;
		System.out.println("La suma de los 4 da: "+suma);
		System.out.println("Y el promedio da: "+promedio);
		
		System.out.println("4)-------------------------------------");
		int precio,cant,tot;
		System.out.print("Introduce el precio de una manzana: ");
		precio=teclado.nextInt();
		System.out.println("Introduce cuantas compras: ");
		cant=teclado.nextInt();
		tot=precio*cant;
		System.out.println("Coste total: "+tot);	
		teclado.close();
		
		
	}

}
