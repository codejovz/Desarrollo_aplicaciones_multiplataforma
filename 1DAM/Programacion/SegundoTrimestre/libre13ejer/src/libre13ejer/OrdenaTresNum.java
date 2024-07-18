package libre13ejer;
/*Ordenar tres numeros sin el uso de listas*/
import java.util.Scanner;

public class OrdenaTresNum {
	
	public static void main(String[]args) {
		
		int num1,num2,num3,primer,segun,tercer;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el numero 1: ");
		num1=teclado.nextInt();
		System.out.println("Introduce el numero 2: ");
		num2=teclado.nextInt();
		System.out.println("Introduce el numero 3: ");
		num3=teclado.nextInt();
		
		if (num1>num2&&num1>num3) {
			System.out.print(num1);
		}else if(num2>num3&&num2>num1) {
			System.out.print(num2);
		}else{
			System.out.print(num3);
		}
		
		
		
		System.out.print(" > ");
		/*Para el de en medio*/
		if (num1>num2&&num1<num3) {
			System.out.print(num1);
		}else if(num1>num3&&num1<num2) {  
			System.out.println(num1);/*num1*/
		}else if(num2>num1&&num2<num3) {
			System.out.print(num2);
		}else if(num2>num3&&num2<num1) {
			System.out.print(num2);
		}else {
			System.out.print(num3);
		}
		
		
		System.out.print(" > ");
		
		
		/*Para el menor*/
		
		if (num1<num2&&num1<num3) {
			System.out.print(num1);
		}else if(num2<num3&&num2<num1) {
			System.out.print(num2);
		}else{
			System.out.print(num3);
		}
		
		
	}
	

}
