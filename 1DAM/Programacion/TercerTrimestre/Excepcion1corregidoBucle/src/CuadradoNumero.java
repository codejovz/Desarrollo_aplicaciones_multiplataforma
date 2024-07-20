import java.util.InputMismatchException;
import java.util.Scanner;


public class CuadradoNumero {
	
	public static void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		int num;
		boolean continua;
		do {
			try {
				continua= false;
				System.out.println("Introduce un numero entero: ");
				num=teclado.nextInt();
				int cuadrado=num*num;
				System.out.println("El cuadrado de "+num+" es: "+cuadrado);
				
			}catch(InputMismatchException ex){
				
				System.out.println("Tienes que introducir un entero obligatoriamente");
				teclado.next();
				continua=true;
			}

			
		}while(continua);

	}

}
