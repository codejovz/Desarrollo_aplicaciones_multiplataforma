package practicaExamenCharAtEindexOf;

import java.util.Scanner;

public class Comprobar {
	protected Scanner teclado;
	protected String correo;
	
	public Comprobar() {
		
		teclado=new Scanner(System.in);
		
		
	}
	
	void cargar() {
		
		System.out.println("Introduce el correo: ");
		correo=teclado.nextLine();
		
	}

	 void comprobar() {
		 
		 int indiceArroba=correo.indexOf('@');
		 
		 if (indiceArroba!=-1 && indiceArroba !=0 && indiceArroba!=correo.length()-1) {
			 System.out.println("El correo es valido.El arroba esta en la posicion "+indiceArroba);
			 System.out.println("Su dominio es: "+correo.substring(indiceArroba+1));
			 System.out.println(correo.length()-1);
		 }
		 
	 }
	
	
	public static void main(String[]args) {
		
		Comprobar cm1= new Comprobar();
		cm1.cargar();
		cm1.comprobar();
	}
	
	
}

	
	


