package libre1ejer;

/*Diseñar una aplicación que calcule la longitud y el área de una circunferencia. 
Para ello, el usuario debe introducir el radio (que puede contener decimales).
Longitud = 2𝜋 ∙ 𝑟𝑎𝑑𝑖𝑜
Á𝑟𝑒𝑎 = 𝜋 ∙ 𝑟𝑎𝑑𝑖𝑜2

*
*/
import java.util.Scanner;

public class Longareacircun {
	
	
	public static void main(String[]args) {
		Scanner teclado= new Scanner(System.in);
		
		double radio,longitud,area;
		
		System.out.println("Introduce el radio: ");
		radio=teclado.nextDouble();
		
		longitud=2*3.14*radio;
		area=3.14*(radio*radio);
		
		System.out.println("La longitud es: "+longitud);
		System.out.println("El area es: "+area);
		
	}
	
}
