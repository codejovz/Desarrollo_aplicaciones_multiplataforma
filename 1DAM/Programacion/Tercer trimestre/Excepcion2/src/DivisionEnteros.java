import java.util.Scanner;
import java.util.InputMismatchException;
public class DivisionEnteros {
	
	public static void main(String[]args) {
		Scanner teclado= new Scanner(System.in);
		
		try {
			int num1,num2;
			System.out.println("Introduce el num1");
			num1=teclado.nextInt();
			System.out.println("Introduce el num2: ");
			num2= teclado.nextInt();
			int resu=num1/num2;
			System.out.println(num1+"/"+num2+"="+resu);
		}catch(InputMismatchException ex) {
			System.out.println("Debes introducir numero entero obligatoriamente");
		}catch(ArithmeticException ex){
			System.out.println("No hagas cosas raras coño.");
		}
	}
}
