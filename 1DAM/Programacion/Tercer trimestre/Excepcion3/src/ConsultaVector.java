import java.util.Scanner;
//import java.util.InputMismatchException;
import java.util.*;




public class ConsultaVector {

	public static void main(String[]args) {
		Scanner teclado= new Scanner(System.in);
		int[] vec= {20,40,60,55,77,44,88,99,55,48};
		
		
		try {
			System.out.println("Introduce un valor entre el 0 y el 9: ");
			int indice=teclado.nextInt();
			System.out.println("En el vector se almacena en la posicion "+indice+" el valor: "+vec[indice]);

			
		}catch(InputMismatchException ex) {
			System.out.println("Introduce un numero entero.");
		}catch(IndexOutOfBoundsException ex) {
			System.out.println("El valor debe estar entre el 0 y el 9");
		}
	
	}
	
	

}
