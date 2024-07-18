package ejer36;

import java.util.Scanner;

public class Operaciones {

	int val1,val2;
	
	Scanner teclado= new Scanner(System.in);
	
	public void Inicializar() {
		System.out.println("Introduce el Valor1: ");
		val1=teclado.nextInt();
		System.out.println("Introduce el Valor2: ");
		val2=teclado.nextInt();
		
		
	}
	
	public void Suma() {
		int suma;
		suma=val1+val2;
		System.out.println(val1+" + "+val2+" = "+suma);
		
	}
	
	public void Resta() {
		int resta;
		resta=val1-val2;
		System.out.println(val1+" - "+val2+" = "+resta);
	}
	
	public void Multiplicacion() {
		int multiplicacion;
		multiplicacion=val1*val2;
		System.out.println(val1+" * "+val2+" = "+multiplicacion);
	}
	
	public void Division() {
		int division;
		
		if(val2==0) {
			System.out.println("No se puede dividir por 0");
		}else {
			division=val1/val2;
			System.out.println(val1+" / "+val2+" = "+division);
		}
		
		
	}
	
	public static void main(String[]args) {
		
		Operaciones operacion1=new Operaciones();
		operacion1.Inicializar();
		operacion1.Suma();
		operacion1.Resta();
		operacion1.Multiplicacion();
		operacion1.Division();
		
		
	}
	
	
}
