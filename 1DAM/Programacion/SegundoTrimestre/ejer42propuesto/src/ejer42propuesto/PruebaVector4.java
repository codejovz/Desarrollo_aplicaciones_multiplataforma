package ejer42propuesto;

import java.util.Scanner;

public class PruebaVector4 {
	
	
	Scanner teclado=new Scanner(System.in);
	private int[]elementos;
	int sumatotal=0;
	int sumamay36=0;
	private int[]primero;
	private int[]segundo;
	private int[]tercero;
	private int[]cursoA;
	private int[]cursoB;
	
	
	
	
	public void cargar_1() {
		
		for(int x=0;x<8;x++) {
			elementos=new int[8];
			System.out.println("Introduce un elemento al vector: ");
			elementos[x]=teclado.nextInt();
		}
	}
				
	public void sumar_1() {
		for(int x=0;x<8;x++) {
			sumatotal=sumatotal+elementos[x];
		}
		System.out.println("La suma total da: "+sumatotal);
		
	}
	
	public void sumar36_1() {
		for(int x=0;x<8;x++) {
			if(elementos[x]>36) {
				sumamay36=sumamay36+elementos[x];
			}
		}
		System.out.println("La suma de los mayores a 36 da: "+sumamay36);
	}
	
	public void cant50_1() {
		int cont=0;
		for(int x=0;x<8;x++) {
			if(elementos[x]>50) {
				cont=cont+1;
			}
		}
		System.out.println("La cantidad de elementos mayores de 50 es: "+cont);
	}
	
	public void cargar_2() {
		
		 primero=new int[4];
		 segundo=new int[4];
		 
		 for(int x=0; x<4;x++) {
			 System.out.println("Introduce un elemento al vector1: ");
			 primero[x]=teclado.nextInt();
		 }
		 
		 for(int x=0; x<4;x++) {
			 System.out.println("Introduce un elemento al vector2: ");
			 segundo[x]=teclado.nextInt();
		 }
		
	}
	
	
	
	public void sumar_2() {
		tercero=new int[4];
		int suma=0;
		for(int x=0;x<4;x++) {
			suma=suma+primero[x];
			suma=suma+segundo[x];
			tercero[x]=suma;
			suma=0;
			
		}
		System.out.println("El tercer vector es: ");
		for(int x=0;x<4;x++) {
			System.out.print(tercero[x]+" , ");
		}
	}
	
	public void cargar_3() {
		cursoA=new int[5];
		cursoB=new int[5];
		int sumaA=0;
		int sumaB=0;
		int promedioA;
		int promedioB;
		
		for(int x=0;x<5;x++) {
			System.out.println("Introduce una nota al cursoA:");
			cursoA[x]=teclado.nextInt();
		}
		
		for(int x=0;x<5;x++) {
			System.out.println("Introduce una nota al cursoB:");
			cursoB[x]=teclado.nextInt();
		}
		
		
		for(int x=0;x<5;x++) {
			sumaA=sumaA+cursoA[x];
			sumaB=sumaB+cursoB[x];
		}
		
		if(sumaA!=0&&sumaB!=0) {
			promedioA=sumaA/5;
			promedioB=sumaB/5;
			if(promedioA>promedioB) {
				System.out.println("El curso A obtuvo un promedio mayor: "+promedioA+" > "+promedioB);
			}else {
				System.out.println("El curso B obtuvo un promedio mayor: "+promedioB+" > "+promedioA);
			}
		}
		
		
		
		
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[]args) {
		
		PruebaVector4 pv4= new PruebaVector4();
		System.out.println("1)-----------------------------------");
		pv4.cargar_1();
		pv4.sumar36_1();
		pv4.cant50_1();
		/*-----------------------*/
		System.out.println("2)-----------------------------------");
		pv4.cargar_2();
		pv4.sumar_2();
		/*-----------------------*/
		System.out.println("3)-----------------------------------");
		pv4.cargar_3();
		/*-----------------------*/
		System.out.println("4)-----------------------------------");
		
	}
	
	
	
	
	
	
}
