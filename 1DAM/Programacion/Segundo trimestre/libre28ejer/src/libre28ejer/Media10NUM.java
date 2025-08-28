package libre28ejer;

import java.util.Scanner;

public class Media10NUM {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		do {
			System.out.println("Introduce un num(0 finaliza): ");
			valor=teclado.nextInt();
			if(valor>=10) {
				System.out.println("Tiene tres digitos");
			}else if(valor>=10) {
				System.out.println("Tiene dos digitos");
			}else {
				System.out.println("Tiene 1 digito");
			}
			
		}while(valor!=0);
		System.out.println("Gracias por usar el programa!");
	}
	
	

}
