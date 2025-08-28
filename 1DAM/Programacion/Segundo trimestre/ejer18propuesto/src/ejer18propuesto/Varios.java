package ejer18propuesto;

import java.util.Scanner;

public class Varios {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1)--------------------------------------------");
		System.out.println("Numero de notas>=7");
		int nota, acum=0,x=0;
		
		while (x<10) {
			System.out.println("Introduce una nota: ");
			nota=teclado.nextInt();
			if(nota>=7) {
				acum=acum+1;
			}
			x=x+1;
		}
		System.out.println("El numero de notas >=7 es: "+acum);
		acum=0;
		
		System.out.println("2)--------------------------------------------");
		
		x=0;
		float suma=0,y,media,altura;
		
		System.out.println("De cuantas personas quieres saber la media?: ");
		y=teclado.nextFloat();
		
		while(x<y) {
			
			System.out.println("Introduce una altura: ");
			altura=teclado.nextFloat();
			suma=suma+altura;
			x=x+1;
		}
		
		media=suma/y;
		x=0;
		y=0;
		System.out.println("La media de las alturas es: "+media);
		
		System.out.println("3)--------------------------------------------");
		
		int numEmp;
		System.out.println("Introduce el numero de empleados: ");
		numEmp=teclado.nextInt();
		int sueldo,entre,mas,total;
		entre=0;
		mas=0;
		total=0;
		while(x<numEmp) {
			
			System.out.println("Introduce el sueldo de un empleado: ");
			sueldo=teclado.nextInt();
			total=total+sueldo;
			if (sueldo>=100&& sueldo<=300) {
				entre=entre+1;
			}else if(sueldo>300) {
				mas=mas+1;
			}
			
			x=x+1;
		}
		System.out.println("Entre 100 y 300: "+entre);
		System.out.println("Mas: "+mas);
		System.out.println("La empresa se gasta en total: "+total);
		
		System.out.println("4)--------------------------------------------");
		int multi=11;
		acum=0;
		
		while (acum<25) {
			System.out.println(multi);
			multi=multi*2;
			
			acum=acum+1;
		}
		
		System.out.println("5)--------------------------------------------");
		
		multi=8;
		System.out.println("Multiplos del 8 hasta el 500:");
		
		while (multi<=500){
			System.out.println(multi);
			multi=multi+8;
		}
		
		System.out.println("6)--------------------------------------------");
		
		x=0;
		int lista1=0,lista2=0, valor;
		
		while(x<15) {
			
			System.out.println("Introduce un valor a la lista1: ");
			valor=teclado.nextInt();
			lista1=lista1+valor;
			x=x+1;
		}
		x=0;
		
		while(x<15) {
			
			System.out.println("Introduce un valor a la lista2: ");
			valor=teclado.nextInt();
			lista2=lista2+valor;
			x=x+1;
			
		}
		
		if (lista1>lista2) {
			System.out.println("La lista 1 es mayor");
		}else if(lista2>lista1) {
			System.out.println("La lista2 es mayor");
		}else {
			System.out.println("Las dos listas son iguales");
		}
		
		
		System.out.println("7)--------------------------------------------");
		
		x=0;
		int max=0,pares=0,impares=0;
		valor=0;
		System.out.println("Cuantos valores quieres ver si son pares o inpares?");
		max=teclado.nextInt();
		while(x<max) {
			System.out.println("Introduce un valor: ");
			valor=teclado.nextInt();
			if (valor%2==0) {
				pares=pares+1;
				
			}else {
				impares=impares+1;
			}
			x=x+1;
			
		}
		
		System.out.println("Los valores pares son "+pares+" y los impares "+impares);
		
	}

}
