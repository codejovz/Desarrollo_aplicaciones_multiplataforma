/*PROBLEMAS PROPUESTOS*/
/*1)Se cargan por teclado tres num distintos.Mostrar el mayor.*/
/*2)Se introduce por teclado un valor entero, mostrar una leyenda que indique si el numero es positivo, nulo o negativo*/

/*3)Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras 
 * y muestre un mensaje indicando si tiene 1, 2 o 3 cifras.
 * Mostrar un mensaje de error si el numero de cifras es mayor*/
/*4)Un postulante a un empleo realiza un test de capacitación, se obtuvo la siguiente info:
 * total de preguntas del examen  y total de respuestas correctas
 * Muestra el nivel sabiendo que:*/
/*Nivel máximo>=90%
 * Nivel medio>=75%
 * Nivel regular>=50%
 * Fuera de nivel <50%*/



package ejer10propuesto;

import java.util.Scanner;

public class MayorMenor {
	
	public static void main(String[]args) {
		
		
		Scanner teclado=new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("Introduce num1: ");
		num1=teclado.nextInt();
		System.out.println("Introduce num2: ");
		num2=teclado.nextInt();
		System.out.println("Introduce num3: ");
		num3=teclado.nextInt();
		
		
		if (num1>num2) {
			if (num1>num3) {
				
				System.out.println("El primer numero es mayor");
			}
		}else {
			if(num2>num3) {
				
					System.out.println("El segundo numero es mayor");
				
			}else {
				System.out.println("El tercer numero es mayor");
			}
		}
		
		
		System.out.println("2)------------------------------------");
		
		int valor;
		
		System.out.println("Introduce un valor");
		valor=teclado.nextInt();
		
		if (valor>0) {
			System.out.println("El valor es positivo");
		}else {
			if(valor==0) {
				System.out.println("El valor es nulo");
			}else {
				if(valor<0) {
					System.out.println("El valor es negativo");
				}
			}
		}
		
		System.out.println("3)------------------------------------");
		
		int nume;
		
		System.out.println("Introduce un numero positivo de hasta tres cifras: ");
		nume=teclado.nextInt();
		
		if(nume<0) {
			System.out.println("He dicho que positivo, coño");
		}else {
			
			if(nume<10) {
				System.out.println("El numero tiene una cifra");
			}else {
				if(nume<100) {
					System.out.println("El numero tiene dos cifras");
				}else {
					if(nume<1000) {
						System.out.println("El numero tiene tres cifras");
					}else {
						System.out.println("Te he dicho que menos de tres cifras, coño");
					}
				}
			}
			
			
		}
		
		
		System.out.println("4)------------------------------------");
		
		double pregNum,pregCorrectas,media;
		
		System.out.println("Cuantas preguntas habia?");
		pregNum=teclado.nextInt();
		System.out.println("Cuantas contestaste correctamente? ");
		pregCorrectas=teclado.nextInt();
		media=pregNum/pregCorrectas;
		if (media>=9) {
			System.out.println("Nivel máximo");	
		}else {
			if (media>=7.5) {
				System.out.println("Nivel medio");
			}else {
				if (media>=5) {
					System.out.println("Nivel regular");
				}else {
					System.out.println("Fuera de nivel");
				}
			}
		}
		
		
		
		
	}

	}
