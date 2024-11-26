
import java.util.Scanner;

public class CuadradoNumero {
	
	public static void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		int num;
		System.out.println("Introduce un valor entero:");
		num=teclado.nextInt();
		int cuadrado= num * num;
		System.out.println("El cuadrado de "+num+" es: "+cuadrado);
		
	}
}




