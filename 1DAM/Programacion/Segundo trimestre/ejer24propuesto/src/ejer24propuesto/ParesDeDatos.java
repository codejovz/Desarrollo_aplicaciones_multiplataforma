package ejer24propuesto;

import java.util.Scanner;



public class ParesDeDatos {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1)-------------------------------------------------------------");
		
		int n,x,altura,base,superficie,cantidad=0;
		
		System.out.println("Introduce cuantos pares de datos quieres: ");
		
		n=teclado.nextInt();
		
		for(x=0; x<n;x++) {
			
			System.out.println("Introduce la base del "+x+" triangulo: ");
			base=teclado.nextInt();
			System.out.println("Introduce la altura del "+x+" triangulo: ");
			altura=teclado.nextInt();
			superficie=base*altura/2;
			System.out.println("La base es "+base+", la altura es "+altura+" y la superficie es "+superficie);
			if (superficie>12) {
				cantidad=cantidad+1;
			}
			
			
		}
		System.out.println("La cantidad de triangulos con superficie >12 es: "+cantidad);
		
		System.out.println("2)-------------------------------------------------------------");
		
		x=0;
		int suma=0,valor;
		for(x=0; x<10; x++) {
			
			System.out.println("Introduce un valor: ");
			valor=teclado.nextInt();
			if (x>5) {
				suma=suma+valor;
			}
			
		}
		
		System.out.println("La suma de los ultimos 5 numeros es: "+suma);
		
		
		System.out.println("3)-------------------------------------------------------------");
		x=0;
		System.out.println("Tabla de multiplicar del 5: ");
		
		int num5=5;
		for(x=0; x<10;x++) {
			
			System.out.println(num5);
			num5=num5+5;
			
			
		}
		
		System.out.println("4)-------------------------------------------------------------");
		
		x=0;
		
		System.out.println("Introduce un termino y doy multi hasta el 12: ");
		valor=teclado.nextInt();
		
		for(x = 0;x < 12; x++) {
			System.out.println(valor);
			valor=valor+valor;
			
		}
		
		System.out.println("5)-------------------------------------------------------------");
		int equilateros = 0,isosceles = 0, escalenos=0, lado1 ,lado2 ,lado3 ;
		System.out.println("Cuantos triangulos quieres mirar? ");
		n=teclado.nextInt();
		
		for(x=0;x<n;x++) {
			System.out.println("Introduce su lado1: ");
			lado1=teclado.nextInt();
			System.out.println("Introduce su lado2: ");
			lado2=teclado.nextInt();
			System.out.println("Introduce su lado3: ");
			lado3=teclado.nextInt();
		
			if(lado1==lado2&&lado1==lado3) {
				System.out.println("Este triangulo es equilatero.");
				equilateros = equilateros + 1;
				
			}else if(lado1 != lado2 && lado2 != lado3) {
				System.out.println("Este triangulo es escaleno.");
				escalenos=escalenos+1;
			}else if(lado1 == lado2 || lado2 == lado3) {
				System.out.println("Este triangulo es isosceles");
				isosceles = isosceles + 1;
			}
			
		}
		
		System.out.print("El tipo de triangulo que tiene menos es: ");
		
		if (equilateros<isosceles&&equilateros<escalenos) {
			
			System.out.println("EQUILATERO");
		}else if(isosceles<equilateros&&isosceles<escalenos) {
			
			System.out.println("ISOSCELES");
		}else {
			System.out.println("ESCALENOS");
		}
		
		System.out.println("6)-------------------------------------------------------------");
		
		x=0;
		int y=0,i=0,primer=0,segun=0,tercer=0,cuar=0;
		
		System.out.println("Cuantos puntos quieres ingresar?");
		n=teclado.nextInt();
		
		for (i=0;i<n;i++) {
			
			System.out.println("Introduce la coordenada X: ");
			x=teclado.nextInt();
			
			System.out.println("Introduce la coordenada Y");
			y=teclado.nextInt();
			
			if (x<0&&y>0) {
				System.out.println("Pertenece al primer cuadrante.");
				primer=primer+1;
			}else if(x>0&&y>0) {
				System.out.println("Pertenece al segundo cuadrante.");
				segun=segun+1;
			}else if(x<0&&y<0) {
				System.out.println("Pertenece al tercer cuadrante.");
				tercer=tercer+1;
			}else if(x>0&&y<0) {
				System.out.println("Pertenece al cuarto cuadrante.");
				cuar=cuar+1;
			}
				
		}
		
		System.out.println("Hay "+primer+" coordenadas en el primer cuadrante.");
		System.out.println("Hay "+segun+" coordenadas en el segundo cuadrante.");
		System.out.println("Hay "+tercer+" coordenadas en el tercer cuadrante.");
		System.out.println("Hay "+cuar+" coordenadas en el cuarto cuadrante.");
		
		System.out.println("7)-------------------------------------------------------------");
		
		int posi=0,nega=0,mul15=0,sumapares=0;
		
		for (x=0;x<10;x++) {
			System.out.println("Introduce un valor, hasta 10 valores: ");
			valor=teclado.nextInt();
			
			if(valor>=0) {
				posi=posi+1;
			}else {
				nega=nega+1;
			}
			
			if (valor%15==0) {
				mul15=mul15+1;
			}
			
			if (valor%2==0) {
				sumapares=sumapares+valor;
			}
		}
		
		System.out.println("Numeros positivos: "+posi+",numeros negativos: "+nega+",numeros multip de 15: "+mul15);
		System.out.println("Y la suma de los numeros pares da: "+sumapares);
		
		System.out.println("8)-------------------------------------------------------------");
		
		int man,tar,noc,sumaman=0,sumatar=0,sumanoc=0,promman,promtar,promnoc;
		suma=0;
		
		for (x=1;x<=2;x++) {
			
			System.out.println("Introduce la edad del estudiante "+x+" de mañana:");			
			man=teclado.nextInt();
			sumaman=sumaman+man;
		}
		promman=sumaman/2;
		
		for (x=1;x<=3;x++) {
			System.out.println("Introduce la edad del estudiante "+x+" de tarde:");
			tar=teclado.nextInt();
			sumatar=sumatar+tar;	
		}
		
		promtar=sumatar/3;
		
		for (x=1; x<=3; x++) {
			System.out.println("Introduce la edad del estudiante "+x+" de noche:");
			noc=teclado.nextInt();
			sumanoc=sumanoc+noc;
		}
		
		promnoc=sumanoc/3;
		
		System.out.println("El promedio del turno de dia es: "+promman);
		System.out.println("El promedio del turno de tarde es: "+promtar);
		System.out.println("El promedio de turno de noche es: "+promnoc);
		
		if (promman>promtar && promman>promnoc) {
			System.out.println("El promedio de mañana es mayor");
		}else if(promtar>promman && promtar>promnoc) {
			
			System.out.println("El promedio de tarde es mayor");
		}else {
			System.out.println("El promedio de noche es mayor");
		}
		
	}

}
