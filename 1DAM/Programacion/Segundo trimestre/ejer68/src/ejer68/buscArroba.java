package ejer68;

import java.util.Scanner;

public class buscArroba {
	
	
	public static void main(String[]args) {
		Scanner teclado= new Scanner(System.in);
		String email;
		
		char arroba='@';
		System.out.println("Introduce un correo electronico: ");
		email=teclado.next();

		int cont=0, longitud=email.length();
		int pos=-1;
		for(int x=0;x<longitud;x++) {
			char caracter=email.charAt(x);
			if(caracter==arroba) {
				cont=cont+1;
				pos=x;
			}
			
		}
		
		if(cont==1) {
			if(pos>0 && pos<email.length()-1) {
				System.out.println("Dirección correcta!");
			}else {
				System.out.println("Direccion incorrecta.");
			}
		}else {
			System.out.println("Direccion incorrecta.");
		}
		
		
		
	}
	
	
	
	
	
	
	

}
