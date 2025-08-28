import java.util.Scanner;
import java.util.InputMismatchException;

public class CuadradoNumero {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		int num;
		
		try {
			System.out.println("Introduce un valor entero:");
			num=teclado.nextInt();
			int cuadrado=num*num;
			System.out.println("El cuadrado de "+num+" es "+cuadrado);
			
		}catch(InputMismatchException ex){
			System.out.println("Debe introducir obligatoriamente un numero entero.");
		}
		
	}
	
}
