
/*Problemas propuestos:
 * 1.Realizar un programa que pida cargar una fecha cualquiera,luego verificar si dicha fecha corresponde a Navidad
 * 2.Se introducen tres valores por teclado, si todos son iguales se imprime la suma del primero con el segundo,
 *  y a este resultado se le multiplica por el tercero.
 * 3.Se introducen por teclado tres numeros, si todos los valores son menores a 10,
 *  imprimir en pantalla la leyenda "Todos los numeros son menores a 10"
 * 4.Se introducen por teclado tres numeros, si al menos uno de los valores no es menor a 10,
 *  imprimir en pantalla la leyenda "Alguno de los valores no es a 10"
 * 5.Escribir un programa que pida introducir la coordenada de un punto en el plano, es decir,dos valores enteros, "x" e "y"
 *   Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto
 *   Primer cuadrante: x<0 e y>0, etc.
 *  6. De un operario se conoce su sueldo y los años de antigüedad.Se pide confeccionar un programa que lea los
 *  datos de entrada e informe:
 *  a)Si el sueldo es inferior a 500 y la antiguedad es igual o superior a 10 años, otorgarle un aumento del 20%,
 *  mostrar el sueldo a pagar.
 *  b)Si el sueldo es inferior a 500 pero su antiguedad es menor a 10 años, aumento de 5%
 *  c)Si el sueldo es mayor o igual a 500 mostrar su sueldo en pantalla, sin cambios.
 *  
 *  7.Escribir un programa en el cual dada una lista de tres valores numéricos distintos se calcule e informe su rango
 *  de variación(valor mayor al menor).
 * 
 * */

package ejer13propuesto;

import java.util.Scanner;

public class Navidad {
	
	public static void main(String[]args) {
		
		System.out.println("1)-------------------------------------------------");
		
		Scanner teclado = new Scanner(System.in);
		
		int dia, mes;
		
		System.out.println("(Formato xx/xx)");
		System.out.println("Introduce el dia: ");
		
		dia=teclado.nextInt();
		
		System.out.println("Introduce el mes: ");
		
		mes=teclado.nextInt();
		
		if (dia==25 && mes==12) {
			System.out.println("FELIZ NAVIDAD");
		}else {
			System.out.println("No es navidad");
		}
		
		System.out.println("2)-------------------------------------------------");
		
		int num1,num2, num3,suma,multi;
		
		System.out.println("Introduce el num1: ");
		num1=teclado.nextInt();
		System.out.println("Introduce el num2: ");
		num2=teclado.nextInt();
		System.out.println("Introduce el num3: ");
		num3=teclado.nextInt();
		
		if(num1==num2 && num2 == num3) {
			
			suma=num1+num2;
			multi=suma*num3;
			
			System.out.println("Los tres numeros son iguales.");
			System.out.println("("+num1+" + "+num2+")"+" * "+num3+" = "+multi);
			
		}else {
			System.out.println("Los numeros no son iguales");
		}
		
		System.out.println("3 y 4)-------------------------------------------------");
		
		System.out.println("Introduce el num1: ");
		num1=teclado.nextInt();
		System.out.println("Introduce el num2: ");
		num2=teclado.nextInt();
		System.out.println("Introduce el num3: ");
		num3=teclado.nextInt();
		
		if (num1<10) {
			if (num2<10) {
				if (num3<10) {
					System.out.println("Todos los numeros son menores a 10");
				}
			}
		}else {
			System.out.println("Algun numero no es menor que 10");
		}
		
		System.out.println("5)-------------------------------------------------");
		
		int ejex,ejey;
		
		System.out.println("Introduce coordenada del eje x: ");
		ejex= teclado.nextInt();
		System.out.println("Introduce coordenada del eje y: ");
		ejey= teclado.nextInt();
		
		if (ejex<=0) {
			if (ejey>=0) {
				System.out.println("Pertenece al cuadrante 1");
			}
		}
		
		if (ejex>=0) {
			if (ejey>=0) {
				System.out.println("Pertenece al cuadrante 2");
			}
		}
		
		if (ejex<=0) {
			if (ejey<=0) {
				System.out.println("Pertenece al cuadrante 3");
			}
		}
		
		if (ejex>=0) {
			if (ejey<=0) {
				System.out.println("Pertenece al cuadrante 2");
			}
		}
		
		System.out.println("6)-------------------------------------------------");
		
		int sueldo,anosantig,nuevosueldo;
		
		System.out.println("Introduce el sueldo del operario: ");
		sueldo=teclado.nextInt();
		System.out.println("Introduce sus años de antigüedad: ");
		anosantig=teclado.nextInt();
		if(sueldo<500) {
			if(anosantig>10) {
				nuevosueldo=sueldo+sueldo*20/100;
				System.out.println("Su nuevo sueldo es: "+nuevosueldo);
			}else {
				nuevosueldo=sueldo+sueldo*5/100;
				
			}
		}else {
			System.out.println("El sueldo "+sueldo+" se queda igual");
		}
		
		System.out.println("7)-------------------------------------------------");
		
		
		int valor1,valor2,valor3,mayor,menor;
		System.out.println("Introduce el valor1: ");
		valor1=teclado.nextInt();
		System.out.println("Introduce el valor2: ");
		valor2=teclado.nextInt();
		System.out.println("Introduce el valor3: ");
		valor3=teclado.nextInt();
		
		if (valor1>valor2&&valor1>valor3) {
			mayor=valor1;
		}else {
			if (valor2>valor1&&valor2>valor3) {
				mayor=valor2;
			}else {
				mayor=valor3;
			}
		}
		
		if (valor1<valor2&&valor1<valor3) {
			menor=valor1;
		}else {
			if (valor2<valor1&&valor2<valor3) {
				menor=valor2;
			}else {
				menor=valor3;
			}
		}
		
		System.out.println("El rango de valores es "+menor+"-"+mayor);
		
		
	}

}










